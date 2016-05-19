package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by kenfo on 2016/5/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;
    @Test
    public void testInsertSuccessKilled() throws Exception {
        long seckillId = 1001L;
        long userPhone = 18825259878L;
        int inserCount = successKilledDao.insertSuccessKilled(seckillId,userPhone);
        System.out.println("inserCount = " + inserCount);

    }

    @Test
    public void testQueryByIdWidthSeckill() throws Exception {
        long seckillId = 1001L;
        long userPhone = 18825259878L;
        SuccessKilled successKilled = successKilledDao.queryByIdWidthSeckill(seckillId,userPhone);
        System.out.println("successKilled : " + successKilled);
        System.out.println("seckill : " + successKilled.getSeckill());
    }
}