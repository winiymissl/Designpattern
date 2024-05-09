package designpattern.中介者模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */

public abstract class AbstractMediator {
	protected Colleague colleague;

	/*
	* 使用get和set方法注入
	* */
	public Colleague getColleague() {
		return colleague;
	}

	public void setColleague(Colleague colleague) {
		this.colleague = colleague;
	}

	public abstract void doSomething();


}
