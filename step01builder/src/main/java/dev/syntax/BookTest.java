package dev.syntax;

public class BookTest {

	public static void main(String[] args) {
		Book b1  =  new Book();
		
		b1.setName("노인과 바다");
		b1.setName("헤밍웨이");
		
		Book b2 = new Book("시지프 신화","알바르 카뮈","민용사");
		
		Book b3 = new Book("어린왕자","생택쥐페리");
		
		Book b4 = new Book.BookBuilder().name("어린왕자").build();
	}

}
