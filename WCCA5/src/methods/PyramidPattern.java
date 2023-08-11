package methods;

public class PyramidPattern {

	public static void main(String[] args) {

		int rowCount = 5;
		int starCount = 1;
		int spaceCount = rowCount - 1;
		char a = '@';

		for (int i = 0; i < rowCount; i++) {
			for (int m = 0; m < spaceCount; m++) {
				System.out.print(" ");
			}
			for (int n = 0; n < starCount; n++) {
				System.out.print(a + " ");
			}
			spaceCount--;
			starCount++;
			System.out.println();
		}
	}

}
