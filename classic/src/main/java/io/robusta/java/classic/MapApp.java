package io.robusta.java.classic;

import java.util.*;
import java.util.Map.Entry;
import io.robusta.java.classic.Card;

/**
 *
 * Map : We add entry with map.put(key, val) We read value with map.get(key) We
 * read keys with map.keySet() We read values with map.values() We read entries
 * with map.entrySet()
 *
 *
 */
public class MapApp {

	Map<Integer, String> buildMap(int key1, String val1, int key2, String val2) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(key1, val1);
		hm.put(key2, val2);
		return hm;
	}

	Map<Integer, String> buildMapArrays(int[] keys, String[] values) {
		Map<Integer, String> hm = new HashMap<>();
		for (int i = 0; i < keys.length; i++) {
			hm.put(keys[i], values[i]);
		}

		return hm;
	}

	Set<Integer> getKeys(Map<Integer, String> map) {
		return map.keySet();
	}

	List<Integer> getKeysAsList(Map<Integer, String> map) {
		List<Integer> list = new ArrayList<Integer>(map.keySet());
		return list;
	}

	Set<Entry<Integer, String>> getEntries(Map<Integer, String> map) {
		System.out.println(map.entrySet());
		return map.entrySet();
	}

	List<String> getValues(Map<Integer, String> map) {
		List<String> list = new ArrayList<String>(map.values());
		return list;
	}

	String[] getValuesFromMap(Map<Integer, String> map, int key1, int key2) {
		String values[] = { "", "" };
		values[0] = map.get(key1);
		values[1] = map.get(key2);
		System.out.println(values);
		return values;
	}

	List<Integer> getKeysHavingValue(Map<Integer, String> map, String value) {

		Set<Integer> keys = new HashSet<Integer>();

		for (Entry<Integer, String> entry : map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				keys.add(entry.getKey());
			}
		}
		List<Integer> list = new ArrayList<Integer>(keys);
		return list;
	}

	List<Integer> getKeysHavingValueAnyValue(Map<Integer, String> map, String... values) {
		List<Integer> list = new ArrayList<Integer>();
		for (String whatever : values) {
			List<Integer> list2 = getKeysHavingValue(map, whatever);
			for (Integer value : list2) {
				list.add(value);
			}

		}
		return list;
	}

	// TODO: move up
	String displayMap(Map<Integer, String> map) {
		// Use map.entrySet()to have nice display
		String chaine = "";
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Entry:" + entry.getKey());
			System.out.println("Value:" + entry.getValue());
			chaine += entry.getValue() + "->" + entry.getKey() + ":";
		}

		return chaine;
	}

	List<Card> getCards(Map<Integer, Character> map) {

		List<Card> list = new ArrayList<Card>();
		
		for (Entry<Integer, Character> entry : map.entrySet()) {
			
			Card card = new Card(entry.getKey(), entry.getValue());
			list.add( card );
		}

		return list;

	}

}
