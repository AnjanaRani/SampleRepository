package com.training.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("myName","Anjana");	
		map.put("Name1","Anu");	
		map.put("Name2","Rincy");
		map.put("Name3","Brigit");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
		
		System.out.println(key + " " + map.get(key));
		
		}
		
	}


}
 