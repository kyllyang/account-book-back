package xyz.ksevo.accountbook.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import xyz.ksevo.accountbook.dto.AbTagDto;
import xyz.ksevo.accountbook.entity.AbTag;
import xyz.ksevo.accountbook.mapper.AbTagMapper;
import xyz.ksevo.kef.base.service.BaseService;
import xyz.ksevo.kef.common.Const;
import xyz.ksevo.kef.common.util.BeanUtil;

import java.util.List;

/**
 * User: Kyll
 * Date: 2024-08-10 15:15
 */
@Slf4j
@Service
public class AbTagService extends BaseService<AbTagMapper, AbTag> {
    public List<AbTagDto> findList() {
        return BeanUtil.cast(list(new QueryWrapper<AbTag>().orderByAsc(Const.EC_ID)), AbTagDto.class);
    }
}
