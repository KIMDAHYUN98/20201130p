package com.yedam.collection;

public class Person extends Object { //모든 클래스는 Object에 상속되어있다.
	
	private String name;
	
	public Person(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		boolean result = this.name.equals(p.name); // 이름값이 같으면 boolean 타입으로 리턴?
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
