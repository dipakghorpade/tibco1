package Logical_programs;

public class NoOfSpace {

	public static void main(String[] args) 
	{
		String a="D   e  e pa       k";             // Total length= System.out.println(a.length()-1);
		
		int count=0;
		for(int i=0;  i<=a.length()-1 ;   i++)
		{
			
			char mychar=a.charAt(i);
			if (mychar==' ')
			{
				count++;
			}
			
		}
		System.out.println("Number of space in   "+a+"  count is  "+count);
		
	}

}
