package com.yedam.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample3 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(101, "Hong", "HONG", 1000));
		set.add(new Employee(102, "HWang", "HWANG", 2000));
		set.add(new Employee(103, "Park", "PARK", 3000));
		set.add(new Employee(104, "Choi", "CHOI", 3500));
		
		Map<Integer, String> map = new HashMap<>();
		for(Employee emp : set) {
			map.put(emp.getEmployeeId(), emp.getLastName()); // 각 key, value 값을 가진 컬랙션 생성
		}
		
		// lastName -> key, salary -> value
		
		
	}

}
