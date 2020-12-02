package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".length());
		System.out.println("abcde".length()); 
		
		List<String> olist = new ArrayList();
		//olist.add(10); // 숫자타입은 담을 수 없음
		olist.add("Hello");
		
		for(Object str : olist) {
			String s = (String) str;
			System.out.println(s);
		} 
		
		List<String> list = new ArrayList<>(); // 양쪽의 타입이 항상 같아야 함
		list.add(new String("Hello"));
		list.add(new String("World"));
		list.add("Welcome");
		
		list.get(1);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		Iterator<String> iter = set.iterator(); // 리턴되는 타입이 어떤 요소가 담겨져 있느냐에 따라 다름 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		Set<Fruit> fruits = new HashSet<>(); // 중복된 값이 무엇인가
		fruits.add(new Fruit("Apple", 1000));
		fruits.add(new Fruit("Banana", 1500));
		fruits.add(new Fruit("Orange", 1500)); // 세 개의 인스턴스를 담음
		fruits.add(new Fruit("abcde", 1000));
		//
		
		Iterator<Fruit> fiter = fruits.iterator(); // 반복자를 데리고 옴
		while(fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName()+ " - " + fruit.getPrice());
		}
		
	}

}
