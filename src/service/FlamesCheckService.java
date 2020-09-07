package service;

//Create a class called FlamesCheckService
//FlamesCheckService has a method findFlames to find the flames between two names
//char findFlames(String name1, String name2) takes two strings as arguments
//Your task is to calculate the flames value and return the corresponding character as output 
//You must return only the following values ['f','l','a','m','e','s']
//change the return value at the end of the method corresponding to your return value


public class FlamesCheckService{

	public char findFlames(String name1, String name2) {
	
		 int total=0;
		    StringBuffer str1=new StringBuffer(name1);
			StringBuffer str2 = new StringBuffer(name2);
				int i,j=0;
		    	int index=0;
				for (i=0;i<str1.length();i++)
				{
					char string1=str1.charAt(i);
					for (j=0;j<str2.length();j++)
					{
						char string2=str2.charAt(j);
						
						if(string1==string2)
						{
							str1.deleteCharAt(i);
		                  	str2.deleteCharAt(j);
		                  	i=0;
		                  	j=0;
						}
					}
		        }
		    total = str1.length()+str2.length();
		    StringBuffer str3=new StringBuffer("flames");
		    while(str3.length()>1)
		    {
		      for(i=0;i<total;i++)
		      {
		        index+=1;
		        if(index>str3.length())
		        {
		          index=1;
		        }
		      }
		        str3.deleteCharAt(index-1);
		        index-=1;
		    }
		    char letter = str3.charAt(0);
		    return letter;
	}
}