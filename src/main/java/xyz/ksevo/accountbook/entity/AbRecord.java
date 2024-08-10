package xyz.ksevo.accountbook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.ksevo.kef.base.entity.impl.BaseEntity;

import java.time.LocalDate;

/**
 * User: Kyll
 * Date: 2024-08-10 13:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("ab_record")
public class AbRecord extends BaseEntity<Long> {
    @TableId(type = IdType.INPUT)
    private Long id;
    private String code;
    private String channelCode;
    @TableField("date_")
    private LocalDate date;
    private Integer amount;
    private String remark;
}
