package xyz.ksevo.accountbook.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.ksevo.accountbook.condition.AbRecordCondition;
import xyz.ksevo.accountbook.dto.AbRecordDto;
import xyz.ksevo.accountbook.entity.AbRecord;
import xyz.ksevo.accountbook.entity.AbRecordTag;
import xyz.ksevo.accountbook.exception.AccountBookException;
import xyz.ksevo.accountbook.mapper.AbRecordMapper;
import xyz.ksevo.accountbook.util.AbAssist;
import xyz.ksevo.accountbook.util.AbConst;
import xyz.ksevo.kef.base.service.BaseService;
import xyz.ksevo.kef.common.CommonAssist;
import xyz.ksevo.kef.common.Const;
import xyz.ksevo.kef.common.model.PageDto;
import xyz.ksevo.kef.common.util.BeanUtil;
import xyz.ksevo.kef.common.util.StringUtil;
import xyz.ksevo.kef.mybatisplus.common.MpAssist;

import java.util.Arrays;
import java.util.List;

/**
 * User: Kyll
 * Date: 2024-08-10 15:15
 */
@Slf4j
@AllArgsConstructor
@Service
public class AbRecordService extends BaseService<AbRecordMapper, AbRecord> {
    private final AbRecordTagService abRecordTagService;

    public PageDto<AbRecordDto> findPage(AbRecordCondition condition) {
        return MpAssist.toPageDto(baseMapper.selectForDto(MpAssist.toIPage(condition), condition));
    }

    @Transactional
    public String create(AbRecordDto abRecordDto) {
        AbRecord abRecord = BeanUtil.cast(abRecordDto, AbRecord.class);
        abRecord.setCode(CommonAssist.generateCode(abRecord));

        if (save(abRecord)) {
            updateTag(abRecord.getCode(), abRecordDto.getTagCodes());
        }

        return abRecord.getCode();
    }

    @Transactional
    public String update(AbRecordDto abRecordDto) {
        AbRecord abRecord = getByCode(abRecordDto.getCode());
        if (abRecord == null) {
            throw new AccountBookException(String.format("AbRecord code %s is not exists", abRecordDto.getCode()));
        }

        BeanUtil.copy(abRecord, abRecordDto);
        if (updateById(abRecord)) {
            updateTag(abRecord.getCode(), abRecordDto.getTagCodes());
        }

        return abRecord.getCode();
    }

    @Transactional
    public boolean delete(List<String> codes) {
        abRecordTagService.remove(new QueryWrapper<AbRecordTag>().in(AbConst.EC_RECORD_CODE, codes));
        return removeBatchByIds(codes);
    }

    private void updateTag(String recordCode, String tagCodes) {
        abRecordTagService.remove(new QueryWrapper<AbRecordTag>().eq(AbConst.EC_RECORD_CODE, recordCode));
        abRecordTagService.saveBatch(
                Arrays.stream(StringUtil.split(tagCodes, ","))
                        .map(tagCode -> AbAssist.createAbRecordTag(recordCode, tagCode))
                        .toList()
        );
    }

    private AbRecord getByCode(String code) {
        return getOne(new QueryWrapper<AbRecord>().eq(Const.EC_CODE, code));
    }
}
