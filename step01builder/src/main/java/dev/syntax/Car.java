package dev.syntax;

import lombok.ToString;

@ToString
public class Car {

	private String type;
	private String brand;
	private String name;
	private int price;

	public Car(Builder builder) {
		this.type = builder.type;
		this.brand = builder.brand;
		this.name = builder.name;
		this.price = builder.price;
	}

	// inner(내부) 클래스
	public static class Builder {
		private String type;
		private String brand;
		private String name;
		private int price;

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder brand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder price(int price) {
			this.price = price;
			return this;
		}

		// 실제 인스턴스(Car) 처리 메서드
		public Car build() {
			return new Car(this);
		}
	}
}
