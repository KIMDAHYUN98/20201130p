package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("Hong"));
		persons.add(new Person("Hwang"));
		persons.add(new Person("Park"));
		persons.add(new Person("Hong")); // Hong 은 중복된 값이 아니고 다른 값이다.(주소값)
		
		Iterator<Person> iter = persons.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			
			System.out.println(person);
		}
	}

}
