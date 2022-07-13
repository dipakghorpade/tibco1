package Logical_programs;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The Given Number is Even "+a);
		}
		else {
			System.out.println("The Given NumBer is Odd "+a);
		}
		
		

	}

}
