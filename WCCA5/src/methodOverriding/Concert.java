package methodOverriding;

public class Concert {

	public static void main(String[] args) {
		
//		Leela leela = new Leela();
//		leela.dance();
//		System.out.println("=========================");
//		Sheela sheela = new Sheela();
//		sheela.dance();
		
		Leela leela = new Sheela();    //upcasting
		leela.dance(); 
	}
}
