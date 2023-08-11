package interfaceConcept;

//if you want to downcast, first perform upcasting
public class DriverPC {

	public static void main(String[] args) {
		
		Parent rv = new Child();
		rv.cook();
		Child ref = (Child) rv; //downcasting
		ref.play();
		ref.toString();
		
	}

}
