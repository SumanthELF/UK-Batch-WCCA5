package nonPrimitiveTypeCasting;

public class BallDriver {

	public static void main(String[] args) {
		
		
		  SportsBag sb = new SportsBag(); 
		  sb.ball = new TennisBall(); //achieved generalization 
		  sb.ball.radius =20;  
//		  sb.ball.playGame(); 
		  BasketBall bb = (BasketBall)sb.ball; 
		  bb.playGame();
		 		
//		Ball b = new Ball();
//		BasketBall bb = (BasketBall)b;
//		System.out.println(bb.radius);
	}

}

// after upcastig using the parent var i will not be 
//   able to access child class members
//
// downcasting 
//
// class cast exception
// 1. without performing upcating and if you try to perfrom downcasting 
// 2. if you dont have instance of a class and if you try to convert
