package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService {
	public static int removeCharacter(String name_1,String name_2) {
		StringBuilder n1 = new StringBuilder(name_1);
		StringBuilder n2 = new StringBuilder(name_2);
		
		for(int i=0;i<n1.length();i++) {
			for(int j=0;j<n2.length();j++) {
				if(n1.charAt(i)==n2.charAt(j)) {
					n1.deleteCharAt(i);
					n2.deleteCharAt(j);
					i = 0;
					j=0;
				}
			}
		}
		int totalLength = n1.length() + n2.length();
		return totalLength;
	}
	
	public char Flames(String name_1,String name_2) {
		StringBuilder flame = new StringBuilder("flames");
		int index,flamesIndex;
		flamesIndex = removeCharacter(name_1,name_2);
		flamesIndex = flamesIndex-1;
		
		while(flame.length()!=1) {
			if (flamesIndex >= 6)
				index = flamesIndex % flame.length();
			else
				index = flamesIndex;

			flame.deleteCharAt(index);
			StringBuilder newFlame = new StringBuilder((flame.substring(index) + flame.substring(0, index)));
			flame = newFlame;
		}
		System.out.println(flame.charAt(0));
		return flame.charAt(0);
		
	}
	
}