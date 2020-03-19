package com.itlike.demo1;

/**
 * @ProjectName: SpringPro6
 * @Package: com.itlike.demo1
 * @ClassName: GoodsDao
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 10:57
 * @Version: 1.0
 */
public interface GoodsDao {
    /**
     * save method
     */
    public void save();

    /**
     * update method
     * @return string
     */
    public String update();

    /**
     * delete method
     */
    public void delete();

    /**
     * find method
     */
    public void find();
}
