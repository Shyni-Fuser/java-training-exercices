package io.robusta.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class PingouinApplication {

    public static void main(String[] args) {

        new PingouinApplication().workOnPingouins();
    }

    void workOnPingouins(){
        Pingouin kowalsky = new Pingouin("Kowalsky");
        Pingouin ricoh = new Pingouin("Ricoh");
        Pingouin soldat = new Pingouin("Soldat");
        Pingouin commandant = new Pingouin("Commandant");
        Pingouin tux = new Pingouin("Tux");
        
        tux.setSpeed(88);
        commandant.setSpeed(3);
        kowalsky.setSpeed(92);
        
        ArrayList<Pingouin> list = new ArrayList<>();
        list.add(tux);
        list.add(kowalsky);
        list.add(ricoh);
        list.add(soldat);
        list.add(commandant);
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
        
        // réutilisable
        Collections.sort(list, new PingouinNameComparator());
        System.out.println(list);
        
        
        // Création d'une classe anonyme, jetable
        Collections.sort(list, new Comparator<Pingouin>() {
        	@Override
        	public int compare(Pingouin o1, Pingouin o2) {
        		return - o1.name.compareTo(o2.name);
        	}
		});        
        System.out.println(list);
        
        // Définition d'une fonction jetable : Lambda, Java 8
        Collections.sort( list, (p1,p2) -> - p1.name.compareTo(p2.name) );
        System.out.println(list);
        
        LinkedList<Pingouin> pingouins = new LinkedList<>(list);
        Collections.sort(pingouins);
        System.out.println("Linked Pingouins : "+ pingouins);
        System.out.println(pingouins.pollFirst());
        System.out.println("now linked pingouins : " + pingouins);
    }    
}
