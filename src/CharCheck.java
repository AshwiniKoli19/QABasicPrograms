
public class CharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		
		if((c>= 'a' && c<='z') || (c>='A' && c<='Z'))	//Based on ASCII value comparison
		{
			System.out.println(c+" is a aphabet");
		}
		else
		{
			System.out.println(c+" is not a aphabet");
		}
	}

}
