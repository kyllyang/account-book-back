package xyz.ksevo.accountbook.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import xyz.ksevo.accountbook.entity.AbRecordTag;
import xyz.ksevo.accountbook.mapper.AbRecordTagMapper;
import xyz.ksevo.kef.base.service.BaseService;

/**
 * User: Kyll
 * Date: 2024-08-10 16:05
 */
@Slf4j
@Service
public class AbRecordTagService extends BaseService<AbRecordTagMapper, AbRecordTag> {
}
