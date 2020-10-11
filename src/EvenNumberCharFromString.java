
public class EvenNumberCharFromString 
{
	public static void main(String args[])
	{
		String str = "This is rohini shinge working in zycus", evenStr = "", oddStr = "";
		int strLen = str.length();
		
		System.out.println("Origin string..."+str);
		for(int i=0; i<strLen; i++)
		{
			if(str.charAt(i)%2 == 0)
			{
				evenStr = evenStr + str.charAt(i);
			}
			else
			{
				oddStr = oddStr + str.charAt(i);
			}
		}
		
		System.out.println("String with even characters..."+ evenStr.replaceAll("\\s+", ""));
		System.out.println("String with odd characters..."+ oddStr.replaceAll("\\s+", ""));
		
	}

}
