
public class Pattern10 {

	public static void main(String[] args) {
		
		int rows = 5;
		int col = 5;
		char data = 'A';
		
		for(int i=1; i<=rows ; i++) 
		{
			for(int j=1; j<=col; j++) 
			{
				if(i%2!=0) {
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(data++ + " ");
				}
			}
			System.out.println();
		}
	}
}
