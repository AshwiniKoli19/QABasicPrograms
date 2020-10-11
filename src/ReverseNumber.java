
public class ReverseNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		long num = 12345;
		long temp = 0, rev=0;
		
//		while(num!=0)
//		{
//			temp = num%10;		//returns last digit
//			rev =rev*10+temp; 	//logic to append next number to existing number present in rev
//			num/=10;			// removing last digit from number which is alredy reversed
//		}
//		
		
		for(;num!=0;num/=10)	// using for loop
		{
			temp=num%10;
			rev =rev*10+temp; 	
		}
		
		System.out.println(rev);
		
	}
	
}
