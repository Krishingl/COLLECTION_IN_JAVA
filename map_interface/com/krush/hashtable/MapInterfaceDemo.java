package com.krush.hashtable;
//import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class MapInterfaceDemo {
   
	public static void main(String[] args) {
		   
		
		Map<String,String> map = new Hashtable<>();  //We can also take new HashMap its came from 1.2 version not synchronized.
		
		
		map.put("krishnaingle@gmail.com", "123");
		map.put("krishnaingle@gmail.com", "1234");
		map.put("shamjohari@gmail,com", "123");
		map.put("vivekchavan@gmail.com", "1234");
		
		System.out.println(map);
		
		//{shamjohari@gmail,com=123, krishnaingle@gmail.com=1234, vivekchavan@gmail.com=1234}

		
		
		
		
		
	}
}
