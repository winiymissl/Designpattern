package designpattern.代理模式.动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class MyInvocationHandler implements InvocationHandler {
	Class cls = null;
	Object obj = null;

	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}
}
