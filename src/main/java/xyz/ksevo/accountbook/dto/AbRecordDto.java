package xyz.ksevo.accountbook.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.ksevo.kef.base.dto.BaseDto;
import xyz.ksevo.kef.common.util.DateUtil;
import xyz.ksevo.kef.common.validate.group.CreateGroup;
import xyz.ksevo.kef.common.validate.group.UpdateGroup;

import java.time.LocalDate;

/**
 * User: Kyll
 * Date: 2024-08-10 15:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AbRecordDto extends BaseDto {
    @NotBlank(groups = {UpdateGroup.class})
    private String code;
    @NotBlank(groups = {CreateGroup.class, UpdateGroup.class})
    private String channelCode;
    @NotBlank(groups = {CreateGroup.class, UpdateGroup.class})
    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    private LocalDate date;
    @NotBlank(groups = {CreateGroup.class, UpdateGroup.class})
    private Integer amount;
    private String remark;
    @NotBlank(groups = {CreateGroup.class, UpdateGroup.class})
    private String tagCodes;
}
