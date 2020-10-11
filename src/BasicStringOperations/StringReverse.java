package BasicStringOperations;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class StringReverse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String input = "Ashwini Koli";
		
		StringBuilder build = new StringBuilder();
		build.append(input);
		
		build=build.reverse();
		System.out.println(build);
		int count =0;
		for (int i=0;i<build.length();i++)
		{
			if(build.charAt(i)=='i')
				{
				System.out.println(build.charAt(i));
				count++;
				}
				
		}
		System.out.println(count);
	
		System.out.println("Using char Array..");
	
		char[] charA = input.toCharArray();
		
		for(int x= charA.length-1;x>=0;x--)
		{
			System.out.print(charA[x]);
		}
		
		System.out.println("Using Arraylist object..");
		
		ArrayList<String> str = new ArrayList<>();
		str.add(input);
		
		Collections.reverse(str);
		ListIterator itr = str.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
