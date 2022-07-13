package Logical_programs;

public class MultiplicationWithoutOperation {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		int sum=0;
								
		for (int i=1;i<=b;i++) //int i=1 (start from i=1)    b=5=[ 1          2          3          4           5     ]   i++
		{                               
			sum=sum+a;		 //(store) sum=sum+a              [sum=0+10 , sum=10+10, sum=20+10,  sum=30+10, sum=40+10]
			
			System.out.println(i);
		}
  System.out.println("mul is "+sum );
	}

}
