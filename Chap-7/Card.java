public class Card {
	// Every Cards have a face and suit
	// faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "jack", "Queen", "King"}
	// suits = {"Hearts", "Diamonds", "Clubs", "Spades"}
	
	private final String face;
	private final String suit;
	
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	public String toString() {
		return face + " of " + suit;
	}
}
