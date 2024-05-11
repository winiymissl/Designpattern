package designpattern.策略模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
public class MiaoJiTurnAround implements IStrategy {
	@Override
	public void operate() {
		System.out.println("妙计 ； turnAround");
	}
}
