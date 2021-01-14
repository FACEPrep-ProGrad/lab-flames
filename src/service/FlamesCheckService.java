package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		String temp="";
		int comcount=0;
		for(int i=0;i<name1.length();i++) {
			for(int j=0;j<name2.length();j++) {
				if(name1.charAt(i)==(name2.charAt(j))) {
					comcount+=2;
				}
			}
		} 
		int count=name1.length()+name2.length()-comcount;
		String flamescheck="flames";
		while(flamescheck.length()!=1) {
			int templen=count%flamescheck.length();
			if(templen!=0) {
			 temp = flamescheck.substring(templen)+flamescheck.substring(0, templen-1);
			}
			else {
				temp = flamescheck.substring(0, flamescheck.length()-1);
			}
			 flamescheck = temp;
			}	
		 char res = flamescheck.charAt(0);
		 return res;
		}
		
	}
	
