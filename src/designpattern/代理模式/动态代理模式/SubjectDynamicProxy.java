package designpattern.代理模式.动态代理模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class SubjectDynamicProxy extends DynamicProxy {
	public static <T> T newProxyInstance(Subject subject) {
		return (T) newProxyInstance(subject.getClass().getClassLoader(), new Class<?>[]{Subject.class}, new MyInvocationHandler(subject));
	}
}
