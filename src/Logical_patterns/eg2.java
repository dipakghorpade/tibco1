package Logical_patterns;

public class eg2 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****

		for(int i=1; i<=5; i++)               // row
		{
			for(int j=1;  j<=i;  j++)       // cell 
			{	
				System.out.print("*");
			}	
         	System.out.println();
		}
		

	}

}
