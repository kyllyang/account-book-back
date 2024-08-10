package xyz.ksevo.accountbook.endpoint.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ksevo.accountbook.dto.AbTagDto;
import xyz.ksevo.accountbook.service.AbTagService;
import xyz.ksevo.kef.base.resource.BaseRest;
import xyz.ksevo.kef.common.model.ResultDto;

import java.util.List;

/**
 * User: Kyll
 * Date: 2024-08-10 16:29
 */
@Tag(name = "消费标签管理")
@AllArgsConstructor
@RestController
@RequestMapping("/ab-tag")
public class AbTagRest extends BaseRest {
    private final AbTagService abTagService;

    @Operation(summary = "获取消费标签列表")
    @PostMapping("/list")
    public ResultDto<List<AbTagDto>> list() {
        return ResultDto.success(abTagService.findList());
    }
}
