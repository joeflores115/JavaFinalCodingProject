package finalCodingProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {
	
	//52 cards
	
		//cards (List of Cards for the whole deck)
		private List<Card> cards= new ArrayList<>();
		
		/* 3.     In the constructor, 
		 * when a new Deck is instantiated, 
		 * the Cards field should be populated
		 *  with the standard 52 cards.
		 */
		public Deck() {
			//lists to make the deck
			String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
			String[] numbers= {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
			
			//for the value of the cards
			int value=2;
			
			//creates each card
			//will start with one suite and
			//add every card of that suite
			//will do the same for the next suite and so on...
			for(String suit:suits)
			{
				//brings the value back to 2 to start
				//assigning the values to the new set of suite cards
				value=2;
				for(String number:numbers)
				{	
					//instantiating a new card to be added to list of cards
					Card card=new Card(number,suit,value);
					//value increased for the next card
					value++;
					//adds card to a list
					cards.add(card);
				}
			}
			
			//shuffle cards when deck is created below
			shuffle(cards);
		}
		
		
		
		//methods
		
		//shuffles the List that was made above
		public void shuffle(List<Card> cartas)
		{
			Collections.shuffle(cartas);
			//shuffles/randomizes the order of the cards
			
		}
		
		public Card draw()
		{
			//removes and returns the top card of the cards field
			Card drawCard= cards.get(0);
			cards.remove(0);
			return drawCard;
		}
	}
