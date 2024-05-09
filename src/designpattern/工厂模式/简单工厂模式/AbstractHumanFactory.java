package designpattern.工厂模式.简单工厂模式;

import designpattern.工厂模式.基本工厂模式.Human;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class AbstractHumanFactory {
	public static <T extends Human> Human createHuman(Class<T> clazz) {
		Human human = null;
		try {
			human = (Human) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return human;
	}
}