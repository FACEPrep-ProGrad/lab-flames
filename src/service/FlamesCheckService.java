package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1,String name2){
		if(name1==null||name2==null)
			return 'a';
		System.out.println("Your name is "+name1+"\n"+"Your Partner name is "+name2);
		name1.toLowerCase();
		name2.toLowerCase();
		char flames[]= {'f','l','a','m','e','s'};
		char name1arr[]=name1.toCharArray();
		char name2arr[]=name2.toCharArray();
		int count=name1.length()+name2.length();
		int flamesLength=6,index=0;
		for(index=0;index<name1arr.length;index++)
		{
			for(int index2=0;index2<name2arr.length;index2++)
			{
				if(name1arr[index]==name2arr[index2])
				{
					name1arr[index]='*';
					name2arr[index2]='*';
					count-=2;
					break;
				}
			}
		}
		index=0;
		while(flamesLength>=1)
		{
			int currentCount=count;
			while(currentCount>0)
			{
				index=(index+1)%flamesLength;
				currentCount--;
			}
			if(index==0)
				index=flamesLength-1;
			else
				index--;
			for(int index2=index;index2<flamesLength-1;index2++)
			{
				flames[index2]=flames[index2+1];
			}
			flamesLength--;
			
		}
		String relation="";
		switch(flames[0])
		{
		case 'a':
			relation="Affectionate";
			break;
		case 'e':
			relation="Enemies";
			break;
		case 'f':
			relation="Friends";
			break;
		case 'm':
			relation="Married";
			break;
		case 'l':
			relation="Lovers";
			break;
		case 's':
			relation="Sisters";
			break;
		}
		System.out.println("You two are "+relation+"\n");
		return flames[0];
	}
}