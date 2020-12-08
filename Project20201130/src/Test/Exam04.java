package Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exam04 {
	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("김다현", 80, 90), 
				new Student("홍길동", 10, 20),
				new Student("김랄랄", 70, 50),
				new Student("룰룰", 15, 45));
		
		Stream<Student> Stream = list.stream();
		
		Stream.filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getmScore() + t.geteScore() < 100;
			}
			
		}).forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				t.showInfo();
				
			}
			
		});
	}

}
