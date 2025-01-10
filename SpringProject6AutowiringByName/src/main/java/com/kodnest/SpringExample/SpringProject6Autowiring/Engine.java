package com.kodnest.SpringExample.SpringProject6Autowiring;

public class Engine {
	int engineNo;
	String engineType;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int engineNo, String engineType) {
		super();
		this.engineNo = engineNo;
		this.engineType = engineType;
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", engineType=" + engineType + "]";
	}
	

}
