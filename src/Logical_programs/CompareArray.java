package Logical_programs;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {

		int arry1[]= {10,40,80};
		int arry2[]= {111,45,80};
		int arry3[]= {10,40,80};
		
		System.out.println(Arrays.equals(arry1, arry2));
		System.out.println(Arrays.equals(arry1, arry3));
	}

}
