package designpattern.中介者模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public class Colleague extends AbstractColleague {
	public Colleague(Mediator mediator) {
		super(mediator);
	}

	public void doSome() {
		/*
		 *如果无法处理
		 * 调用中介者处理
		 * */
		super.mediator.doSomething();
	}

}
