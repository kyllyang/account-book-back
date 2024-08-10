package xyz.ksevo.accountbook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.ksevo.kef.base.entity.impl.BaseEntity;

/**
 * User: Kyll
 * Date: 2024-08-10 16:01
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("ab_record_tag")
public class AbRecordTag extends BaseEntity<Long> {
    @TableId(type = IdType.INPUT)
    private Long id;
    private String recordCode;
    private String tagCode;
}
