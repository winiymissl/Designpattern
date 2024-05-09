package designpattern.工厂模式.简单工厂模式;

import designpattern.工厂模式.基本工厂模式.Human;
import designpattern.工厂模式.基本工厂模式.entity.YellowMan;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class Scene {
	public static void main(String[] args) {
		Human human = AbstractHumanFactory.createHuman(YellowMan.class);
		human.eat();
	}
}
