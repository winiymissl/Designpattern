package designpattern.工厂模式.单例工厂模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class Scene {
	public static void main(String[] args) {
		/*
		 * 使用反射
		 * */
		Singleton singleton = SingletonFactory.getSingleton();
		Singleton singleton1 = SingletonFactory.getSingleton();
		System.out.println(singleton);
		System.out.println(singleton1);
	}
}
