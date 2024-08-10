package xyz.ksevo.accountbook.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.ksevo.kef.base.dto.BaseDto;

/**
 * User: Kyll
 * Date: 2024-08-10 16:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AbTagDto extends BaseDto {
    private String code;
    private String name;
}
