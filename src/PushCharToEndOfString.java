
public class PushCharToEndOfString {

	public static void main(String[] args) 
	{
		// Shift all o to the end of string
		String str = "hippopotamus", newStr = "";
		int strLen = str.length(), charCount = 0;
		System.out.println("Original string.."+str);
		for(int i =0; i<strLen; i++)
		{
			if(str.charAt(i)=='o' || str.charAt(i)=='O')
			{
				charCount++;
			}
			else
			{
				newStr = newStr +str.charAt(i);
			}
		}
		
		for(int j=0;j<charCount;j++)
		{
			newStr = newStr + "o";
		}
		System.out.println("Operated string.."+newStr);
	}

}
