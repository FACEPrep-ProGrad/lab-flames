package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService
{
	public  static char findFlames(String name1,String name2)
	{
		StringBuffer s1=new StringBuffer(name1);
		StringBuffer s2=new StringBuffer(name2);
		int a=s1.length();
		int b=s2.length();				
			for(int i=0;i<a;i++)
			{
				char c=s1.charAt(i);
				for(int j=0;j<b;j++)
				{
					char d=s2.charAt(j);
					if(c==d)
					{ 
						s1.deleteCharAt(i);
						s2.deleteCharAt(j);
						a=s1.length();
						b=s2.length();
						i=0;
						j=0;
					}
				}
			}
		
			int len = a+b;  
			int e = len -1;    
			StringBuffer s3 = new StringBuffer("flames");
			int len3 = s3.length();
			for(int k =0; k<5; k++) {    //iteration. as 5 letters should be striked or removed
				if(e >= len3) {         //if unique count is more than the flames length 
					e = e % len3;
				}
					s3.deleteCharAt(e);
					len3 = s3.length();
					e = e+len-1;
			}
			
		 char result=s3.charAt(0);
		 return result;	
	}
	
}