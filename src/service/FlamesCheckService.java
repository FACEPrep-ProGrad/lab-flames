package service;

// Create a class called FlamesCheckService
//FlamesCheckService has a method findFlames to find the flames between two names
//char findFlames(String name1, String name2) takes two strings as arguments
//Your task is to calculate the flames value and return the corresponding character as output 
//You must return only the following values ['f','l','a','m','e','s']
//change the return value at the end of the method corresponding to your return value


public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		
		int total=name1.length()+name2.length();
		int cancel=0;
		for(int i=0;i<name1.length();i++) {
			for(int j=0;j<name2.length();j++) {
				if(name1.charAt(i)==name2.charAt(j)) {
					++cancel;
					name2=name2.substring(0,j)+name2.substring(j+1,name2.length());
					break;
				}
			}
		}
		int cutting=total-(cancel*2);
		String flames = "flames";
        StringBuilder check = new StringBuilder(flames);
        
        char flameResult = 0;
        
        while(check.length()!=1)
        {
            int x = cutting%check.length(); 
            String temp;
            
            if(x!=0)
            {
                temp = check.substring(x)+check.substring(0, x-1); // taking substring (counting purpose)
                
            }
            else
            {
                temp = check.substring(0, check.length()-1); // taking substring (counting purpose)
                
            }
            check = new StringBuilder(temp);
           
        }
         flameResult = check.charAt(0);
        return flameResult;
 
 
       
                
        }
	}



