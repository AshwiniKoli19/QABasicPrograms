package BasicStringOperations;

public class ReverseStringImprovised {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Ashwini", newStr = "";
		int strLen = str.length()-1;
		System.out.println("Original string.."+str);
		for(;strLen>=0;strLen--)
		{
			newStr = newStr + str.charAt(strLen);
		}
		System.out.println("Operated string.."+newStr);
	}

}
