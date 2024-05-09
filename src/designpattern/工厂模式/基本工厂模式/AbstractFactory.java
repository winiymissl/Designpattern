package designpattern.工厂模式.基本工厂模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public abstract class AbstractFactory {

	public abstract <T extends Human> T create(Class<T> clazz);
}
