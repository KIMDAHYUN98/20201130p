package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "김다현"), 80);
		map.put(new Student(102, "이혜빈"), 90);
		map.put(new Student(201, "이나경"), 70);
//		map.put(new Student(201, "이나경"), 80); // 전부 다른 인스턴스
		map.put(new Student(103, "이혜빈"), 88);
		
		
		// 1. keySet()
		Set<Student> set = map.keySet();
		for(Student student : set) { //set : key
			System.out.println("학번 : " + student.getStudentNo() + ", 이름 : " + student.getStudentName()
			+ ", 점수 : " + map.get(student));
		}
		
		int sum = 0;
		int avg = 0;
		for(Student student : set) {
			
			sum += map.get(student);
			avg = sum / map.size();	
		}
		System.out.println("평균 : " + avg);
		
		//2. entrySet()
		
		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		for(Entry<Student, Integer> ent : entrySet) {
			System.out.println("이름 : " + ent.getKey().getStudentName() + ", " 
					+ "학번 : " + ent.getKey().getStudentNo() 
					+ ", 점수 :" + ent.getValue());
		}
		
		

		
	}

	
}
