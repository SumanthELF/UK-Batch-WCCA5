package nonPrimitiveTypeCasting;

public class BallDriver1 {

	public static void main(String[] args) {
		
		SportsBag sportsBag = new SportsBag();
		sportsBag.ball = new CricketBall();
		sportsBag.gameToPlay();
		
	}
}