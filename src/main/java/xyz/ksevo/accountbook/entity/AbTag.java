package xyz.ksevo.accountbook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.ksevo.kef.base.entity.impl.BaseEntity;

/**
 * User: Kyll
 * Date: 2024-08-10 15:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("ab_tag")
public class AbTag extends BaseEntity<Long> {
    @TableId(type = IdType.INPUT)
    private Long id;
    private String code;
    private String name;
}
