package Logical_programs;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		//4!=4*3*2*1=24
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int num1=1;
		for(int i=num;  i>=1;  i--)   //if given num is 6= 6,5,4,3,2,1
		{
			num1=num1*i;  // i*num1=num1[ 6*1=6, 6*5=30,  30*4=120,  120*3=360,  360*2=720,  720*1=720. ]
			
		}
		System.out.println("Factorial of number is "+num1);
	}

}
