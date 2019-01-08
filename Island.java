import java.util.Random;

public class Island 
{
	
	public void printIsland()
	{
		
		for (int i = 0; i < ROWS-1; i++)
		{
	         for (int j = 0; j < COLUMNS-1; j++)
	         {
	        	 if((i>1&&i<=14)&&(j>1&&j<=14))
	        	 {
	        		 island[i][j] = 0;
	        	 }
	        	 
	         }
	         
		}
		
	}
	
	public String moveAbout()
	{
		
		
		
	}
	
	final int PERCENT_BRIDGES = 30;
	
	final int ROWS = 10;
	final int COLUMNS = 15;
	
	int[][] island = new int[ROWS][COLUMNS];
	
	private int mCol;
	private int mRow;
	
	private int moves;
	
	private Random generator;
	
}
