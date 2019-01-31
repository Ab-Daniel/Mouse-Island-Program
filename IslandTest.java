
public class IslandTest 
{
	
	public static void main(String[] args) 
	{
		
		Island island = new Island();

		int x = 0;
		int y = 0;
		int z = 0;
		String s;
		
		for(int i = 1; i < 1000; i++){
			
		island = new Island();
		s = island.moveAbout();
		if(s.charAt(0) == 'D'){
			y++;
		}
		else if(s.charAt(0) == 'S'){
			z++;
		}
		else if(s.charAt(0) == 'E'){
			x++;
		}
		
		
		}
		island.printStats(x, y, z);
	}
	
}
