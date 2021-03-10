package Unit9Activitiesfirstpart;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card aceHearts = new Card("ace", "hearts", 1);
		Card eightClubs = new Card("8", "clubs", 8);
		Card twoDiamonds = new Card("2", "diamonds", 2);
		
		System.out.println();
		System.out.println(" rank: " + aceHearts.rank());
		System.out.println(" suit: " + aceHearts.suit());
		System.out.println(" pointValue: " + aceHearts.pointValue());
		System.out.println(" toString: " + aceHearts.toString());
		System.out.println();
		
		System.out.println("");
		System.out.println(" rank: " + eightClubs.rank());
		System.out.println(" suit: " + eightClubs.suit());
		System.out.println(" pointValue: " + eightClubs.pointValue());
		System.out.println(" toString: " + eightClubs.toString());
		System.out.println();
		
		System.out.println();
		System.out.println(" rank: " + twoDiamonds.rank());
		System.out.println(" suit: " + twoDiamonds.suit());
		System.out.println(" pointValue: " + twoDiamonds.pointValue());
		System.out.println(" toString: " + twoDiamonds.toString());
		System.out.println();
	}
}
