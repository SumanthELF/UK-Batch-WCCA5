package nonPrimitiveTypeCasting;

public class SportsBag {

	Ball ball;

	public void gameToPlay() {
		if (ball instanceof BasketBall) {
			BasketBall bb = (BasketBall) ball;
			bb.playGame();
			System.out.println("You can play Basket ball");
		} else if (ball instanceof CricketBall) {
			CricketBall cb = (CricketBall) ball;
			cb.playGame();
			System.out.println("You can play Cricket");
		} else if (ball instanceof FootBall) {
			FootBall fb = (FootBall) ball;
			fb.playGame();
			System.out.println("You can play Foot ball");
		} else if (ball instanceof TennisBall) {
			TennisBall tb = (TennisBall) ball;
			tb.playGame();
			System.out.println("You can play Tennis");
		}
	}
}
