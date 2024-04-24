package designpattern.代理模式.代理模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class Client {
	public static void main(String[] args) {
		IGamePlayer iGamePlayer = new GamePlayer();
		GamePlayerProxy proxy = new GamePlayerProxy(iGamePlayer);
		proxy.login("张三", "123");
		proxy.killBoss();
		proxy.upgrade();
	}
}
