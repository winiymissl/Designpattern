package designpattern.访问器模式.单分派和多分派;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-01
 */
public class OldActor extends AbsActor{
	@Override
	void act(Role role) {
		System.out.println("太老了，无法演功夫戏了");
	}
}
