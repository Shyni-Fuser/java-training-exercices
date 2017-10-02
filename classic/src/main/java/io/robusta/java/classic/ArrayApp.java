package io.robusta.java.classic;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {



    String[] buildEmptyArray(int size){
        String[] emptyArray = new String[size];
    	return emptyArray;
    }

    int[] buildArray(int a, int b, int c){
    	int[] array = {a, b, c};
        return array;
    }


    boolean equality(int[] array1, int[] array2){
    	
    	int length1 = array1.length;
    	int length2 = array2.length;
    	if(length1 != length2)
    	{
    		return false;
    	}
    	
    	for(int i = 0; i < length1; i++)
    	{
    		if(array1[i]==array2[i])
    		{
    			if(i == length1 - 1)
    			{
    				return true;
    			}
    			continue;
    		}
    	}
    	return false;
    }

    String asString (int [] numbers){
    	String chaine = "";
    	for(int i = 0; i < numbers.length; i++)
    	{
    		chaine += Integer.toString(numbers[i]) + ":";
    	}
        return chaine;
    }

    String asStringJoin (int [] numbers){
    	String chaine = "";
    	int length = numbers.length;
    	for(int i = 0; i < length; i++)
    	{
    		chaine += Integer.toString(numbers[i]) + ":";
    	}
    	
        return chaine.substring(0, chaine.length() - 1);
    }

    String asString (String [] strings){
    	String chaine = "";
    	int length = strings.length;
    	for(int i = 0; i < length; i++)
    	{
    		chaine += strings[i] + " ";
    	}
    	return chaine.substring(0, chaine.length() - 1);
    }

    String asString (Card [] cards){
    	System.out.println();
    	String chaine = "[";
    	int length = cards.length;
    	for(int i = 0; i < length; i++)
    	{
    		chaine += cards[i].toString() + " ";
    	}
    	chaine = chaine.substring(0, chaine.length() - 1);
    	chaine += "]";
    	
        return chaine;
    }

}
