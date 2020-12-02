package com.yedam.collection;

// 함수적 인터페이스 functional interface : 인터페이스에 구현할 메소드가 하나
interface Cal {
	public void multi(int num); // 추상메소드 (람다표현식을 사용하려면 추상메소드가 하나이여야 한다)
//	public void sum(); // 메소드가 두 개일 경우...람다표현식의 대상이 아니다.
}

interface Calculate {
	public void sum(int num1, int num2); // 매개값을 두 개 받음
}

public class InterfaceExample2 {
	public static void main(String[] args) {

		Calculate calcu = (int num1, int num2) -> {
			System.out.println(num1 + num2);

		};
		calcu.sum(3, 5);

		calcu = (a, b) -> {
			System.out.println(a * b);
		};
		calcu.sum(3, 5);

		
		
//		Calculate calcu = new Calculate() {
//
//			@Override
//			public void sum(int num1, int num2) {
//				System.out.println(num1 + num2);	
//			}
//			
//		};
//		calcu.sum(3, 5);

		Cal cal = (num) -> {

			int result = num * 2; // 매개변수의 값의 두 배를 출력
			System.out.println(result);
		};

		cal.multi(3);

		cal = (a) -> {

			int result = a * a;
			System.out.println(result);
		};

		cal.multi(3);
	}

}
