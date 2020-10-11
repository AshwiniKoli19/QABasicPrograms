
public class PushUpperCaseCharInTheEndOfString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Ser34C3tybDf679uiK4@#QcW", newStr = "", tempStr="";
		int strLen = str.length();
		System.out.println("Original string and its length..."+str+" "+strLen);
		for(int i=0; i<strLen; i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				tempStr = tempStr + str.charAt(i);
			}
			else
			{
				newStr = newStr + str.charAt(i);
			}
		}
		
			newStr = newStr + tempStr; 
		System.out.println("Operated string and its length.."+newStr+" "+newStr.length());
	}

}
