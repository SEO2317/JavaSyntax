package dev.syntax.step01.primitive;

//원시 타입(기본 자료형, Primitive type)만 필드로 가지고 있는 클래스
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
