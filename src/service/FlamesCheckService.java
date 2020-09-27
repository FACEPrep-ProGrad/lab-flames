package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value


public class  FlamesCheckService{
	public char findFlames(String name1,String name2) {
		StringBuilder str1 = new StringBuilder(name1);
		StringBuilder str2 = new StringBuilder(name2);
		String str="";
		int a=str1.length();
		int b=str2.length();
		for(int i=0;i<a;i++) {
			 for (int j=0;j<b;j++){
			if(str1.charAt(i)==str2.charAt(j)) {
				str1.setCharAt(i,'0');
				str2.setCharAt(j,'0');
			}
		}
	}
	int count=0;
	str=str1.append(str2).toString();
	for(int i=0; i<str.length();i++) {
		if(str.charAt(i)!='0'){
            count++;
	}
}
	String flames="flames";
	StringBuilder sb3=new StringBuilder(flames);
	char flameResult=0;
	
	while(sb3.length()!=1) {
		int y1=count%sb3.length();
		String temp;
		
		if (y1!=0) {
			temp=sb3.substring(y1)+sb3.substring(0,y1-1);		
		}
		else {
			temp=sb3.substring(0,sb3.length()-1);		
		}
		sb3=new StringBuilder(temp);
		flameResult=sb3.charAt(0);
	}
	System.out.print(flameResult);
	return flameResult;
}
}

