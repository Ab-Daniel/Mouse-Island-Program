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
	        		if(island[i][j] == -1)
		        		 {
		        			 
		        			 System.out.print("  W");	        			 
		        		 }
	        		else if(island[i][j] == 0)
	        			
		        		 {
		        			 
		        			 System.out.print("  B");
		        			 
		        		 }
	        			 
	        		 
	        	 
	        		 
	        		 continue;
	        	 
	        	 }
	        	 
	        	 
	        	 System.out.print(String.format("%3d", island[i][j]));
	        	 
	         }
	        System.out.println(" "+moveAbout() );
	         
	         
		}
		
		System.out.println(moveAbout());
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	public String moveAbout()
	{
		
		//String r;
	
		
		int y = 7;
		int x = 4;
		
		//int mousePos = island[x][y];
		
		moves = 0;
		
		//mouseCheck = false;
		
		for(int i = 0; i < 50; i++)
		{
			int direction = generator.nextInt(3);
			direction++;
			
		if(moves < 50)
		{				
			if(!(x == 0 || x == 9 || y == 0 || y == 14))
			{
					
				
			
				if(direction == 1 )
				{
					island[x][y] = moves;
					x++;
					
					
					//mousePos = island[x][y-1];
					
					//y=y-1;
				}
				
				else if(direction == 2)
				{
					island[x][y] = moves;
					y++;
					
					//mousePos = island[x][y];
					//x=x+1;
				}
				
				else if(direction == 3)
				{
					island[x][y] = moves;
					x--;
					
					
					//mousePos = island[x][y];
					//y=y+1;
				}
				
				else if(direction == 4)
				{
					island[x][y] = moves;
					y--;
					//mousePos = island[x][y];
					//x=x-1;
				}
				
			}
				moves++;
			}
			
		 if((x==0 || x==9 || y==0 || y==14)){
				
				if(island[x][y] == -1)
				{
					return "Drowned " + moves;
					//break;
				}
				
				if(island[x][y] == 0)
				{
					return "Escaped " + moves;
					//break;
				}
				
				break;
			}
		 
		 else if(moves>=50)
		{	
			return "Starved";
					
					
				}
		 
		 
			
		}
		
			
		 
		
		return "FAIL";
		
	}
	public void printStats(int x, int y, int z){
		System.out.println("escapes: " + x);
		System.out.println("drowns: " + y);
		System.out.println("starves: " + z);
	}
	//private boolean mouseCheck;
	
	final int PERCENT_BRIDGES = 30;
	
	final int ROWS = 10;
	final int COLUMNS = 15;
	
	int[][] island = new int[ROWS][COLUMNS];
	
	private int moves;
	
	private Random generator = new Random();
	
}
