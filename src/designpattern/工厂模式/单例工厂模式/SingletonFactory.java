package designpattern.工厂模式.单例工厂模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class SingletonFactory {
	/*
	 * 使用静态代码块
	 * */
	private static Singleton singleton;

	static {
		try {
			Class clazz = Class.forName(Singleton.class.getName());
			Constructor declaredConstructor = clazz.getDeclaredConstructor();
			declaredConstructor.setAccessible(true);
			singleton = (Singleton) declaredConstructor.newInstance();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}
}
