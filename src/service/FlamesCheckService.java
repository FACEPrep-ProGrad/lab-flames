package service;
import java.util.*;
class flames
{
     public static char findFlames(String name1, String name2)
     {
         name1 = name1.toLowerCase();
         name2 = name2.toLowerCase();
String n1[] = name1.split(" ");
String n2[] = name2.split(" ");
name1="";
name2="";
int len1=n1.length;
int len2=n2.length;
for(int i=0;i<len1;i++)
{
name1 = name1+n1[i];
}
for(int i=0;i<len2;i++)
{
name2 = name2+n2[i];
}
int length = name1.length()+name2.length();
boolean check[] = new boolean[name2.length()];
for(int i=0;i<name2.length();i++)
{
check[i]=false;
}
for(int i=0;i<name1.length();i++)
{
for(int j=0;j<name2.length();j++)
{
if((check[j]==false) && (name1.charAt(i) == name2.charAt(j)))
{
check[j]=true;
length = length-2;
break;
}
}
}
boolean flames_check[] = new boolean[6];
for(int i=0;i<6;i++)
{
flames_check[i] = true;
}
int count = 6;
int k=1,deleted_letters=0;
int j;
for(j=0;j<=count;j++)
{
if(k <= length)
{
if(j == count)
{
j=0;
}
if(flames_check[j] == true)
{
k = k+1;
}
}
if((k-1)==length)
{
deleted_letters = deleted_letters+1;
flames_check[j] = false;
k = 1;
}
if(deleted_letters==6)
{
if(j==0)
{
return 'f';
}
else if(j==1)
{
return 'l';
}
else if(j==2)
{
return 'a';
}
else if(j==3)
{
return 'm';
}
else if(j==4)
{
return 'e';
}
else if(j==5)
{
return 's';
}
break;
}
}
return '\0';
}
     
public static void main(String args[])
{
String name1,name2;
Scanner sc = new Scanner(System.in);
name1 = sc.nextLine();
name2 = sc.nextLine();
name1 = name1.trim();
name2 = name2.trim();
char x=findFlames( name1,  name2) ;
System.out.println(x);
}
}