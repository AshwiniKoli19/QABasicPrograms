package BasicStringOperations;

public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 3377, rev = 0,temp = 0;
		int origin = num;
		while(num!=0)
		{
			temp = num%10;
			rev=rev*10+temp;
			num/=10;
		}
		
		if(origin==rev)
		{
			System.out.println(origin+" number is palindrome");
		}
		else
		{
			System.out.println(origin+" number is not palindrome");
		}
	}

}
