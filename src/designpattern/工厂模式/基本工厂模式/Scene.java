package designpattern.工厂模式.基本工厂模式;

import designpattern.工厂模式.基本工厂模式.entity.YellowMan;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class Scene {
	public static void main(String[] args) {
		//创建人类
		AbstractFactory factory = new HumanFactory();
		Human human = factory.create(YellowMan.class);
		human.eat();
	}
}