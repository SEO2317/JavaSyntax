package dev.syntax.step01.primitive;

public class CookieTest {

	public static void main(String[] args) {
		//����Ÿ���� �ʵ�� ������ �ִ� ����(���� �� �ִ�) ��ü(�ν��Ͻ�) coco
		Cookie coo = new Cookie(2, "�⺻ ����");
		
		coo.setSalt(10); //��ü ������ ���� ���� ����
		System.out.println(coo.getSalt()); //�ұݸ� ��Ű �ϼ�
		
		//���� Ÿ���� �ʵ�� ������ �ִ� �Һ� ��ü Kie
		ImmutableCookie kie = new ImmutableCookie(3,"���� ����");
		//kie.setSalt(20); //��ü ������ �ʵ尪(salt)�� ���ο� ���� ���� �Ұ�
	
		System.out.println(kie.getButter());
		System.out.println(kie.getSalt());
	}
	

}