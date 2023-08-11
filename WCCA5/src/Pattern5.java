
public class Pattern5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) 
		{
			if (i == 3 || i == 5) 
			{
				for (int j = 1; j <= i; j++) 
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}else
			{
				System.out.println(i+" " );
			}
		}
	}
}
