package io.robusta.animals.types;

import java.util.Arrays;

import io.robusta.animals.Pingouin;

public class ArrayApplication {

	public static void main(String[] args) {
		
		Pingouin kowalsky = new Pingouin("Kowalsky");
        Pingouin ricoh = new Pingouin("Ricoh");
        Pingouin soldat = new Pingouin("Soldat");
        Pingouin commandant = new Pingouin("Commandant");
        Pingouin tux = new Pingouin("Tux");
        
        Pingouin[] pingouins = new Pingouin[5];
        pingouins[0] = kowalsky;
        pingouins[1] = ricoh;
        pingouins[2] = soldat;
        pingouins[3] = commandant;
        pingouins[4] = tux;
        
        System.out.println(pingouins);
        System.out.println(Arrays.toString(pingouins));
        
        //Create Array
        
        // direct way
        Pingouin[] directPingouins = {kowalsky, ricoh, tux};
        Pingouin[] almostDirectPingouins = new Pingouin[]{kowalsky, ricoh, tux};
        almostDirectPingouins = new Pingouin[]{kowalsky, ricoh};
        
        int length = almostDirectPingouins.length;
        Pingouin last = almostDirectPingouins[length -1];
        
        boolean equals = "JO".length() == almostDirectPingouins.length;
        
	}

}
