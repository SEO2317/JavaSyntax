package dev.syntax;

public class BookTest {

	public static void main(String[] args) {
		Book b1  =  new Book();
		
		b1.setName("���ΰ� �ٴ�");
		b1.setName("��ֿ���");
		
		Book b2 = new Book("������ ��ȭ","�˹ٸ� ī��","�ο��");
		
		Book b3 = new Book("�����","�������丮");
		
		Book b4 = new Book.BookBuilder().name("�����").build();
	}

}