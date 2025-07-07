package com.heisy.structural.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class CGLIBProxyFactory implements MethodInterceptor {
    private TrainSell target = new TrainSell();
    public TrainSell getProxyObject() {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer =new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        return (TrainSell) enhancer.create();
    }

    /*
        intercept方法参数说明：
            o ： 代理对象
            method ： 真实对象中的方法的Method实例
            args ： 实际参数
            methodProxy ：代理对象中的方法的method实例
     */
    public TrainSell intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        TrainSell result = (TrainSell) methodProxy.invoke(target, args);
        // 另一种方式，不需要目标对象实例
        // TrainSell result = (TrainSell) methodProxy.invokeSuper(o, args);
        return result;
    }
}
