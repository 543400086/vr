package com.zy.vehiclerepairer.exception;

import org.springframework.boot.logging.LogLevel;

/**
 * 请求入参校验异常，该类异常不是错误
 */
public class InvalidParamException extends RuntimeException {

    public InvalidParamException(String message) {
        super(message);
    }

    public InvalidParamException(String message, Throwable cause) {
        super(message, cause);
    }
}
