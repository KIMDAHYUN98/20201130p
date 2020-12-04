package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample1 {

	private static List<Students> list = Arrays.asList
			(
			new Students("홍길동", "남자", 80), 
			new Students("김순희", "여자", 90),
			new Students("김자바", "남자", 95), 
			new Students("박한나", "여자", 100)
			);

	public static double avg(Predicate<Students> predicate) {
		int count = 0, sum = 0;
		for (Students students : list) { // list에 담겨 있는 값의 타입이 Students 타입이다
			if (predicate.test(students)) {
				count++; // 얼마만큼 담겨 있는지 모르기 때문에 count 변수 활용해서 분모값으로 쓰임
				System.out.println(students.getName() + ", " + students.getSex() + ", " + students.getScore());
				sum += students.getScore();
			}
		}

		return (double) sum / count; // 두개의 연산이 int 타입이기 때문에 앞에 double 타입으로 casting

	}

	public static void main(String[] args) {
		
		// male Avg
		double maleAvg = avg(new Predicate<Students>() {

			public boolean test(Students t) {
				
				return t.getSex().equals("남자");
			}
		});

		System.out.println("남자 평균 점수 : " + maleAvg);

		// female Avg
		double femaleAvg = avg(t -> t.getSex().equals("여자"));

		System.out.println("여자 평균 점수 : " + femaleAvg);
	}
}
