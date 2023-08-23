package com.Practice.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitJuiceMapWithLists {
	public static void main(String[] args) {

		Map<String, List<String>> fruitJuiceMap = new HashMap<>();

		addToMap(fruitJuiceMap, "Apple", "Apple Juice");
		addToMap(fruitJuiceMap, "Orange", "Orange Juice");
		addToMap(fruitJuiceMap, "Grapes", "Grape Juice");
		addToMap(fruitJuiceMap, "Banana", "Banana Juice");
		addToMap(fruitJuiceMap, "Pineapple", "Pineapple Juice");

		for (Map.Entry<String, List<String>> entry : fruitJuiceMap.entrySet()) {
			String fruit = entry.getKey();
			List<String> juices = entry.getValue();

			System.out.println("Fruit: " + fruit);
			System.out.println("Juices:");

			for (String juice : juices) {
				System.out.println("- " + juice);
			}

			System.out.println();
		}
	}

	private static void addToMap(Map<String, List<String>> map, String key, String value) {
		if (!map.containsKey(key)) {
			map.put(key, new ArrayList<>());
		}
		map.get(key).add(value);
	}
}
