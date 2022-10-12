package Mahdis_CPSC1181_lab0;
import java.util.Random;
public class Exercise2Debuged {
        

	public static void main(String[] args) {
		final int KING = 0, QUEEN = 1, JACK = 2, ACE = 3;
		Random generator = new Random();
		int numOfCards = generator.nextInt(4)+1;
		System.out.println("You drew " + numOfCards + " cards from the deck:");
		for (int i = 0; i < numOfCards; i++) {
			switch (generator.nextInt(4)) {
			case KING:
				System.out.println("You drew a King.");
				break;
			case QUEEN:
				System.out.println("You drew a Queen.");
				break;
			case JACK:
				System.out.println("You drew a Jack.");
				break;
			case ACE:
				System.out.println("You drew an Ace.");
				break;
			}
		}
	}



}
