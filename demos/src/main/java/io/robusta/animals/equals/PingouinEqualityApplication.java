package io.robusta.animals.equals;

import io.robusta.animals.Pingouin;

public class PingouinEqualityApplication {

	public static void main(String[] args) {
		
		Pingouin john = new Pingouin("John");
		Pingouin jack = new Pingouin("John");
		
		System.out.println(john.equals(jack));

		
	}
	
}