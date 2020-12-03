package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {

	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), 
													 new Student("Hwang", 95, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	public static void printInt(ToIntFunction<Student> func) {
		// = Function<Student, Integer>, ToIntFunction<매개값타입> : 매개값을 integer 타입으로 반환
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static double avg(ToDoubleFunction<Student> func) { // 매개값 : Student 리턴타입 : double
		double result = 0, sum = 0;
		for(Student student : list ) {
			result = func.applyAsDouble(student);
			sum += result; // 누적
		}
		
		return sum / list.size();
		
	}
	
	
	// main
	public static void main(String[] args) {
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>() {

			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore(); // int -> double
			}
			
		});
		System.out.println("result : " + avg);
		
		System.out.println("[합계점수]");
		printInt(new ToIntFunction<Student>(){

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore() + value.getMathScore();
			}
			
		});

		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {

			public int applyAsInt(Student value) {
				return value.getEngScore();
			}

		});

		System.out.println("[학생이름-영어점수]");
		printString(new Function<Student, String>() { // printString 메소드에 매개값으로 구현된 기능을 넣음

			@Override
			public String apply(Student t) { // student 타입의 t 매개값을 받아서 string 타입으로 반환
				return t.getName() + " - " + t.getEngScore(); // getName(string)과 연산하기위해 getEngScore(int)를 문자타입으로 변환해서 연산함
			}

		});
		
		System.out.println("====================================================================");
		
		Function<String, Integer> func = null;
		func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {// 입력값은 String, 리턴값은 Integer

				return t.length(); // 입력받은 문자열 크기를 반환
			}

		};
		System.out.println(func.apply("HelloWorld"));

		BiFunction<String, String, Integer> biFunc = null; // 두 string 타입을 받고 integer 타입으로 반환

	}

}
