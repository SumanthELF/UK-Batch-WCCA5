
public class LoopingStmt2 {

	public static void main(String[] args) {
		int a = 7; 
		while (a<=17) 
		{
			if(a%2==0) 
			{
				System.out.println(++a);
			}
			a++;
		}
		
	}

}
