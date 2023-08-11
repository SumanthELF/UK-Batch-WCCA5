
public class Pattern4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) 
		{
			if (i == 3 || i == 8) 
			{
				for (int j = 1; j <= 3; j++) 
				{
					System.out.print(i + " ");
				}
				System.out.println();
			} 
			else 
			{
				System.out.println(i + " ");
			}
		}
	}

}
