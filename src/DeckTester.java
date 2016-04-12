/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck dek = new Deck(new String[]{"Ace", "2"}, new String[]{"Spades", "Hearts"}, new int[]{1, 2});
		Card ran = dek.deal();
		Card djd = dek.deal();
		System.out.println(ran.toString());
		System.out.println(djd.toString());
	}
	
}
