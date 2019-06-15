class Player:

  def __init__(self):
      self.dealtCards = [None] * 3

  #//deal cards (2)
  def dealNewCards(self, cardsToDeal):
	  for idx in range(len(cardsToDeal)):
			self.dealtCards[idx] = cardsToDeal[idx]

	#//deal third card
  def dealThirdCard(self, thirdCard):
    self.dealtCards[2] = thirdCard
    
  def getSumOfAllDealtCards(self): 
		__sumOfDealtCardValues = 0
		seenAce = False;

		for i in range (len(self.dealtCards)):
			if self.dealtCards[i] == None:
				continue

			if (self.dealtCards[i].isAce() and seenAce == False):
				seenAce = True
			# add all dealt card values
			__sumOfDealtCardValues += self.dealtCards[i].getValue()

		if __sumOfDealtCardValues <= 11 and seenAce == True:
			__sumOfDealtCardValues = __sumOfDealtCardValues + 10

		#//returns sum
		return __sumOfDealtCardValues

	#//shows cards dealt
  def toString(self): 
		dealtCardsSummary = "\n"
		for i in range(len(self.dealtCards)):
			if self.dealtCards[i] == None:
				break

			dealtCardsSummary += "Card #" + str(i + 1) + "\n" + self.dealtCards[i].toString() + "\n"
		return dealtCardsSummary
