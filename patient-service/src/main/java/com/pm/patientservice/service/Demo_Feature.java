package com.pm.patientservice.service;

import java.util.HashMap;

public class Demo_Feature {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("Ram", "12");
		map.put("shyam", "122");
		map.put("Monya", "123");
		
		map.forEach((x,y)->System.out.println(x+" "+y));
	}
	

}
