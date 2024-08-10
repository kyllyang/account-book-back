package xyz.ksevo.accountbook.condition;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import xyz.ksevo.kef.common.model.Pagination;
import xyz.ksevo.kef.common.util.DateUtil;

import java.time.LocalDate;

/**
 * User: Kyll
 * Date: 2024-08-10 15:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class AbRecordCondition extends Pagination {
    private Long id;
    private String code;
    private String channelCode;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    private LocalDate dateStart;
    @JsonFormat(pattern = DateUtil.PATTERN_DATE)
    private LocalDate dateEnd;
    private Integer amountStart;
    private Integer amountEnd;
    private String likeRemark;
}
