
public class InterviewQuestion {

	//write a JP to verify wether a the given character is alphabet or number
	public static void main(String[] args) {
		
		char ch = '9';
		
		if(ch>='0' && ch<='9') 
		{
			System.out.println("The given character is a number");
		}
		else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) 
		{
			System.out.println("The given character is a alphabet");
		}
		else
		{
			System.out.println("It is a special charcter");
		}
	}
}
