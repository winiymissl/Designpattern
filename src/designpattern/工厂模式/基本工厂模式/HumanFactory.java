package designpattern.工厂模式.基本工厂模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class HumanFactory extends AbstractFactory {

	@Override
	public <T extends Human> T create(Class<T> clazz) {
		/**
		 * 使用反射创建对象
		 * */
		Human human = null;
		try {
			human = (T) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) human;
	}
}