
public class VariableTypes 
{
					//directly, className.varName
	static int a;   //default values
	static byte b;  //byte, short, int, long, double, float
	static short c;  //for char it is empty
	                   //for boolean false
	                   // for String null
	static long d;
	static float e;
	static double f;
	static String g;
	static char h;
	static boolean i;
	
	public static void main(String[] args) 
	{
		int a ;
		a = 10;
		System.out.println(a);
		System.out.println(VariableTypes.b);
		System.out.println(c); 
		System.out.println(d); 
		System.out.println(e); 
		System.out.println(f); 
		System.out.println(g); 
		System.out.println((int)h);
		System.out.println(i);
		System.out.println((int)' ');
	}
}
