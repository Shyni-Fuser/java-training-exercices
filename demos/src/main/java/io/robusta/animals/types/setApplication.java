package io.robusta.animals.types;

import java.util.HashSet;

import io.robusta.animals.Pingouin;

public class setApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setApplication app = new setApplication();
		app.init();
		
	}
	public void init(){
		Pingouin john = new Pingouin("John");
		Pingouin jack = new Pingouin("John");	
		Pingouin rimbo = new Pingouin("rimbo");
		
		HashSet<Pingouin> set = new HashSet<>();
		set.add(jack);
		set.add(john);
		set.add(rimbo);
		System.out.println(set.size());
		set.add(jack);
		System.out.println(set.size());
		
	}
}
