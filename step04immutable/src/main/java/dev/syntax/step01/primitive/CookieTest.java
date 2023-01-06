package dev.syntax.step01.primitive;

public class CookieTest {

	public static void main(String[] args) {
		//원시타입을 필드로 가지고 있는 가변(변할 수 있는) 객체(인스턴스) coco
		Cookie coo = new Cookie(2, "기본 버터");
		
		coo.setSalt(10); //객체 내부의 값을 변경 가능
		System.out.println(coo.getSalt()); //소금맛 쿠키 완성
		
		//원시 타입을 필드로 가지고 있는 불변 객체 Kie
		ImmutableCookie kie = new ImmutableCookie(3,"진한 버터");
		//kie.setSalt(20); //객체 내부의 필드값(salt)을 새로운 값을 변경 불가
	
		System.out.println(kie.getButter());
		System.out.println(kie.getSalt());
	}
	

}
