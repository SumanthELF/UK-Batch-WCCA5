package methods;

public class Pattern {

	public static void main(String[] args) {

		int rowCount = 5;
		int colCount = 5;
		int data = 1;
		int increment = 1;

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				if (data < 10) {
					if (j <= i) {
						if (i % 2 != 0) {
							System.out.print("0"+data++ + " ");
						} else {
							System.out.print("0"+data-- + " ");
						}
					}
				} else {
					if (j <= i) {
						if (i % 2 != 0) {
							System.out.print(data++ + " ");
						} else {
							System.out.print(data-- + " ");
						}
					}
				}
			}
			if (i % 2 == 0) {
				increment += 2;
			}
			System.out.println();
			data = data + increment;
		}

	}

}

/*
 * if (i == 1 || i == rowCount || j == 1) { System.out.print('b' + " "); } else
 * if (i == rowCount / 2 + 1 && j != colCount) { System.out.print('b' + " "); }
 * else if (j==colCount && i!= (rowCount/2+1)){ System.out.print('b'+" "); }else
 * { System.out.print("  "); }
 */