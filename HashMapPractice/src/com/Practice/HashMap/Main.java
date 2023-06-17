package com.Practice.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
	public static void main(String[] args) {

		List<StudentEntity> list = new ArrayList<>();

		StudentEntity entity1 = new StudentEntity("Dikshant", "dikshant51015@", 21);
		list.add(entity1);

		StudentEntity entity2 = new StudentEntity("Meethu", "meethu515@", 20);
		list.add(entity2);

		StudentEntity entity3 = new StudentEntity("Kamlesh", "kaim015@", 23);
		list.add(entity3);

		StudentEntity entity4 = new StudentEntity("Vivek", "vivek@", 22);
		list.add(entity4);

		
		Map<Integer, String> map = new HashMap<>();
		for (StudentEntity s : list) {

			map.put(s.getAge(), s.getName());

		}
		System.out.println(map);

	}
}