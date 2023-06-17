package com.callingMethod;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hii");
		list.add("Hello");
		list.add("Hey");

		list.forEach(m -> {
			if ("Hii".equals(list.get(0))) {
			}

		});
		System.out.println("good");
	}

}
