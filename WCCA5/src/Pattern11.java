
public class Pattern11 {

	public static void main(String[] args) {
		
		int rows = 5;
		int cols = 5;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==1 || i==rows || j==1 || j==cols)
				{
					System.out.print("* ");
				}else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
