package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IGenerationThreshold;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class GenerationThreshold implements IGenerationThreshold{

	Generation generation;

    public GenerationThreshold() {


    }
    public GenerationThreshold(int threshold) {
    	
    	this.generation = new Generation(100, threshold);

    }

    
    public static void main(String[] args) {
		
		
		
		for(int threshold = 0; threshold < 100; threshold++)
    	{
			GenerationThreshold app = new GenerationThreshold(threshold);
    		
    		if(!(app.generation.isLessThan50()))
    		{
    			System.out.println(threshold);
    			break;
    		}
    	}		
		return;
	}

}
