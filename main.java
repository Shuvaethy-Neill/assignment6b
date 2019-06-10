/****************************************************************************
 * Created by: Shuvaethy Neill
 * Created on: May 2019
 * Created for: ICS4U
 * This program is the game of 21
 ****************************************************************************/

import java.util.Scanner;

public class main{
	
	//the two players
	static Player user = new Player();
	static Player computer = new Player();

	public static void main(String[] args) {
		DeckOfCards newDeck = new DeckOfCards();

		//get the two initial cards to deal to the user and put in array
		Card newCardToDeal1 = newDeck.GetACard();
		Card newCardToDeal2 = newDeck.GetACard();
		//put the two cards in array
		Card[] cardsToDealToUser = new Card[] { newCardToDeal1, newCardToDeal2 };

		//deal cards
		user.DealNewCards(cardsToDealToUser);

		//get the initial cards to deal to the computer and put in array
		newCardToDeal1 = newDeck.GetACard();
		newCardToDeal2 = newDeck.GetACard();
		Card newCardToDeal3 = newDeck.GetACard();
		//put three cards in array
		Card[] cardsToDealToComputer = new Card[] { newCardToDeal1, newCardToDeal2, newCardToDeal3 };
		computer.DealNewCards(cardsToDealToComputer);

		//print out user cards
		System.out.println("User Cards:\n" + user + "\n");

		//ask if user wants another card
		System.out.println("Do you want another card?");

		String userInput;
		Scanner inputScanner = new Scanner(System.in);
		userInput = inputScanner.next();

		Card thridCardForUser;
		//if user says yes, generate their third card
		if (userInput.equalsIgnoreCase("Yes")) {
			thridCardForUser = newDeck.GetACard();
			user.DealThirdCard(thridCardForUser);
			//print user's cards
			System.out.println(user);
		}
		
		//assign the sum of cards for both the user and computer to variables
		int cardSumForUser = user.GetSumOfAllDealtCards();
		int cardSumForComputer = computer.GetSumOfAllDealtCards();

		//if both sums are equal or user's sum is over 21
		if (cardSumForComputer == cardSumForUser || 0 < cardSumForComputer && cardSumForComputer > 21 && cardSumForUser > 21 || cardSumForUser > 21){
			System.out.println("Computer Cards:\n" + computer + "\n");
			System.out.println("Card sum for user = " + cardSumForUser);
			System.out.println("Card sum for computer = " + cardSumForComputer);
			System.out.println("You lost!");
		} 
		
		//if both are less than 21 but sum for computer is higher than sum of user or sum for computer is equal to 21
		else if (0 < cardSumForComputer && cardSumForComputer < 21 && cardSumForComputer > cardSumForUser || cardSumForComputer == 21 && cardSumForUser != 21) {
			System.out.println("Computer Cards:\n" + computer + "\n");
			System.out.println("Card sum for user = " + cardSumForUser);
			System.out.println("Card sum for computer = " + cardSumForComputer);
			System.out.println("You lost!");
		} 
		
		//if both are less than 21 but sum for user is higher than sum of computer or sum for user is equal to 21 and sum of computer is not equal to 21
		else if (0 < cardSumForComputer && cardSumForComputer < 21 && cardSumForUser < 21 && cardSumForComputer < cardSumForUser || cardSumForUser == 21 && cardSumForComputer != 21){
			System.out.println("Computer Cards:\n" + computer + "\n");
			System.out.println("Card sum for user = " + cardSumForUser);
			System.out.println("Card sum for computer = " + cardSumForComputer);
			System.out.println("Congrats you won!");
		}
	}
}
