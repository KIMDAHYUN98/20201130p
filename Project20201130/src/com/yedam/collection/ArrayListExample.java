package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice"); // 특정위치에 값을 넣음
		System.out.println("size : " + list.size());
		list.add(list.size(), "last"); // list.size() : 제일 마지막 인덱스 위치에 값을 추가

//		for(String str :list) {
//			System.out.println(str);
//		}

		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // get method로 해당되는 인덱스(i) 값을 출력
			System.out.println("index : " + i + ", " + list.get(i));
		}
		
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		
		int sum = 0;
		
		for(Integer num : listNum) {
			sum += num;
		}
		System.out.println("listNum : " + sum);
	}

}
