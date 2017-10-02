package io.robusta.java.classic.pingouins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by nicorama on 28/09/2017.
 */
public class PenguinApp {

	Penguin createSimplePenguin() {

		Penguin pingouin = new Penguin("Simple");
		return pingouin;
	}

	List<Penguin> getPenguins(Penguin... p) {

		List<Penguin> list = new ArrayList<Penguin>();
		for (Penguin current : p) {
			if (current != null) {
				list.add(current);
			}
		}
		return list;
	}

	Penguin getPenguinByName(Penguin[] pingouins, String name) {

		Penguin penguin;
		for (Penguin current : pingouins) {
			if (current.getName() == name) {
				penguin = current;
				return penguin;
			}
		}
		return null;

	}

	Penguin getFastest(List<Penguin> penguins) {
		int speed = 0;
		Penguin penguin = penguins.get(0);
		for (Penguin current : penguins) {
			if (current.getSpeed() > speed) {
				penguin = current;
				speed = current.getSpeed();
			}
		}
		return penguin;
	}

	Penguin getFriend(Penguin penguin) {
		return penguin.friend;
	}

	List<Penguin> getPenguinsWithLetter(Penguin[] pengouins, String letters) {
		
		List<Penguin> list = new ArrayList<Penguin>();
		for (Penguin current : pengouins) {
			if ( current.getName().contains(letters) ) {
				list.add(current);
			}
		}
		return list;
	}

	Penguin[] getPenguinsWithLetter(List<Penguin> pengouins, String letters) {
		
		Penguin[] table = new Penguin[0];
		int index = 0;
		
		for (Penguin current : pengouins) {
			if ( current.getName().contains(letters) ) {
				
				Penguin newTable[] = new Penguin[index + 1];
				System.arraycopy(table, 0, newTable, 0, index );
				table = newTable;
				
				table[index] = current;
				index++;
			}
		}
		return table;
	}

	Object getSmallestSize(Penguin[] array, List<Penguin> list) {
		
		if(array.length < list.size())
		{
			return array;
		}
		else if(array.length > list.size())
		{
			return list;
		}
		else
		{
			return null;
		}
	}

	Set<Penguin> getFriends(Penguin[] penguins) {
		
		Set<Penguin> set = new HashSet<Penguin>();
		
		for (Penguin current : penguins) {
			if(current.friend != null)
			{
				set.add(current.friend);
			}
		}
		return set;
	}

}
