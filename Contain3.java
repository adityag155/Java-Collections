package adiiapplication;

import java.util.*;
public class Contain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("Pune",36);
		map.put("Chennai",38);
		map.put("Mumbai",30);
		map.put("Kolhapur",28);
		
		System.out.println(map);	
		
		System.out.println(map.containsKey("Mumbai"));		//t
		
		map.remove("Mumbai");
		System.out.println(map.containsKey("Mumbai"));		//f
	}

}

/*
O/P:
{Kolhapur=28, Chennai=38, Pune=36, Mumbai=30}
true
false
*/