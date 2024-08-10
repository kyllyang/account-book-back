package xyz.ksevo.accountbook.exception;

import xyz.ksevo.kef.common.exception.BaseException;

/**
 * User: Kyll
 * Date: 2024-08-10 16:15
 */
public class AccountBookException extends BaseException {
    public AccountBookException(String message) {
        super(message);
    }

    public AccountBookException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public AccountBookException(String message, String tips) {
        super(message, tips);
    }

    public AccountBookException(String message, String tips, Throwable throwable) {
        super(message, tips, throwable);
    }
}
