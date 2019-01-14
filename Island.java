import java.util.Random;

public class Island 
{
	
	public String printIsland()
	{
		
	    String r = "";
		for (int i = 0; i < ROWS; i++)
		{
			
			//r = r + "";
	         for (int j = 0; j < COLUMNS; j++)
	         {
	        	 
	        	int randInt = generator.nextInt(100);
	        	if(randInt <= PERCENT_BRIDGES)
	        	{
	        		island[j][0] = 0;
	        	}
	        	
	        	
	        	/*
	        	int checkX = generator.nextInt(9);
	        	int checkY = generator.nextInt(14);
	        	
	        	if(checkX > 0 && checkY > 0)
	        	{
	        		island[checkX][checkY] = 0;
	        		r = r + island[checkX][checkY];
	        		
	        	}
	        	
	        	else if(checkX == 0 || checkX == 9 || checkY == 0 || checkY == 14)
	        	{
	        		
	        		randInt = generator.nextInt(100);
	        		if(randInt<=PERCENT_BRIDGES)
	        		{
	        			island[checkX][checkY] = 0;
	        			r = r + island[checkX][checkY];
		        		
	        		}
	        		else
	        		{
	        			island[checkX][checkY] = -1;
	        			r = r + island[checkX][checkY];
		        		
	        		}
	        		
	        	}
	        	*/
	        	
	        	//r = r + island[checkX][checkY];
	        	
	         }
		
	         r = r + "\n";
	         
		}
		
		return r;
		
	}
	
	public String moveAbout()
	{
		
		return null;
		
	}
	
	final int PERCENT_BRIDGES = 30;
	
	final int ROWS = 10;
	final int COLUMNS = 15;
	
	int[][] island = new int[ROWS][COLUMNS];
	
	private int mCol;
	private int mRow;
	
	private int moves;
	
	private Random generator = new Random();
	
}
