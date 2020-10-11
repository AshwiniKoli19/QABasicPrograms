package hackerRankProblems;

public class Spies {

	static String grid[][] = null;
	public static void main(String args[]) {
	
		Spies spy = new Spies();
		System.out.println("Program starts here..");
		
		grid = spy.initialiseGrid();
	//	spy.printSpyMatrix(grid);
		
		spy.placeSpyOnGrid(grid);
		
		spy.printSpyMatrix(grid);
		System.out.println("Program ends here..");
	}
	
	String[][] initialiseGrid()
	{	
		String grid[][] = {
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"},
				{"*","*","*","*","*","*","*","*","*","*","*"}
		};
		
		return grid;	
	}
	
	void printSpyMatrix(String grid[][])
	{
		int i, j;	
		for(i=0;i<11;i++)
		{
			for(j=0;j<11;j++)
			{
				System.out.print(" "+ grid[i][j]);
			}
			System.out.println();
		}
	}
	
	void placeSpyOnGrid(String grid[][])
	{
		grid[0][0] = "S";	
		//System.out.println(grid[0][0]);
		System.out.println("Inside placeSpyOnGrid..");

		int checkRow, checkCol;
		for (checkRow = 1, checkCol=0; checkRow <11; checkRow++)
		{
			System.out.println("for..");

			while (checkRow <11)
			{
				System.out.println("while..");

				if(grid[checkRow][checkCol] == "S")
				{
					System.out.println("if..");

					break;
				}
				else
				{
					System.out.println("else..");

					grid[1][1] = "S";
					break;
				}
			}
			System.out.println("while end..");

		}
		
	}
}
