package service;
import java.util.*;
import java.lang.*;
import java.io.*;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value


public class FlamesCheckService{
	public char findFlames(String name1,String name2) {
		char result = ' ';
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		int[] frequency_name1 = new int[26];
		int[] frequency_name2 = new int[26];
		for(int i = 0;i < name1.length();i++) {
			int ascii = name1.charAt(i);
			ascii =ascii-97;
			frequency_name1[ascii]++;
		}
		System.out.print(name1+" "+name2);
		for(int i = 0;i < name2.length();i++) {
			int ascii = name2.charAt(i);
			ascii =ascii-97;
			frequency_name2[ascii]++;
		}
		int len = 0;
		for(int i = 0;i < 26;i++) {
			len += Math.abs(frequency_name1[i]-frequency_name2[i]);
		}
		
		ArrayList<Character> flames = new ArrayList<Character>();
		flames.add('f');
		flames.add('l');
		flames.add('a');
		flames.add('m');
		flames.add('e');
		flames.add('s');
		int n = flames.size();
		int index = 0;
		while(n > 1) {
			int i = (len+index-1)%n;
			flames.remove(i);
			index = i;
			n--;
		}
		result = flames.get(0);
		return result;
	}
}
