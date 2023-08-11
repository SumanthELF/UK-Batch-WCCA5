package arrays;

public class ArrayDemo10 {

	// count how many vowels are present in the given array
	public static void main(String[] args) {

		char [] carr = {'a','b','c','d','E','g','h','i','m','n','o'};
		int charCount = 0;
		
		for(int i=0; i<carr.length; i++) {
			if(carr[i]=='a'||carr[i]=='e'||carr[i]=='i'||carr[i]=='o'||carr[i]=='u'||
					carr[i]=='A'||carr[i]=='E'||carr[i]=='I'||carr[i]=='O'||carr[i]=='U') {
				charCount++;
			}
		}
		System.out.println("Total number of vowels present in the array is " + charCount);
	}
}
