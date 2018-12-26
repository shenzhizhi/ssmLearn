package ceshi;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopTest {

    @Pointcut("execution(* ceshi.*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("方法之前");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("方法之后");
    }
}
