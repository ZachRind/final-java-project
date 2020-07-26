
public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.shuffule();
		
		
		
		for (int index = 0; index < 53; index++) {
			if(index % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
		
		for(int index = 0; index < 27; index++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			}
			else if(player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			}
		}
	}
	
	

}
