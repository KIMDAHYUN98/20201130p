package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World1");
		set.add("World2");
		set.add("Welcome");

//		for (String str : set) {
//			System.out.println(str); // 순서가 뒤죽박죽, 중복X
//		}

		Iterator<String> iter = set.iterator(); // 저장된 객체를 한번씩 가져오는 반복자
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str); // 저장된 객체 수 만큼 가져온다 * str = iter.next()

		}
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(38);
		numbers.add(38);
		
		numbers.remove(38);
		
		
		int sum = 0;
		for(Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers : " + sum);
	
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(15);
		list1.add(20);
		list1.add(25);
		list1.add(30);
		list1.add(35);
		list1.add(40);
		list1.add(20);
		list1.add(25);
		
		
		int sum1 = 0;
		for(Integer i : list1) {	
			sum1 += i;			
		}
		System.out.println("전체 값의 합 :" + sum1);
	}//end of main

}
