package com.zy.vehiclerepairer.exception;

/**
 * 自定义异常类
 */
public class BusinessException extends RuntimeException {
    public BusinessException() {

    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
}
