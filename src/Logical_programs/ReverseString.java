package Logical_programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name ");
	    String a =sc.next();
	    
	    String reverse="";
	    for(int i=a.length()-1;i>=0;i--)
	    {
	    	reverse=reverse+a.charAt(i);
	    }
      System.out.println("reverse is "+reverse);
	}

}
