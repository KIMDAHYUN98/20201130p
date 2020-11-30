package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple {
	
}
public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		String str = box.get();
		
		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get(); //apple 인스턴스를 받음
		
		System.out.println("end");
		
		List<Integer> list = new ArrayList<>(); // 지정한 타입으로만 사용하고 싶을 때 제네릭을 사용
//		list.add("Hello"); 
		list.add(10);
		
		List<Apple> appList = new ArrayList<>();
		appList.add(new Apple());
		
//		Box box = new Box();
//		box.set("Hello");
//		String str = (String) box.get();
//		
//		box.set(new Integer(10));
//		Integer num1 = (Integer) box.get();
//		
//		box.set(new Apple());
//		str = (String) box.get(); // set에 맞게 형태를 변환해줘야 한다

	}

}
