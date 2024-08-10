package xyz.ksevo.accountbook.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * User: Kyll
 * Date: 2024-08-10 16:51
 */
@Slf4j
@MapperScan(basePackages = {"xyz.ksevo.accountbook"})
@ComponentScan(basePackages = {"xyz.ksevo.accountbook"})
@Configuration
@EnableConfigurationProperties(AccountBookProperties.class)
public class AccountBookAutoConfiguration {
}
