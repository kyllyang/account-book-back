package xyz.ksevo.accountbook.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import xyz.ksevo.accountbook.condition.AbRecordCondition;
import xyz.ksevo.accountbook.dto.AbRecordDto;
import xyz.ksevo.accountbook.entity.AbRecord;

/**
 * User: Kyll
 * Date: 2024-08-10 15:14
 */
public interface AbRecordMapper extends BaseMapper<AbRecord> {
    IPage<AbRecordDto> selectForDto(IPage<AbRecordDto> page, @Param("c") AbRecordCondition condition);
}
