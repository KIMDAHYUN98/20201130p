package com.yedam.collection;

public class InterfaceExample4 {
	public static void main(String[] args) {
		
		MyInterface mi = null;

		// 매개값의 합
		mi = (num1, num2) -> num1 + num2; // return에 식이 하나일 경우 중괄호 + return 생략 가능
		
		int result = mi.run(10, 20); // return 값에 따라 run이 할당 받는 값이 달라짐
		System.out.println("결과 값 : " + result);
		
		mi = (num1, num2) -> num1 * num2;
		result = mi.run(10, 20);
		System.out.println("결과 값 : " + result);
		
		// 두 개의 변수(직사각형의 가로, 세로) -> 넓이는 기능 구현
		
		mi = (num1, num2) ->  num1 * num2;
		result = mi.run(20, 30);
		System.out.println("직사각형 넓이 : " + result);
	}

}
