package io.robusta.animals.types;

import java.util.ArrayList;
import java.util.List;

public class IntegersApp {

	public static void main(String[] args) {

		IntegersApp app = new IntegersApp();
		app.launch();
	}
	
	public void launch()
	{
		int i = 3, j = 4, k = 5;
		Integer a = new Integer(3);
		
		List<Integer> ints = new ArrayList<>();
		ints.add(a);
		ints.add(i);
		a = i;
		a = Integer.valueOf(3);
		ints.add(4);
		Integer myInteger = 3;
		return;
		
	}

}
