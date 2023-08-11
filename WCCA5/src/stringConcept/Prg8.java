package stringConcept;

public class Prg8 {

	public static void main(String[] args) {
		
		String[] arr = {"Mohan","Kumar","Santhosh","Kiran"};
		
		for(int i=0; i<arr.length; i++) {
			int index = arr[i].indexOf('a');
			if(index!=-1) {
				System.out.println("Character 'a' is present in "+ arr[i]);
			}else {
				System.out.println("Character 'a' is not present in "+ arr[i]);
			}
		}
	}

}
