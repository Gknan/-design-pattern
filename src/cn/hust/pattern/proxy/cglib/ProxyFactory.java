package cn.hust.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 1 创建工具类 Enhancer
        Enhancer enhancer = new Enhancer();
        // 2 设置代理对象的父类
        enhancer.setSuperclass(target.getClass());
        // 3 设置回调函数
        enhancer.setCallback(this);
        // 4 创建代理对象
        return enhancer.create();
    }

    // 代理对象执行方法时，会被该方法拦截，并执行内部的逻辑
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("cglib 代理对象开始执行...");

        Object ret = method.invoke(target, args);

        System.out.println("cglib 代理对象执行完成...");

        return ret;
    }
}
