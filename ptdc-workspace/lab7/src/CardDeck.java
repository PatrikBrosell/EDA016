import se.lth.cs.ptdc.cardGames.Card;
import java.util.Random;

class CardDeck {
	private Card[] cards;
	private int current;
	private static Random rand = new Random();

	/** Skapar en kortlek */
	public CardDeck() {
		cards = new Card[52];
		int i = 0;
		for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[i] = new Card(suit, rank);
				i++;
			}
		}
		current = 0;
	}

	/** Drar det översta kortet i leken. Fungerar bara om moreCards är true. */
	public Card getCard() {
		if (moreCards() == false) {
			return new Card(-1, -1);
		}
		current++;
		return cards[current - 1];
	}

	/** Blandar kortleken. */
	public void shuffle() {
		for (int i = 51; i > 0; i--) {
			int nbr = rand.nextInt(i + 1);
			Card tempCard = cards[i];
			cards[i] = cards[nbr];
			cards[nbr] = tempCard;
		}
	}

	/** Undersöker om det finns fler kort i kortleken. */
	public boolean moreCards() {
		if (current < 52) {
			return true;
		} else {
			return false;
		}
	}
}