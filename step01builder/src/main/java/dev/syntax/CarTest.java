package dev.syntax;

public class CarTest {

	public static void main(String[] args) {
		Car mustang = new Car.Builder()
				.name("�ӽ���")
				.brand("����").build();
		
		System.out.println(mustang);

	}

}
