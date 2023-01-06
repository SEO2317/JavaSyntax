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
	
	//Java 8 이전 방식
	//모든 녹색 사과만 필터링해서 새로운 리스트로 반환
	List<Apple> greenApples =  filterGreenApples(inventory);
	System.out.println(greenApples);
	
	List<Apple> heavyApples =  filterGreenApples(inventory);
	System.out.println(heavyApples);
	
	List<Apple> greenApples2 = filterApples(inventory, Basic::isGreenApple);
	System.out.println(greenApples2);
	List<Apple> heavyApples2 = filterApples(inventory, Basic::isHeavyApple);
	System.out.println(heavyApples2);
	
	//Java 8 이후의 방식 - 람다 : 익명함수(화살표 함수는 함수의 이름이 없음)를 통한 해결방식
	List<Apple> greenApples3 = filterApples(inventory, (Apple a)-> "green".equals(a.getColor()));
	System.out.println(greenApples3);
	
	List<Apple> heavyApples3 = filterApples(inventory, (Apple a)-> a.getWeight() > 150);
	System.out.println(heavyApples3);
	
	//무게가 80 미만이고 색이 갈색인 사과 필터링 
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
	//150g 이상의 사과만 필터링해서 세로운 리스트로 반환
	public static List<Apple> filterHeavyApple(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : result) {
			if(apple.getWeight() > 150) {
				result.add(apple);
			}
	}
		return result;
}

	//Java 8 이후의
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
		
	}
	
	//메서드 함
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
