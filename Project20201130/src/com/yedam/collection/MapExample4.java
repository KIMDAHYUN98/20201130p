package com.yedam.collection;

import java.sql.Connection;
import java.util.TreeSet;

public class MapExample4 {
	public static void main(String[] args) {
		Connection conn = null;
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(50);
		tset.add(30);
		tset.add(45);
		tset.add(55);
		
		tset.first(); // 제일 첫번째 값
		tset.last(); // 제일 마지막 값
		
		System.out.println(tset.first());
		System.out.println(tset.last());
		
		System.out.println("==============================================");
		
		TreeSet<String> tstr = new TreeSet<>();
		tstr.add("Hong");
		tstr.add("Hwang");
		tstr.add("Park");
		tstr.add("Choi");
		
		//가, 나, 다 순으로 출력
		
		System.out.println(tstr.first());
		System.out.println(tstr.last());
		
		System.out.println("==============================================");
		
		// string, integer은 크다 작다의 기준이 구현 되어 있음
		
		TreeSet<Student> tstu = new TreeSet<>();
		tstu.add(new Student(100, "Hong", 70));
		tstu.add(new Student(101, "Hwang", 80));
		tstu.add(new Student(102, "Park", 90));
		
		System.out.println(tstu.first().getStudentNo() + ", " + tstu.first().getStudentName() + ", " + tstu.first().getScore());
		System.out.println(tstu.last().getStudentNo() + ", " + tstu.last().getStudentName() + ", " + tstu.last().getScore());
		
		//역순으로 정렬
		// Student Class 에 return o.studentNo - this.studentNo
		// 점수기준으로 정렬
		// Student Class 에 return this.score - o.score;
		
	}

}
