package designpattern.策略模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
public class Scene {
	public static void main(String[] args) {
		Context context = new Context(new MiaoJiFly());
		context.operate();

	}
}
