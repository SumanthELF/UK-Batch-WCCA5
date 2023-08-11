
public class TypeCasting {

	public static void main(String[] args) {
		//Widening
		byte a = 125;
		int b = a;
		System.out.println(b);
		
		//Narrowing
		int c = 50;          //-32768 to 32767
		byte d = (byte) c;        //-128 to 127
		System.out.println(d);
	}

}
