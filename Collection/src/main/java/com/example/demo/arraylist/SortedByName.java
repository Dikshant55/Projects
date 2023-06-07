package com.example.demo.arraylist;

import java.util.Comparator;

public class SortedByName implements Comparator<Teacher> {

	public int compare(Teacher a,Teacher b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}

	

}
