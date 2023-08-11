package methods;

public class PyramidPattern2 {

	public static void main(String[] args) {

		int rowCount = 10;
		int starCount = 1;
		int spaceCount = rowCount-1;

		for (int i = 0; i < rowCount; i++) {
			for (int k = 0; k < spaceCount; k++) {
				System.out.print("  ");
			}
			for (int m = 0; m < starCount; m++) {
				System.out.print("* ");
			}
			starCount += 2;
			spaceCount--;
			System.out.println();
		}
	}

}
