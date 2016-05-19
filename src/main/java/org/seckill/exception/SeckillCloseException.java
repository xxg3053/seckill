package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by kenfo on 2016/5/19.
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
