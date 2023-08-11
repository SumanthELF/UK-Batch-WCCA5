package stringConcept;

public class Program3 {

	public static void main(String[] args) {
		
		String city = "bangalore";
		System.out.println(city);
		String name = city;
		city = "mumbai";
		
		city.hashCode();
		System.out.println(city==name);
		System.out.println(city.equals(name));
	}
}
