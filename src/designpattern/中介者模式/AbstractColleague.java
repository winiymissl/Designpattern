package designpattern.中介者模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
public abstract class AbstractColleague {
	protected Mediator mediator;

	public AbstractColleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
