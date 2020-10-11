
public class PushZeroInTheEndOfArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] Arr = {1,2,0,4,3,0,5,0,2,5};
		int arrLen = Arr.length, countArr=0,j=0;
		int[] newArr = new int[arrLen];
		
		for(int i=0; i<arrLen;i++)
		{
			if(Arr[i]==0)
			{
				countArr++;
			}
			else
			{
				newArr[j]=Arr[i];
				j++;
			}
		}
		
		for(int x=0;x<countArr;x++,j++)
		{
			newArr[j]=0;
		}
		
		for(int y=0;y<newArr.length;y++)
			System.out.print(newArr[y]+" ");
	}

}
