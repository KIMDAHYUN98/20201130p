package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	static int[] scores = { 92, 95, 87, 24, 87 }; // scores : 필드

	static int maxOrMin(IntBinaryOperator oper) { // public 이나 private를 선언하지 않는 이상 int는 디폴트
		int result = scores[0];
		for (int number : scores) {
			result = oper.applyAsInt(result, number);
		}
		// 두 int 타입을 연산한 후 result로 반환
		return result;
	}

	// 메인 메소드
	public static void main(String[] args) {

		int maxValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) { // 양쪽의 매개값을 비교한 후 연산
				System.out.println("left : " + left + ", right : " + right);
				return left > right ? left : right; // left 값이 right 값보다 크면 left값 아니면 right 값을 출력
			}

		}); // end of maxValue
		System.out.println("제일 큰 값 : " + maxValue);

		int minValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				return left > right ? right : left;

			}

		}); // end of minValue
		System.out.println("제일 작은 값 : " + minValue);
	}

}
