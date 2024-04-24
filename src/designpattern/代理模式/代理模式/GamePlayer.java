package designpattern.代理模式.代理模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class GamePlayer implements IGamePlayer {
	@Override
	public void login(String user, String password) {
		System.out.println("登录成功");
	}

	@Override
	public void killBoss() {
		System.out.println("我开始打怪");
	}

	@Override
	public void upgrade() {
		System.out.println("我开始升级");
	}
}
