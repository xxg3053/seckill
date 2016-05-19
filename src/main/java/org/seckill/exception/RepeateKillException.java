package org.seckill.exception;

/**
 * 异常：运行期 编译期
 * spring事务只接受运行期异常 回滚
 *
 * 重复秒杀异常（运行期）
 * Created by kenfo on 2016/5/19.
 */
public class RepeateKillException extends SeckillException{

    public RepeateKillException(String message) {
        super(message);
    }

    public RepeateKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
