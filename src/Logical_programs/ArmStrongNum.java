package Logical_programs;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");      //    153=1^3+5^3+3^3=153
		int a=sc.nextInt();
		
		int num1=0;
		for(int i=a; i>0;  i=i/10)    //  153  [ 153/10...3,    15/10.....5,  1/10.....1 ]
		{
			int rem=i%10;
			num1=num1+(rem*rem*rem);
		}
       System.out.println("ArmStong Number is "+num1); 
	}

}
