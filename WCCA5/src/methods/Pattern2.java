package methods;

public class Pattern2 {

	public static void main(String[] args) {

		int rowCount = 4;
		int space = rowCount - 1;
		int dataCount = 1;
		int data = 1;
		int increment = 1;

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < dataCount; k++) {
				if (i % 2 == 0) {
					System.out.print(data++ + " ");
				} else {
					System.out.print(data-- + " ");
				}
			}
			if (i != 0 && i % 2 != 0) {
				increment += 2;
			}
			System.out.println();
			space--;
			dataCount++;
			data = data + increment;
		}
	}
}