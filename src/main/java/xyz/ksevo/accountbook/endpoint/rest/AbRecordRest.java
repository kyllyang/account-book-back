package xyz.ksevo.accountbook.endpoint.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.ksevo.accountbook.condition.AbRecordCondition;
import xyz.ksevo.accountbook.dto.AbRecordDto;
import xyz.ksevo.accountbook.service.AbRecordService;
import xyz.ksevo.kef.base.resource.BaseRest;
import xyz.ksevo.kef.common.model.PageDto;
import xyz.ksevo.kef.common.model.ResultDto;
import xyz.ksevo.kef.common.validate.group.CreateGroup;
import xyz.ksevo.kef.common.validate.group.PageGroup;
import xyz.ksevo.kef.common.validate.group.UpdateGroup;

import java.util.List;

/**
 * User: Kyll
 * Date: 2024-08-10 15:19
 */
@Tag(name = "消费记录管理")
@AllArgsConstructor
@RestController
@RequestMapping("/ab-record")
public class AbRecordRest extends BaseRest {
    private final AbRecordService abRecordService;

    @Operation(summary = "分页查询消费记录")
    @PostMapping("/page")
    public ResultDto<PageDto<AbRecordDto>> page(@Validated(PageGroup.class) @RequestBody AbRecordCondition condition) {
        return ResultDto.success(abRecordService.findPage(condition));
    }

    @Operation(summary = "新建消费记录")
    @PostMapping
    public ResultDto<String> create(@Validated(CreateGroup.class) @RequestBody AbRecordDto abRecordDto) {
        return ResultDto.success(abRecordService.create(abRecordDto));
    }

    @Operation(summary = "更新消费记录")
    @PutMapping
    public ResultDto<String> update(@Validated(UpdateGroup.class) @RequestBody AbRecordDto abRecordDto) {
        return ResultDto.success(abRecordService.update(abRecordDto));
    }

    @Operation(summary = "删除消费记录")
    @PostMapping("/delete")
    public ResultDto<Boolean> delete(@RequestBody List<String> codes) {
        return ResultDto.success(abRecordService.delete(codes));
    }
}
