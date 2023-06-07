package com.example.demo;

class PNB extends Bank {
	
	private int getrat=8; 
	
	
	
	public PNB() {
		super();
	}

	public PNB(int getrat) {
		super();
		this.getrat = getrat;
	}


	public int getGetrat() {
		return getrat;
	}


	public void setGetrat(int getrat) {
		this.getrat = getrat;
	}
	
}