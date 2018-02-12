package com.shop.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit Spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class OrderDaoTest {
    @Resource
    private OrderDao orderDao;
    @Test
    public void insertOrder() {
        orderDao.insertOrder("1","1",1,"1",1,1,1);
    }

    @Test
    public void sec() {

        orderDao.sec(1);
    }
}