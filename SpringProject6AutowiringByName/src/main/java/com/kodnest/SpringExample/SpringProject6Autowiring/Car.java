package com.kodnest.SpringExample.SpringProject6Autowiring;

public class Car {
	Engine eng;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine eng) {
		super();
		this.eng = eng;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [eng=" + eng + "]";
	}

	
}
