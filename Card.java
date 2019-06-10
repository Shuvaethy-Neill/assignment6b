/****************************************************************************
 * Created by: Shuvaethy Neill
 * Created on: May 2019
 * Created for: ICS4U
 * This program is the game of 21
 ****************************************************************************/

public class Card
{
	public int value;
	public String name;
	public Boolean isAvailableToDeal;
	
	public Card(String n, int v){
		name = n;
		value = v;
		isAvailableToDeal = true;
	}

	public Boolean IsCardAvailableToDeal() {
		return isAvailableToDeal;
	}

	public void SetCardHasBeenDealt() {
		isAvailableToDeal = false;
	}

	public void SetCardIsAvailableToDeal() {
		isAvailableToDeal = true;
	}

	public String toString() {
		return "Card: " + name;
	}
}
