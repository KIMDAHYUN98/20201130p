package com.yedam.collection;

public class Fruit {
	
	private String name;
	private int price;
	
	public Fruit() {
		
	}
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
//	public int hashCode() { // 각각의 인스턴스마다 특별한 값을 가지도록 하는 메소드 / 임의의 값
//		return this.name.hashCode() + this.price;
//	}
	
	public int hashCode() {
		return this.name.length() + this.price;
	}

	@Override
//	public boolean equals(Object obj) {
////		Object obj => Fruit 클래스로 Casting
//		Fruit fruit = (Fruit) obj;
////		return super.equals(obj);
//		return this.name.equals(fruit.name) 
//				&& this.price == fruit.price; // 물리적이 아닌 논리적으로 같을 때 출력
//	}
	

	public boolean equals(Object obj) {
		Fruit fruit = (Fruit) obj;
		boolean b1 = this.name.length() == fruit.name.length();
		boolean b2 = this.price == fruit.price;
		
 		return b1 && b2;
		}
	
	//hashcode와 equals가 논리적으로 같으면 fruit 클래스에 동일한 객체라고 지정
	

}
