package com.driver;

public class Main {
	public static void main(String[] args) {
		RWOnly rwOnly = new RWOnly();
		//rwOnly.name ="Krishna";
		//System.out.println(rwOnly.name);
		rwOnly.setName("Nanduri");
		System.out.println(rwOnly.getName());
	}
  
}