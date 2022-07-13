package Logical_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name ");
		 String a =sc.next();
		    
		 String reverse="";
		    
	    for(int i=a.length()-1; i>=0;i--)
	    {
	    	reverse=reverse+a.charAt(i);
	    }
	    System.out.println("Reverse is "+reverse);
	    System.out.println("=========================================");
	    
	    if(a.equals(reverse))
	    {
	    	System.out.println("String is in palindrome");
	    }
	    else {
	    	System.out.println("String is not Palindrome");
	    }
	    
		
	}

}
