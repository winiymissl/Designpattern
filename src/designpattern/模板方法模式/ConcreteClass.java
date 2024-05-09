package designpattern.模板方法模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class ConcreteClass extends H1 {
	@Override
	protected void run() {
		System.out.println("H1  :   run");
	}

	@Override
	protected void talk() {
		System.out.println("H1  :   talk");
	}
}
