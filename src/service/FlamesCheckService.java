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
	public char findFlames(String string1,String string2) {
		StringBuffer name1 = new StringBuffer(string1);
		StringBuffer name2 = new StringBuffer(string2);
		
		for(int i=0;i<name1.length();i++)
		{
			for(int j=0;j<name2.length();j++)
			{
				if(name1.charAt(i)==name2.charAt(j)){
					name1.charAt(i);
					name2.charAt(j);
					i--;
					j--;
					break;
				
				}
			}
		}
        String flames_str = "flames";
        int total_lenght=name1.length()+name2.length();
        //System.out.println(string1+"  "+string2);
        while(flames_str.length()!=1)
        {
            int index = total_lenght%flames_str.length(); 
            String temp;
            
            if(index==0){
            	flames_str = flames_str.substring(0, flames_str.length()-1);
            }
            else{
            	flames_str = flames_str.substring(index,flames_str.length())+flames_str.substring(0, index-1);
            }
        }
        System.out.println(flames_str);
		
		
		
		return flames_str.charAt(0);
		
	}
	
}