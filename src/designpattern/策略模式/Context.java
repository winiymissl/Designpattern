package designpattern.策略模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
public class Context {
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
}
