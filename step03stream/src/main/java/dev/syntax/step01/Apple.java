package dev.syntax.step01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Apple {
	int weight;
	String Color;
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", Color=" + Color + "]";
	}
	
	
	
	
}
