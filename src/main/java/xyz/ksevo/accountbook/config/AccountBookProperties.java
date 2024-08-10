package xyz.ksevo.accountbook.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * User: Kyll
 * Date: 2024-08-10 16:51
 */
@Getter
@Setter
@ConfigurationProperties(prefix = AccountBookProperties.PREFIX)
public class AccountBookProperties {
    public static final String PREFIX = "kef.account-book";
}
