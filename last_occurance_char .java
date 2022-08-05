package assignment_string;
import java.util.*;
public class last_occurance_char 
{
	Scanner sc=new Scanner(System.in);
	String str1;
	public void input()
	{
	System.out.println("last occurance of string the string");
	str1="jshxjsixsnixbsx";
	
	}
	public void disp()
	{
		 System.out.println("enter a character");
		 char ch=sc.next().charAt(0);
		int n1=str1.lastIndexOf(ch);
		System.out.println(n1);
	}
	
public static void main(String[] args) 
{
		last_occurance_char ob=new last_occurance_char();
		ob.input();
		ob.disp();

}

}