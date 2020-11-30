package com.yedam.generic;

public class Box<T> { // T : main 메소드 호출할 때 사용
	
	T obj; // object : 모든 클래스의 최상위, 어떤 유형이든 다 담을 수 있음
	
	void set(T obj) {
		this.obj = obj;
		
	}

	T get() {
		return obj;
	}
}
