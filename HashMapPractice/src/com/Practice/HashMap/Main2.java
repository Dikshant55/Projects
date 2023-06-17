package com.Practice.HashMap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {

		Map<Integer, ArrayList<String>> map = new HashMap<>();

		map.put(1, new ArrayList<String>());
		map.get(1).add("Dikshant");
		map.get(1).add("Sharma");
		map.get(1).add("Is");
		map.get(1).add("Presenting");

		map.put(2, new ArrayList<String>());
		map.get(2).add("Presentation");
		map.get(2).add("Has");
		map.get(2).add("Doing");
		map.get(2).add("By Dikshant");

		for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
			System.out.println(entry);

			if (entry.getValue().contains("By Dikshant")) {
				System.out.println("Valid");
			} else
				System.out.println("Invalid");
		}
	}
}
