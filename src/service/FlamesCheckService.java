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
		int name1_length=name1.length();
        int name2_length=name2.length();
        int count_common=0;
        
        for(int i=0; i<name1_length;i++)
        {
            for(int j=0; j<name2_length;j++)
            {
                if(name1.charAt(i) == name2.charAt(j))
                {
                    count_common+=2;
                }
            }
        }
        int left_letters=name1_length+name2_length-count_common;
       
        StringBuilder flames = new StringBuilder("flames");
        
        char result=0;
        
        while(flames.length()!=1)
        {
        	
            int y = left_letters% flames.length(); 
            String temp;
            
            if(y!=0)
            {
                temp = flames.substring(0, y-1)+flames.substring(y); // taking substring (counting purpose)
                
            }
            else
            {
                temp = flames.substring(0, flames.length()-1); // taking substring (counting purpose)
                
            }
            System.out.println("-->"+temp);
            flames = new StringBuilder(temp);
            result = flames.charAt(0);
        }
        return result;
        
        
        
	}
		
}
	
