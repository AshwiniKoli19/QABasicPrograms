package BasicStringOperations;

public class ChangeTheCase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Ser34C3tybDf679uiK4@#QcW", newStr = "";
		int strLen = str.length();
		System.out.println("Original string.."+str);
		for(int i=0; i<strLen; i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				newStr = newStr + Character.toLowerCase(str.charAt(i));
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				newStr = newStr + Character.toUpperCase(str.charAt(i));
			}
			else
			{
				newStr = newStr + str.charAt(i);
			}
		}
		
		System.out.println("Operated string.."+newStr);
	}

}
