import java.security.SecureRandom;

public class DeckOfCards {
	SecureRandom rn = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	
	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currCard = 0;
	
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "jack", "Queen", "King"};
		String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		for(int i = 0; i < deck.length; i++) {
			deck[i] = new Card(faces[i % 13], suit[i / 13]);
		}
	}
	
	// shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
		currCard = 0;
		for(int i = 0; i < deck.length; i++) {
			// select random number b/w 0 and 51
			int swapIndex = rn.nextInt(NUMBER_OF_CARDS);
			
			// swap current Card with randomly selected Card
			Card temp = deck[i];
			deck[i] = deck[swapIndex];
			deck[swapIndex] = temp;
		}
	}
	
	// deal one card 
	public Card dealCard() {
		Card card = deck[currCard];
		currCard++;
		return card;
	}
}
