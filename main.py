from deckOfCards import DeckOfCards
from card import Card
from player import Player

print("Let's play Blackjack!")

newDeck = DeckOfCards()

user = Player()
computer = Player()

newCardToDeal1 = newDeck.getACard()
newCardToDeal2 = newDeck.getACard()
cardsToDealToUser = [newCardToDeal1, newCardToDeal2]

user.dealNewCards(cardsToDealToUser)

		#//get the initial cards to deal to the computer and put in array
newCardToDealComputer1 = newDeck.getACard()
newCardToDealComputer2 = newDeck.getACard()
newCardToDealComputer3 = newDeck.getACard()
		#//put three cards in array
cardsToDealToComputer = [newCardToDealComputer1, newCardToDealComputer2, newCardToDealComputer3]
computer.dealNewCards(cardsToDealToComputer)

		#//print out user cards
print("User Cards: " + user.toString() + " ")
print("Shown Computer " + newCardToDealComputer1.toString() + " and a face down card.")

		#//ask if user wants another card
userChoice = raw_input("Would you like to get a third card? (yes/no) : ")

		#//if user says yes, generate their third card
if userChoice == 'yes':
  thirdCardForUser = newDeck.getACard()
  user.dealThirdCard(thirdCardForUser)
	#//print user's cards
  print (user.toString())
    
elif userChoice == 'no':
  print("User chose not to be dealt a third card")

else:
  print("Invalid input!")
		
		#//assign the sum of cards for both the user and computer to variables
cardSumForUser = user.getSumOfAllDealtCards()
cardSumForComputer = computer.getSumOfAllDealtCards()

		#//if both sums are equal or user's sum is over 21
if cardSumForComputer == cardSumForUser or cardSumForUser > 21:
  print("Computer Cards: " + computer.toString() + " ");
  print("Card sum for user = " + str(cardSumForUser))
  print("Card sum for computer = " + str(cardSumForComputer))
  print("You lost!")
		
		#//if both are less than 21 but sum for computer is higher than sum of user or sum for computer is equal to 21
elif cardSumForComputer < 21 and cardSumForComputer > cardSumForUser:
	print("Computer Cards: " + computer.toString() + " ")
	print("Card sum for user = " + str(cardSumForUser))
	print("Card sum for computer = " + str(cardSumForComputer))
	print("You lost!")
		
		#//if both are less than 21 but sum for user is higher than sum of computer
elif (cardSumForComputer < 21 and cardSumForUser < 21 and cardSumForComputer < cardSumForUser) or cardSumForComputer > 21:
  print("Computer Cards:\n" + computer.toString() + "\n")
  print("Card sum for user = " + str(cardSumForUser))
  print("Card sum for computer = " + str(cardSumForComputer))
  print("Congrats you won!")

else:
  print("You should not get here")
