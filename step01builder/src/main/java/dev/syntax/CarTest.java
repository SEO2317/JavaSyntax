package dev.syntax;

public class CarTest {

	public static void main(String[] args) {
		Car mustang = new Car.Builder()
				.name("¸Ó½ºÅÊ")
				.brand("Æ÷µå").build();
		
		System.out.println(mustang);

	}

}
