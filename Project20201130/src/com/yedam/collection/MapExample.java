package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; // map 클래스의 중첩 클래스
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		// Map<key, value>
		
		map.put("Hong", 15);
		map.put("Hwang", 20);
		map.put("Hong", 25); // 이전 key값과 해당 key가 같을 경우, 이전 key는 무시하고 해당 key의 값을 출력
		
		Integer val = map.get("Hong"); // 해당 하는 key의 value 값을 들고온다
		System.out.println("val : " + val);
		
		System.out.println("=============================================================");
		
		// key는 중복된 값 X
		
		// 1. KeySet()
		
		
		// 2. entrySet()
		Set<Entry <String, Integer>> entrySet1 = map.entrySet();
		for(Entry<String, Integer> ent1 : entrySet1) {
			System.out.println("key : " + ent1.getKey() + ", val : " + ent1.getValue());
		}
		
		
		System.out.println("=============================================================");
		
		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");
		String result = mapInt.get(10); // 결과값은 string type
		System.out.println("result : " + result);
		
		System.out.println("=============================================================");
		
		Set<Integer> set = mapInt.keySet(); // mapInt 중 key 값을 들고와서 set 클랙션에 값을 담는다
		for(Integer num : set) {
			System.out.println("key : " + num + ", val : " + mapInt.get(num)); // mapInt.get(num) = value
		}
		
		Set<String> set1 = map.keySet();
		for(String str : set1) {
			System.out.println("key : " + str + ", value : " + map.get(str));			
		}
		
		Set<Entry<Integer, String>> entrySet = mapInt.entrySet(); // entry : key, value / key, value 가져와서 set 클랙션?에 담는다......?
		for(Entry<Integer, String> ent : entrySet) {
			System.out.println("key : " + ent.getKey() + ", val : " + ent.getValue()); 
			//getkey 와 getvalue의 메소드로 key와 value 값을 들고옴
		}
	}

}
