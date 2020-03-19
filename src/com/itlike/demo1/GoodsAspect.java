package com.itlike.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @ProjectName: SpringPro6
 * @Package: com.itlike.demo1
 * @ClassName: GoodsAspect
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 11:03
 * @Version: 1.0
 */
@Aspect
public class GoodsAspect {
    @Before(value = "GoodsAspect.pointCun1()||GoodsAspect.pointCun2()")
    public void log(){
        System.out.println("日志");
    }
    @AfterReturning( value = "execution(* com.itlike.demo1.GoodsDaoImpl.update(..))",returning = "res")
    public void afterReturning(Object res){
        System.out.println("后置通知"+res);
    }
    @Around(value = "execution(* com.itlike.demo1.GoodsDaoImpl.delete(..))")
    public Object arrount(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("delete---begin");
        Object proceed = joinPoint.proceed();
        System.out.println("delete---end");
        return proceed;
    }
    @Pointcut(value = "execution(* com.itlike.demo1.GoodsDaoImpl.save(..))")
    public void pointCun1(){}
    @Pointcut(value = "execution(* com.itlike.demo1.GoodsDaoImpl.update(..))")
    public void pointCun2(){}

}
