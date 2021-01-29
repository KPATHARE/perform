package com.capgemini.JUnit5Test;

public class Calculate {
	CalculateService service;
	
	public Calculate(CalculateService service) {
		this.service=service;
	}
	public long perform(int i, int j) {
		
		return service.add(i,j)*i;
	}
	

}
