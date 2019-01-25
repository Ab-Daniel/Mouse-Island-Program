import java.util.Random;

public class Island 
{
	public Island()
	{
		
		
		
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
		//moveAbout();
		
	}
	
	public void printIsland()
	{
		
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
	        moveAbout();
	         //r = r + "\n";
	         
		}
		
		System.out.println(moveAbout());
		
	}
	
	
	
	
	
	
	
	
	
	
	public String moveAbout()
	{
		
		//String r;
		
		boolean searching = true;
		boolean escaped = false;
		boolean drowned = false;
		boolean starved = false;
		
		boolean mouseState = searching;
		
		int y = generator.nextInt(7) + 1;
		int x = generator.nextInt(12) + 1;
		
		//int mousePos = island[x][y];
		
		while(mouseState == searching)
		{
			
			if(moves<50 && x != 0 && x != 14 && y != 0 && y != 9)
			{
				
				int direction = generator.nextInt(3) + 1;
				
				if(direction == 1)
				{
					island[x][y-1] = moves;
					
					if(x==0 || x==14 || y==0 || y==9)
					{
						
						if(island[x][y] == -1)
						{
							mouseState = drowned;
							return "Drowned";
						}
						
						if(island[x][y] == 0)
						{
							mouseState = escaped;
							return "Escaped";
						}
						
					}
					
					//mousePos = island[x][y-1];
					
					//y=y-1;
				}
				
				if(direction == 2)
				{
					island[x+1][y] = moves;
					
					if(x==0 || x==14 || y==0 || y==9)
					{
						
						if(island[x][y] == -1)
						{
							mouseState = drowned;
							return "Drowned";
						}
						
						if(island[x][y] == 0)
						{
							mouseState = escaped;
							return "Escaped";
						}
						
					}
					
					//mousePos = island[x][y];
					//x=x+1;
				}
				
				if(direction == 3)
				{
					island[x][y+1] = moves;
					
					if(x==0 || x==14 || y==0 || y==9)
					{
						
						if(island[x][y] == -1)
						{
							mouseState = drowned;
							return "Drowned";
						}
						
						if(island[x][y] == 0)
						{
							mouseState = escaped;
							return "Escaped";
						}
						
					}
					
					//mousePos = island[x][y];
					//y=y+1;
				}
				
				if(direction == 4)
				{
					island[x-1][y] = moves;
					
					if(x==0 || x==14 || y==0 || y==9)
					{
						
						if(island[x][y] == -1)
						{
							mouseState = drowned;
							return "Drowned";
						}
						
						if(island[x][y] == 0)
						{
							mouseState = escaped;
							return "Escaped";
						}
						
					}
					
					//mousePos = island[x][y];
					//x=x-1;
				}
				
			}
			
			/*
			else if (moves == island[0][y] || moves == island[14][y] || moves == island[x][0] || moves == island[x][9]) (x==0 || x==14 || y==0 || y==9)
			{
				
				if(island[x][y] == -1)
				{
					mouseState = drowned;
					return "Drowned";
				}
				
				else if(island[x][y] == 0)
				{
					mouseState = escaped;
					return "Escaped";
				}
				
			}
			*/
			
			else if(moves>50)
			{
				
				if(x != 0 && x != 14 && y != 0 && y != 9)
				{
					
					mouseState = starved;
					return "Starved";
					
				}
				
				if(x==0 || x==14 || y==0 || y==9)
				{
					
					if(island[x][y] == -1)
					{
						mouseState = drowned;
						return "Drowned";
					}
					
					if(island[x][y] == 0)
					{
						mouseState = escaped;
						return "Escaped";
					}
					
				}
				
			}
			
			moves++;
			
		}
		
		return null;
		
	}
	
	final int PERCENT_BRIDGES = 30;
	
	final int ROWS = 10;
	final int COLUMNS = 15;
	
	int[][] island = new int[ROWS][COLUMNS];
	
	private int mCol;
	private int mRow;
	
	private int moves = 0;
	
	private Random generator = new Random();
	
}
