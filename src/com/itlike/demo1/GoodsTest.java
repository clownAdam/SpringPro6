package com.itlike.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ProjectName: SpringPro6
 * @Package: com.itlike.demo1
 * @ClassName: GoodsTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 11:04
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class GoodsTest {
    @Resource(name = "goodsDao")
    private GoodsDao goodsDao;
    @Test
    public void test() {
        goodsDao.save();
//        goodsDao.find();
//                goodsDao.delete();
        goodsDao.update();
//        goodsDao.delete();
    }
}
