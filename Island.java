import java.util.Random;

public class Island 
{
	public Island(){
		
		//1 loop and inside thos loops u ned 5 if staments
		
		for(int i = 0; i < 15; i++)
		{
			
			//generate rand num
			int randInt = generator.nextInt(100) + 1;
			
			//check if less or equal to PreCENT constant
			//if it is then say island[0][i] = -1;
			if(randInt <= PERCENT_BRIDGES)
			{
				island[0][i] = -1;				
			}
			else
			{
				island[9][i] = -1;
			}
			
			if(i <= 8)
			{
				
				if(randInt <= PERCENT_BRIDGES)
				{
					island[i][0] = -1;				
				}
				else
				{
					island[i][14] = -1;
				}
				
			}
			
			//printIsland();
			
			//another if stament same thing but greater than or equal to if so then island[9][i] = -1
		}
		
		
		printIsland();
		
	}
	
	public void printIsland()
	{
		
	    String r = "";
		for (int i = 0; i < ROWS; i++)
		{
			
			//r = r + "";
	         for (int j = 0; j < COLUMNS; j++)
	         {
	        	
	        	 //int randInt = 1 + generator.nextInt(100);
	        	 
	        	 if(i == 0 || i == 9 || j == 0 || j == 14)
	        	 {
	        		 if(j == 0 && (i!=0 && i!=9))
	        		 {
	        			 
	        			 if(island[i][j] == -1)
		        		 {
		        			 
		        			 System.out.print(" W");	        			 
		        		 }
		        		 if(island[i][j] == 0)
		        		 {
		        			 
		        			 System.out.print(" B");
		        			 
		        		 }
	        			 
	        		 }
	        		 
	        		 else if (j == 14 && (i!=0 && i!=9))
	        		 {
	        			 
	        			 if(island[i][j] == -1)
		        		 {
		        			 
		        			 System.out.print("  W");	        			 
		        		 }
		        		 if(island[i][j] == 0)
		        		 {
		        			 
		        			 System.out.print("  B");
		        			 
		        		 }
	        			 
	        		 }
	        		 
	        		 else
	        		 {
	        			
	        			 if(island[i][j] == -1)
		        		 {
		        			 
		        			 System.out.print(" W ");	        			 
		        		 }
		        		 if(island[i][j] == 0)
		        		 {
		        			 
		        			 System.out.print(" B ");
		        			 
		        		 }
	        			 
	        		 }
	        		 
	        		 
	        		 continue;
	        	 }
	        	 
	        	 
	        	 
	        	 System.out.print(String.format("%3d", island[i][j]));
	        	 
	         }
	         
	         
	        System.out.println();
		
	         //r = r + "\n";
	         
		}
		
		//System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	public String moveAbout()
	{
		
		boolean searching = true;
		boolean escaped = false;
		boolean drowned = false;
		boolean starved = false;
		
		
		
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
