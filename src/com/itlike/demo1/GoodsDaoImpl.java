package com.itlike.demo1;

/**
 * @ProjectName: SpringPro6
 * @Package: com.itlike.demo1
 * @ClassName: GoodsDaoImpl
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 11:01
 * @Version: 1.0
 */
public class GoodsDaoImpl implements GoodsDao {

    @Override
    public void save() {
        System.out.println("保存操作");
    }

    @Override
    public String update() {
        System.out.println("更新");
        return "update---res";
    }

    @Override
    public void delete() {
        System.out.println("删除操作");
    }

    @Override
    public void find() {
        System.out.println("find");
    }
}
