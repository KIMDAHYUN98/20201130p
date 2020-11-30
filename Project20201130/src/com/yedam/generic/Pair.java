package com.yedam.generic;

public class Pair<T, M> {
	T kind; 
	M model;
	int price;
	String name;
	
	void setKind(T kind) {
		this.kind = kind;
	}
	T getKind() {
		return kind;
	}

	void setModel(M model) {
		this.model = model;
	}
	M getModel() {
		return model;
	}
}
