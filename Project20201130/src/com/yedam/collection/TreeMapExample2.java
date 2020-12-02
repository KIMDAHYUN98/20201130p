package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		System.out.println("scores의 첫번째 값 : " + scores.firstEntry().getKey()); // scores의 첫번째 값
		
		NavigableMap<Integer, String> navigableMap = scores.descendingMap(); 
		// 내림차순으로 순서를 가지고 있는 인터페이스
		System.out.println("navigableMap의 첫번째 값 : " + navigableMap.firstEntry().getKey()); // navigableMap의 첫번째 값(역순)
		
		NavigableSet<Integer> nSet = scores.descendingKeySet();// 역순으로 가져온 값 중 키만 출력
		System.out.println("scores : 첫번째 키 : " + scores.firstKey());
		System.out.println("nSet : 첫번째 키 : " + nSet.first()); // 키 값만 역순으로 first 메소드를 가져옴
	
		
		System.out.println("=================================================================");
		
		// {34, 55, 26, 48, 77} 배열을 오름차순 정렬 값을 구하는 코드 구현........
		
//		int[] intAry = {34, 55, 26, 48, 77};
//		
//		for(int i=0; i<intAry.length; i++) {
//			NavigableSet<Integer> nSet1 = 
//			
//		}
		
		//navigableSet
		
		TreeSet<Integer> intAry = new TreeSet<Integer>();
		intAry.add(new Integer(34));
		intAry.add(new Integer(55));
		intAry.add(new Integer(26));
		intAry.add(new Integer(48));
		intAry.add(new Integer(77));
		
		NavigableSet<Integer> desc = intAry.descendingSet(); 
		NavigableSet<Integer> asc = desc.descendingSet();
		
		for(Integer num : asc) {
			System.out.println(num);
			System.out.println();
		}
	}
}