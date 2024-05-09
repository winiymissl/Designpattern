package designpattern.工厂模式.基本工厂模式.entity;

import designpattern.工厂模式.基本工厂模式.Human;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class YellowMan implements Human {
	@Override
	public void talk() {
		System.out.println("黄种人 talk");
	}

	@Override
	public void eat() {
		System.out.println("黄种人 eat");
	}

	@Override
	public void hear() {
		System.out.println("黄种人 hear");
	}
}
