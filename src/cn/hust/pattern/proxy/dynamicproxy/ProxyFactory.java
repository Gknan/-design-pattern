package cn.hust.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private static ITeacherDao target = new TeacherDao();

    /**
     * newProxyInstance(ClassLoader loader, 被代理对象的类加载器
     *   lass<?>[] interfaces, 被代理对象实现的接口
     *   InvocationHandler h) 事件处理，执行目标对象的方法时，会触发事件处理器的方法，会把当前执行的目标对象方法作为参数
     * @return
     */
    public static Object getInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        // 只拦截 teach 方法
                        if (!method.getName().contains("teach")) return method.invoke(target, args);
                        System.out.println("目标方法之前的操作.....");

//                        System.out.println(proxy);

                        // 执行目标方法
                        Object ret = method.invoke(target, args); // 第一个参数就是被代理对象

                        System.out.println("目标方法之后的操作.....");
                        return ret;
                    }
                });
    }
}
