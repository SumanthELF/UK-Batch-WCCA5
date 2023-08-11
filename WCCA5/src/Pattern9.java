
public class Pattern9 {

	public static void main(String[] args) {

		char a = 'A';
		for (int i = 1; i <= 10; i++)  // rows
		{
			if(i%2==0) 
			{
				for(int j=1; j<=7; j++) {  //columns
					System.out.print(a+" ");
				}
				a++;
			}
			else 
			{
				for(int j=1; j<=7; j++) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}

	}
}
