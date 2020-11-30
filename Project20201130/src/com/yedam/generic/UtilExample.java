package com.yedam.generic;

public class UtilExample {
	public static void main(String[] args) {
		Box<String> box = Util.boxing("Orange");
		box.get(); //string 타입을 반환
		
		Box<Integer> boxInt = Util.boxing(100); // * (100) = new Integer(100)
		boxInt.get(); //integer 타입을 반환
		
		Pair<String, Integer> p1 = new Pair<String, Integer>();
		p1.setKind("Hong1");
		p1.setModel(100);
		Pair<String, Integer> p2 = new Pair<String, Integer>();
//		Util.compare(p1, p2);
		p2.setKind("Hong2");
		p2.setModel(100);
		if(Util.compare(p1, p2)) {
			System.out.println("논리적으로 동일한 객체입니다.");
		} else {
			System.out.println("논리적으로 다른 객체입니다.");
		}
	}

}
