package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by kenfo on 2016/5/18.
 */
public interface SuccessKilledDao {
    /**
     *插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 查询SuccessKilled 并携带seckill对象
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWidthSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
