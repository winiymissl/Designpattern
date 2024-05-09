package designpattern.模板方法模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public abstract class H1 {
	public final void doSomething() {
		this.run();
		this.talk();
	}

	protected abstract void run();

	protected abstract void talk();
}
