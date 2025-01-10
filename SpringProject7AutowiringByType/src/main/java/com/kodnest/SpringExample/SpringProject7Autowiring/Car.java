package com.kodnest.SpringExample.SpringProject7Autowiring;

public class Car {
	Engine engi;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engi) {
		super();
		this.engi = engi;
	}

	public Engine getEngi() {
		return engi;
	}

	public void setEngi(Engine engi) {
		this.engi = engi;
	}

	@Override
	public String toString() {
		return "Car [engi=" + engi + "]";
	}


}
