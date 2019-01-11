import java.util.Random;

public class Island 
{
	
	public void printIsland()
	{
		
	    String r = "";
		for (int i = 0; i < ROWS; i++)
	         for (int j = 0; j < COLUMNS; j++)
	         {
	        	 
	        	int randInt;
	        		
	        	int checkX = generator.nextInt(9);
	        	int checkY = generator.nextInt(14);
	        	
	        	if(checkX > 0 && checkY > 0)
	        	{
	        		island[checkX][checkY] = 0;
	        	}
	        	
	        	if(checkX == 0 || checkY == 0)
	        	{
	        		
	        		randInt = generator.nextInt(100);
	        		if(randInt<=PERCENT_BRIDGES)
	        		{
	        			island[checkX][checkY] = 0;
	        		}
	        		if(randInt>=PERCENT_BRIDGES)
	        		{
	        			island[checkX][checkY] = -1;
	        		}
	        		
	        	}
	        	
	         }
		
		
		
	}
	
	public String moveAbout()
	{
		
		return null;
		
	}
	
	final int PERCENT_BRIDGES = 30;
	
	final int ROWS = 9;
	final int COLUMNS = 14;
	
	int[][] island = new int[ROWS][COLUMNS];
	
	private int mCol;
	private int mRow;
	
	private int moves;
	
	private Random generator;
	
}
