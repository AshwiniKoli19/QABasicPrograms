package BasicStringOperations;

public class SwapNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int x = 15, y = 10, temp;
		
		System.out.println("Original values : "+ x +" "+y);
		//Using temp variable
		temp =x;
		x=y;
		y=temp;
		System.out.println("swapped using temp variable : "+ x +" "+y);
		
		//without using temp variable
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("swapped without temp variable : "+ x +" "+y);
		
	}

}
