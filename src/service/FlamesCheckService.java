package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	
	public char findFlames(String name1, String name2) {
		int wordLength = cutChar(name1, name2);
		//System.out.println("word length: " +  wordLength);
		
		char[] flames = {'f','l','a','m','e','s'};
			int count = 0;
			while(true) {
				
				for(int i =0; i<flames.length; i++) {
					if(flames.length == 1) {
						break;
					}
					count++;
					if(count==wordLength) {
						flames = removeTheElement(flames, i);
						i--;
						count = 0;
					}
				}
				if(flames.length == 1) {
					break;
				}
		
			}
		return flames[0];
	}
	
	int cutChar(String name1, String name2) {

		char[] name1Char = convertCharArray(name1.toLowerCase());
		char[] name2Char = convertCharArray(name2.toLowerCase());

		int i,j;
		for(i=0; i<name1Char.length;i++) {
			
			for(j=0;j<name2Char.length;j++) {
				
				if(name1Char[i] == name2Char[j]) {
					name1Char = removeTheElement(name1Char, i);
					name2Char = removeTheElement(name2Char, j);
					i--;
					break;
				}
				
			}
			
		}

		return name1Char.length + name2Char.length;
	}
	
    public static char[] removeTheElement(char[] arr, int index) 
    { 
        if (arr == null || index < 0 || index >= arr.length) { 
            return arr; 
        } 
  
        char[] anotherArray = new char[arr.length - 1]; 

        for (int i = 0, k = 0; i < arr.length; i++) { 
  
            if (i == index) { 
                continue; 
            } 
  
            anotherArray[k++] = arr[i]; 
        } 
  
        return anotherArray; 
    } 

    public static char[] convertCharArray(String str) 
    {   
        char[] ch = new char[str.length()]; 
  
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
 
        return ch;
    } 
}
