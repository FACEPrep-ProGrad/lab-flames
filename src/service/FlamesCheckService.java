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
		StringBuffer string1=new StringBuffer(name1);
		StringBuffer string2=new StringBuffer(name2);
		int value1=string1.length();
		int value2=string2.length();
		
		
		
		
		label: for(int i=0;i<value1;i++)
		{
			char c=string1.charAt(i);
		
			for(int j=0;j<value2;j++)
			{
				char d=string2.charAt(j);
				if(c==d)
				{
					 
					 string1.deleteCharAt(i);
					 string2.deleteCharAt(j);
					
					 value1=string1.length();
					
					 value2=string2.length();
					 i=0;
					 j=0;
					

				}
			}

		}
		
		
		int d=(value1+value2);
		  StringBuffer string3=new StringBuffer("flames");
		  String string4=new String();
		  
		  
		  label1 :	for(int i=0;i<5;i++)
			{int n=-1,l=0,p=0;
				for(int j=1;j<=d;j++)
				{
				n++;
				l++;
				
				if(n>string3.length()-1)
					{
					char e=string3.charAt(p);
					if(l==d)
						{
						string3.deleteCharAt(p);
						
						string4=string3.substring(p,string3.length());
						
						string3.delete(p,string3.length());
						
						string3.insert(0,string4);
						
						break;
						}
						else{ p++;
						     if(p==string3.length())
						     {p=0;
						     }
	                        }
					}
				else
					{
					char e=string3.charAt(n);
					if(l==d)
						{
						string3.deleteCharAt(n);

						string4=string3.substring(n,string3.length());
					
						string3.delete(n,string3.length());
				    	
						string3.insert(0,string4);
					
				    	break;
						}
					
		    		}

	    		}
	   		 }
		  
		  
		  char result=string3.charAt(0);
		  return result;
		    
		
}
	
}