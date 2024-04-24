package designpattern.代理模式.动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		// 寻找JoinPoint连接点，AOP框架使用元数据定义
		if (true) {
			/*
			 * 执行前置通知
			 * */
		}
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
}
