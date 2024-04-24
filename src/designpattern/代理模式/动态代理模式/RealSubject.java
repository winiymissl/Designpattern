package designpattern.代理模式.动态代理模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class RealSubject implements Subject {
	@Override
	public void doSomething() {
		System.out.println("do something");
	}
}
