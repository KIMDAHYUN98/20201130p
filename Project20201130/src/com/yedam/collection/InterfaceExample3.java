package com.yedam.collection;

// 함수적 인터페이스 (functional Interface)
interface MyFunctionalInterface {
	public void run(int radius); // 구현할 메소드 하나
}

public class InterfaceExample3 {
	public static void main(String[] args) {

		MyFunctionalInterface mfi = null;

		// 1. 화면 출력(원의 넓이를 구하는 기능 구현)
		mfi = (radius) -> {
			double result = Math.PI * radius * radius; // Math.PI = 3.14
			System.out.println("원의 넓이 : " + result);
		};

		mfi.run(5);
		
		// 2. 화면 출력(밑변으로 가지는 정삼각형의 넓이를 구하는 기능 구현)

		mfi = (radius) -> {
			double result = 1.73 / 4 * radius * radius; // Math.PI = 3.14
			System.out.println("삼각형의 넓이 : " + result);
		};

		mfi.run(5);

		// 3. 화면 출력(정사각형의 넓이를 구하는 기능 구현) -- 람다식으로 표현

		mfi = (radius) -> {
			double result = radius * radius; // Math.PI = 3.14
			System.out.println("정사각형의 넓이 : " + result);
		};

		mfi.run(5);

	}
}
