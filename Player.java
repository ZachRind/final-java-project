import java.util.ArrayList;

public class Player {
	
		private int score;
		private String name;
		private ArrayList<Card> hand;
		
		Player(){
			score = 0;
			hand = new ArrayList<Card>();
		
	}
		
		public void describe() {
			System.out.println();
		}
		

		public Card flip() {
			return hand.remove(0);
}
		public void draw (Deck deck) {
			hand.add(deck.draw());
		}
		
		public void incrementScore() {
			score++;
		}
}
