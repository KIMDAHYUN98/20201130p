package com.yedam.collection;

interface Runnable { // 생성자, 메소드 없음
	public void run();
}

class AutoRun implements Runnable {
	public void run() {
		System.out.println("자동실행.");
	}
}

class NewRun implements Runnable {
	public void run() {
		System.out.println("새로운 실행.");
	}
}

public interface InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun(); // Runnable : 인터페이스
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() { // Runnable : 인터페이스 : 메소드 기능 정의 //

			@Override
			public void run() {
				System.out.println("익명 실행");
			}
		};
		
		runnable.run();

		runnable = () // = 매개변수
						-> System.out.println("또 다른 익명 실행"); // = 실행
		runnable.run();
		
		// 알 수 있는 내용들을 줄여서 표현식을 간단하게 표현
	}

}
