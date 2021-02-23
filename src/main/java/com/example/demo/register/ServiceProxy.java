package com.example.demo.register;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author didi
 * @Date 2021/2/23
 */
public class ServiceProxy<T> implements InvocationHandler {
    private Class<T> interfaceType;

    public ServiceProxy(Class<T> intefaceType) {
        this.interfaceType = interfaceType;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用前，参数：{}" + args);
        //这里可以得到参数数组和方法等，可以通过反射，注解等，进行结果集的处理
        //mybatis就是在这里获取参数和相关注解，然后根据返回值类型，进行结果集的转换
        // System.out.println("类型" + interfaceType.getName());
        System.out.println("调用后，结果：{}" );
        return "代理执行" + args;
    }

}
    