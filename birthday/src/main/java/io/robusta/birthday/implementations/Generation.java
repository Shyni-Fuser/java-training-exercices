package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IGeneration;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class Generation implements IGeneration{

    List<PeopleCollection> collections;

    public Generation(){

    }

    public Generation(int n, int collectionSize) {
        this.collections = createAllRandom(n, collectionSize);
    }

    @Override
    public PeopleCollection createRandom(int size) {
    	
    	PeopleCollection collection = new PeopleCollection(size);
    	return collection;    	
    }

    @Override
    public List<PeopleCollection> createAllRandom(int n, int size) {// call n times createRandom(size)
    	
    	List<PeopleCollection> list = new ArrayList<>(n);
    	
    	for(int index = 0; index < n; index++)
    	{
    		list.add(createRandom(size));
    	}
        
        return list;
    }

    @Override
    public List<PeopleCollection> getPeopleCollections() {
    	
        return this.collections;
    }

    @Override
    public int getNumberOfCollectionsThatHasTwoPeopleWithSameBirthday() {
        
    	int count = 0;
    	for(PeopleCollection current : this.getPeopleCollections() )
    	{
    		if(current.hasSame())
    		{
    			count++;
    		}
    	}
    	return count;
    }

    @Override
    public boolean isLessThan50() {
        int count = getNumberOfCollectionsThatHasTwoPeopleWithSameBirthday();
        if(count < 50)
        {
        	return true;
        }
        return false;
    }


}
