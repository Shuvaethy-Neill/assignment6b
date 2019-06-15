class Card:

  def __init__(self, n, v):
    self._name = n
    self._value = v
    self._isAvailableToDeal = True

  def isCardAvailableToDeal(self):
    return self._isAvailableToDeal
  
  def setCardHasBeenDealt(self):
    self._isAvailableToDeal = False

  def setCardIsAvailableToDeal(self):
    self._isAvailableToDeal = True

  def toString(self):
    return self._name
  
  def isAce(self):
    return self._name[0] == 'A'

  def getValue(self):
    return self._value
