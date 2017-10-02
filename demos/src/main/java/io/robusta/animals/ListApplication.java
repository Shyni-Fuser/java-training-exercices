package io.robusta.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListApplication {
	
	Pingouin kowalsky = new Pingouin("Kowalsky");
    Pingouin ricoh = new Pingouin("Ricoh");
    Pingouin soldat = new Pingouin("Soldat");
    Pingouin commandant = new Pingouin("Commandant");
    Pingouin tux = new Pingouin("Tux");
    
	public static void main(String[] args) {
		ListApplication app = new ListApplication();
		app.launch();
		app.mix();
	}

	void launch(){
		LinkedList<Pingouin> pingouins = new LinkedList<>();
		Collections.addAll(pingouins, kowalsky, ricoh, soldat, commandant, tux);
		System.out.println(pingouins);
		
		Pingouin first = pingouins.getFirst(); // ou pingouins.get(0)
		Pingouin last = pingouins.peekLast(); // pareil
		Pingouin second = pingouins.get(1);
		
		int length = pingouins.size();
		Pingouin antePenult = pingouins.get(length -3);
		Pingouin penult = pingouins.get(length -2);
		
		if(length % 2 == 1)
		{
			Pingouin middle = pingouins.get(length/2 + 1/2);
			System.out.println(middle);
		}		
	}
	
	void mix(){
		List<Pingouin> list = new ArrayList<>();
		Collections.addAll(list, kowalsky, ricoh, soldat, commandant, tux);		
		Collections.shuffle(list);
		System.out.println(list);
		
		list = new LinkedList();
	}
}
