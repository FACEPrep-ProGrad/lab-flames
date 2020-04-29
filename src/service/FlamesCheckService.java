package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value
public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		
		name1 = name1.trim().toLowerCase();
		name2 = name2.trim().toLowerCase();
		
		StringBuilder n1 =new StringBuilder(name1);
		StringBuilder n2 = new StringBuilder(name2);
		
		//char arr[] = {'f','l','a','m','e','s'};
		int sn1 =n1.length();
		int sn2 =n2.length();
		int count = n1.length() + n2.length();
		System.out.println(count);
		
		for(int i=0; i<sn1; i++) {
			for(int j=0; j<sn2;j++) {
				if(n1.charAt(i) == n2.charAt(j)) {
					count = count - 2;
					n1.deleteCharAt(i);
					n2.deleteCharAt(j);
					sn1 = n1.length();	
					sn2 = n2.length();
					i--;
					j--;
					break;
				}
			}
		}
		
		String f = "flames";
		char ch;
		int x=0;
		StringBuffer flames = new StringBuffer(f);
		
		//count holds a number of uncommon characters
		/*
		if(count > flames.length()) {
			 x = count % flames.length();
			 x=x-1;
			 ch =f.charAt(x);
		}
		else if(count == flames.length()) {
			int c = count-1;
			ch = f.charAt(c);
		}
		else {
			 ch =f.charAt(count-1);
		}*/
		
		if(count !=0) {
			if(count > flames.length()) {
				 x = (count-1) % flames.length();
				 //x=x-1;
				 ch =f.charAt(x);
			}
			else if(count == flames.length()) {
				int c = count-1;
				ch = f.charAt(c);
			}
			else {
				 ch =f.charAt(count-1);
			}
		}
		else {
			ch =f.charAt(0);
		}
		
		System.out.println("count :"+count);
		System.out.println("Your name is "+name1);
		System.out.println("Your Partner name is "+name2);
		System.out.println(ch);
		
		switch(ch)
		{
			case 'f':
				System.out.println("You Two are Friends");
				break;
		
		
			case 'l':
				System.out.println("You Two are Love");
				break;
				
			case 'a':
				System.out.println("You Two are Affection");
				break;
				
			case 'm':
				System.out.println("You Two are Marriage");
				break;
				
			case 'e':
				System.out.println("You Two are Enemy");
					break;
				
			case 's':
				System.out.println("You Two are Siblings");
				break;			
		}				
		return ch;
	}
}
