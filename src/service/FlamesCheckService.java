package service;


// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1,String name2) {
		char[] a=name1.toCharArray();
		char[] b=name2.toCharArray();
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				if (a[i] == b[j]) {
					a[i]='@';
					b[j]='@';
					break;
				}
			}
		}
		int n=0;
		for(int i=0;i<a.length;i++) {
			if (a[i] != '@')
				n=n+1;
		}
		for(int i=0;i<b.length;i++) {
			if (b[i] !='@') {
				n=n+1;
			}
		}
		StringBuilder ans=new StringBuilder("flames");
		while (ans.length() != 1) {
			int mod=n%ans.length();
			String ans1;
			if (mod != 0) {
				ans1=ans.substring(mod)+ans.substring(0,mod-1);
			}
			else {
				ans1=ans.substring(0,ans.length()-1);
			}
			ans=new StringBuilder(ans1);
		}
		System.out.println("Your name is "+name1);
		System.out.println("Your Crush name is "+name2);
		System.out.print("Matching Character is '"+ans.charAt(0)+"' which corresponds to ");
		switch(ans.charAt(0)){
		case 'f': System.out.println("Friends");break;
		case 'l': System.out.println("Lovers");break;
		case 'a': System.out.println("Affection");break;
		case 'm': System.out.println("Marriage");break;
		case 'e': System.out.println("Enemies");break;
		case 's': System.out.println("Siblings");break;
		}
		return ans.charAt(0);
	}
}