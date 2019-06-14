/****************************************************************************
 * Created by: Shuvaethy Neill
 * Created on: May 2019
 * Created for: ICS4U
 * This program is the game of 21
 ****************************************************************************/

import java.util.Random;

public class DeckOfCards{
	//all suits
	String[] suit = { "Hearts", "Diamonds", "Spades", "Clubs" };

	//all ranks
	String[] rank = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	//all valid card values
	int[] validCardValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
	
	//52 values
	public Card[] deckOfCards = new Card[52];

	//create the deck of cards (all possible cards)
	public DeckOfCards()
	{
		for (int i = 0; i < deckOfCards.length; i++) {

			//uses mondulus (remainder), goes up to 51
			deckOfCards[i] = new Card(rank[i % 13] + " " + suit[i / 13], validCardValues[i % 13]);
		}
	}

	
	public Card GetACard() {
		Random r = new Random();
		int nextRandomCardIdx;
		Card randomlySelectedCard;
		do {
			//random number between 1 and 52 for random card
			nextRandomCardIdx = r.nextInt(52);
			randomlySelectedCard = deckOfCards[nextRandomCardIdx];
			//until randomly selected card is available to deal, find one and return it
		} while (!randomlySelectedCard.IsCardAvailableToDeal());

		randomlySelectedCard.SetCardHasBeenDealt();
		return randomlySelectedCard;
	}
}
