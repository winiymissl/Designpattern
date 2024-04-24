package designpattern.原型模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
public class Mail implements Cloneable {
	private String receiver;
	private String subject;

	public Mail(String receiver, String subject) {
		this.receiver = receiver;
		this.subject = subject;
	}

	/*
	 * 所有原型模式通用源码
	 * */
	@Override
	protected Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
