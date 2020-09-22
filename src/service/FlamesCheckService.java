package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value


public class FlamesCheckService{
	public char findFlames(String name1, String name2)
	{

        StringBuffer str1 = new StringBuffer(name1);
		StringBuffer str2 = new StringBuffer(name2);

		///remove same charaters 
		for (int i=0;i<str1.length();i++)
		{
			for (int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					str1.setCharAt(i, '0');
					str2.setCharAt(j, '0');
					
				}
			}
		}
		String n1=str1.toString();
		String n2=str2.toString();
		
		n1 =  n1.replaceAll("0","");
		n2 = n2.replaceAll("0", "");
		
		//System.out.println(n1.length()+" "+n2.length());
		int value = n1.length()+n2.length();
        //System.out.println(value);
        String flames = "flames";
        StringBuilder sb3 = new StringBuilder(flames);
        
        char flameResult = 0;
        
        while(sb3.length()!=1)
        {
            int y = value%sb3.length(); 
            String temp;
            
            if(y!=0)
            {
                temp = sb3.substring(y)+sb3.substring(0, y-1); 
                
            }
            else
            {
                temp = sb3.substring(0, sb3.length()-1);
                
            }
            sb3 = new StringBuilder(temp);
           flameResult = sb3.charAt(0);
            
        }
        return flameResult;

		
	}
		
	}


	 
	

