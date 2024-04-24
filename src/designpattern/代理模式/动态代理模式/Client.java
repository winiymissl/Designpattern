package designpattern.代理模式.动态代理模式;

import designpattern.代理模式.代理模式.GamePlayer;
import designpattern.代理模式.代理模式.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class Client {
	public static void main(String[] args) {
		/*
		 * 简单实例
		 * */
		IGamePlayer player = new GamePlayer();

		InvocationHandler handler = new MyInvocationHandler(player);
		ClassLoader cl = player.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,
				new Class[]{IGamePlayer.class}
				, handler);
		proxy.login("张三", "123456");
		proxy.killBoss();
		proxy.upgrade();
		/*
		 * 更加通用的架构
		 * */
		/*
		 * 被代理类必须要一个接口！！！
		 * 当然想像CGLIB可以实现不需要接口也可以实现动态代理的方式
		 * */
		Subject subject = new RealSubject();
		Subject s = SubjectDynamicProxy.newProxyInstance(subject);
		s.doSomething();
	}
}
