package basicsOfOOP;

public class Assignment {

	/*
	 * public static void main(String[] args) { int rowCount = 5; int colCount = 6;
	 * int data = 1;
	 * 
	 * for(int i=1; i<=rowCount; i++) { for(int j=1; j<=colCount; j++) {
	 * 
	 * if(i%2==0) { System.out.print(data-- +" "); }else { System.out.print(data++
	 * +" "); } } if(i%2!=0) { data += colCount-1; }else { data += colCount+1; }
	 * System.out.println(); } }
	 */

	public static void main(String[] args) {
		int rows = 5;
		int columns = 5;
		int num = 1;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int index = (i % 2 == 0) ? j : (columns - j - 1);
				System.out.print(num + index + " ");
			}
			num += columns;
			System.out.println();
		}
	}
}
