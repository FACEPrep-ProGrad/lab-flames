package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

import java.util.*;

public class FlamesCheckService{
	
	public char findFlames(String name1, String name2){
		
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		
		
		// storing all the unique characters of name1 in set
		Set<Character> wordsName1 = new HashSet<Character>();
        
		for(int i =0; i<name1.length(); i++){
        	wordsName1.add(name1.charAt(i));
        }
		
		// storing all the unique characters of name2 in set
		Set<Character> wordsName2 = new HashSet<Character>();
        
		for(int i =0; i<name2.length(); i++){
        	wordsName2.add(name2.charAt(i));
        }
        
        String name1MinusName2 = "";  // stores all the values which are in name 1 but not in name 2
        String name2MinusName1 = "";  // stores all the values which are in name 2 but not in name 1
	         
        // iterating over wordsName1 to get characters which are not in name2
        Iterator<Character> value = wordsName1.iterator();
        while (value.hasNext()) { 
            char word = value.next();
            if(!wordsName2.contains(word)){
            	name1MinusName2 += Character.toString(word);
            }
        }
        
        // iterating over wordsName1 to get characters which are not in name2
        Iterator<Character> value2 = wordsName2.iterator();
        while (value2.hasNext()) { 
            char word = value2.next();
            if(!wordsName1.contains(word)){
            	name2MinusName1 += Character.toString(word);
            }
        }
        
        int count = name1MinusName2.length() + name2MinusName1.length();
        
        
        
        String flames = "flames";
        
        // iterate over flames till we get last character from flames
        while(flames.length() > 1) {
        	String letter = "";
        	
        	// variable to keep track where the pointer lies while iterating over flames so that the character at index count
        	// can be removed
        	int flamesCount = 0;
        	
        	// iterating over flames and finding the character which lies at index count.
        	while(flamesCount < count) {
        		for(int i = 0; i<flames.length(); i++) {
        			letter = Character.toString(flames.charAt(i));
        			flamesCount+=1;
        			if(flamesCount == count) {
        				break;
        			}
            		
            	}
        	}
        	
        	
        	// removing the character which lies at index count
        	flames = flames.substring(0,flames.indexOf(letter)) + flames.substring(flames.indexOf(letter)+1);
        	
    
        }
        
        // will hold one of the letter from flames
        char finalLetter = flames.charAt(0);
        
        System.out.println("Your name: "+name1);
        System.out.println("Crush name: "+name2);
        switch(finalLetter) {
        case 'f':
        	System.out.println("You two are: \"FRIENDS\"");
        	break;
        case 'l':
        	System.out.println("You two are: \"LOVERS\"");
        	break;
        case 'a':
        	System.out.println("You two have: \"AFFECTION\"");
        	break;
        case 'm':
        	System.out.println("You two wil get: \"MARRIED\"");
        	break;
        case 'e':
        	System.out.println("You two are: \"ENEMIES\"");
        	break;
        case 's':
        	System.out.println("You two are: \"SIBLINGS\"");
        	break;
        }
        
		
		return finalLetter;
	}
}
