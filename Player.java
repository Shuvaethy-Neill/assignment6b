/****************************************************************************
 * Created by: Shuvaethy Neill
 * Created on: May 2019
 * Created for: ICS4U
 * This program is the game of 21
 ****************************************************************************/

public class Player
{
	//deal cards (2)
	public void DealNewCards(Card[] cardsToDeal) {
		for (int idx = 0; idx < cardsToDeal.length; idx++) {
			dealtCards[idx] = cardsToDeal[idx];
		}
	}

	//deal third card
	public void DealThirdCard(Card thirdCard) {
		dealtCards[2] = thirdCard;
	}

	public int GetSumOfAllDealtCards() {
		int sumOfDealtCardValues = 0;
		boolean seenAce = false;
		for (int i = 0; i < dealtCards.length; i++) {
			if (dealtCards[i] == null) {
				continue;
			}

			if (dealtCards[i].name.charAt(0) == 'A' && seenAce == false) {
				seenAce = true;
			}
			//add all dealt card values
			sumOfDealtCardValues += dealtCards[i].value;	
		}

		if (sumOfDealtCardValues <= 11 && seenAce == true) {
			sumOfDealtCardValues = sumOfDealtCardValues + 10;
		}

		//return sum
		return sumOfDealtCardValues;
	}

	//public String playerType;
	public Card[] dealtCards = new Card[3];

	//shows cards dealt
	public String toString() {
		String dealtCardsSummary = "";
		for (int i = 0; i < dealtCards.length; i++) {
			if (dealtCards[i] == null) {
				continue;
			}
			dealtCardsSummary += "Card #" + (i + 1) + "\n" + dealtCards[i] + "\n";
		}

		return dealtCardsSummary;
	}
}
