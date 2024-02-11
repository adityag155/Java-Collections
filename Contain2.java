package adiiapplication;

import java.util.*;
public class Contain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet <String>fruits=new HashSet<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		boolean containsBanana=fruits.contains("Banana");
		if(containsBanana)
		{
			System.out.println("List contains Banana");
		}
		else
		{
			System.out.println("List doest not contain Banana");
		}
	}

}

/*
O/P:
List contains Banana
*/