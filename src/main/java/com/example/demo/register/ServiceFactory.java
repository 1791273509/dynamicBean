package com.example.demo.register;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author didi
 * @Date 2021/2/23
 */
public class ServiceFactory<T> implements FactoryBean<T> {
    private Class<T> interfaceType;

    public ServiceFactory(Class<T> interfaceType) {
        this.interfaceType = interfaceType;
    }

    @Override public T getObject() throws Exception {
        InvocationHandler invocationHandler = new ServiceProxy<>(interfaceType);
        return  (T)Proxy.newProxyInstance(interfaceType.getClassLoader(),new Class[]{interfaceType},invocationHandler);
    }

    @Override public Class<?> getObjectType() {
        return interfaceType;
    }
}
    