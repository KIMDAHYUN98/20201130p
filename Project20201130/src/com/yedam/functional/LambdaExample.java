package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {

			result = operator.applyAsInt(result, score); // result 와 score의 값을 비교
		}
		return result;
	}

	// 메인 메소드
	public static void main(String[] args) {

		// 최대값
		int max = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {

				return left > right ? left : right;
			}

		});

		System.out.println("최대값 : " + max);

		int min = maxOrMin((int left, int right) -> {

			int result = 0;
			if (left < right) {
				result = left;
			} else {
				result = right;

			}
			return result;

		}

		);

		System.out.println("최소값 : " + min);
	}

}

