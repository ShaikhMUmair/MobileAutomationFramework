package General;

public class Deel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer p =  0;
		Integer l =  0;
		Integer number =  6;
		Integer i =  0;
		
		for(i=1;i<=6;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				if (l == 1)
				{
					System.out.print("0");
					l = 0;
				}
				
				else if (l == 0)
				{
					System.out.print("1");
					l = 1;
				}
			}
			
			System.out.print("\n");
					
		}
	}

}
