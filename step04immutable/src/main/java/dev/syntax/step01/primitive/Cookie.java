package dev.syntax.step01.primitive;

//���� Ÿ��(�⺻ �ڷ���, Primitive type)�� �ʵ�� ������ �ִ� Ŭ����
public class Cookie {
	private int salt;
	private String butter;
	
	public Cookie(int salt, String butter) {
		super();
		this.salt = salt;
		this.butter = butter;
	}

	public int getSalt() {
		return salt;
	}
	public void setSalt(int salt) {
		this.salt = salt;
	}
	public String getButter() {
		return butter;
	}
	public void setButter(String butter) {
		this.butter = butter;
	}
	
	
}