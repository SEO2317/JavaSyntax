package dev.syntax.step01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Basic {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
				new Apple(80, "green"),
				new Apple(155, "red"),
				new Apple(200, "green")
				);
	
	//Java 8 ���� ���
	//��� ��� ����� ���͸��ؼ� ���ο� ����Ʈ�� ��ȯ
	List<Apple> greenApples =  filterGreenApples(inventory);
	System.out.println(greenApples);
	
	List<Apple> heavyApples =  filterGreenApples(inventory);
	System.out.println(heavyApples);
	
	List<Apple> greenApples2 = filterApples(inventory, Basic::isGreenApple);
	System.out.println(greenApples2);
	List<Apple> heavyApples2 = filterApples(inventory, Basic::isHeavyApple);
	System.out.println(heavyApples2);
	
	//Java 8 ������ ��� - ���� : �͸��Լ�(ȭ��ǥ �Լ��� �Լ��� �̸��� ����)�� ���� �ذ���
	List<Apple> greenApples3 = filterApples(inventory, (Apple a)-> "green".equals(a.getColor()));
	System.out.println(greenApples3);
	
	List<Apple> heavyApples3 = filterApples(inventory, (Apple a)-> a.getWeight() > 150);
	System.out.println(heavyApples3);
	
	//���԰� 80 �̸��̰� ���� ������ ��� ���͸� 
	List<Apple> weirdApples = filterApples(inventory, (Apple a)->a.getWeight() < 80 || "brown".equals(a.getColor()));
	System.out.println(weirdApples);
}
	
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
		
	}
	//150g �̻��� ����� ���͸��ؼ� ���ο� ����Ʈ�� ��ȯ
	public static List<Apple> filterHeavyApple(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : result) {
			if(apple.getWeight() > 150) {
				result.add(apple);
			}
	}
		return result;
}

	//Java 8 ������
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
		
	}
	
	//�޼��� ��
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predictor){	
		List<Apple> result = new ArrayList<>();
		for(Apple apple : result) {
			if(predictor.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}