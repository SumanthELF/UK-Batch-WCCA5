package methods;

public class DiamondPattern {

	public static void main(String[] args) {

		int rowCount = 5;
		int starCount = 1;
		int midRow = 2;
		int spaceCount = 2;

		for (int i = 0; i < rowCount; i++) {
			for (int m = 0; m < spaceCount; m++) {
				System.out.print("  ");
			}
			for (int n = 0; n < starCount; n++) {
				System.out.print(i+" ");
			}
			if (i >= midRow) {
				spaceCount++;
				starCount -= 2;
			} else {
				spaceCount--;
				starCount += 2;
			}
			System.out.println();
		}
	}

}
