import se.lth.cs.ptdc.cardGames.Card;
// import se.lth.cs.ptdc.cardGames.CardDeck;

public class EttTvaTre {
	public static void main(String[] args) {
		int failed = 0;
		int decks = 1000000;
		for (int i = 0; i < decks; i++) {
			CardDeck deck = new CardDeck();
			deck.shuffle();
			int cardNum = 0;
			while (deck.moreCards()) {
				cardNum++;
				Card c = deck.getCard();
				if (c.getRank() == cardNum) {
					failed++;
					break;
				}
				if (cardNum == 3) {
					cardNum = 0;
				}
			}
		}
		System.out.println(failed);
		System.out.println(decks);

		double ratio = (double)(decks - failed)/decks;
		System.out.println(ratio);
	}
}