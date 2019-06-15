import random
from card import Card

class DeckOfCards:
  #//all possible card ranks
  ranks = ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']
  #//all possible suits
  suits = ['Spades', 'Hearts', 'Clubs', 'Diamonds']
  validCardValues = [1, 2, 3, 4, 5, 6, 7 , 8 ,9, 10, 10, 10, 10]

  def __init__(self):
    self.deckOfCards = [None] * 52
    for i in range(len(self.deckOfCards)):
      self.deckOfCards[i] = Card(self.ranks[i%13] + " " + self.suits[i/13], self.validCardValues[i%13])

  def getACard(self):
    randomlySelectedCard = self.deckOfCards[random.randint(0,51)]
    
    while not randomlySelectedCard.isCardAvailableToDeal():
      nextRandomCardIdx = random.randint(0,51)
      self.randomlySelectedCard = self.deckOfCards[nextRandomCardIdx]

    randomlySelectedCard.setCardHasBeenDealt()
    return randomlySelectedCard
