package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value
public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		System.out.println("Person 1 name"+name1);
		String [] flames = {"f","l","a","m","e","s"};
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(flames));
		int index=0;
		String [] person1 = name1.split("");
		for(int i=0;i<person1.length;i++) {
			System.out.print(person1[i]);
		}
		String [] person2 = name2.split("");
		System.out.println();
		for(int i=0;i<person2.length;i++) {
			System.out.print(person2[i]);
		}
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(person1));
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(person2));
		for(int i=0;i<list1.size();i++) {
			if(list3.contains(list1.get(i))) {
				list3.remove(list1.get(i));
				list1.remove(i);
			}
		}
		ArrayList<String> union = new ArrayList<String>(list1);
		union.addAll(list3);
		int count = union.size()-1;
		while(list2.size()>1) {
			System.out.println("removing "+list2.get((index+count) % list2.size()));
			index = (index+count) % list2.size();
			list2.remove(index);
			System.out.println("list =  "+list2);
		}
		return list2.get(0).charAt(0);
		
	}//end of method
}//end of class
