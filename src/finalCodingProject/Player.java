package finalCodingProject;
import java.util.ArrayList;
import java.util.List;

public class Player {

	//2 players
	
	//fields
		private List<Card> hand= new ArrayList<>();
		private int score; //set to 0 in the constructor
		private String name; // name of the player?
		
		// Instantiating a new deck object
		Deck deck=new Deck();
		
		//methods - getters and setters
		//----------------------------------
		//returns list hand
		public List<Card> getHand() {
			return this.hand;
		}

		

		public int getScore() {
			return score;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		//methods
		public void describe()
		{
			System.out.println(name);
			
			for(Card card:getHand())
			{
				
				card.describe();
				
			}
			//prints out information about the player 
			//and calls the describe method 
			//for each card in the hand list
		}
		
		//returns the top card of the hand
		//removes that card from the hand
		
		public Card flip()
		{
			Card dummyCard= new Card();
			dummyCard=hand.get(0);
			hand.remove(0);
			return dummyCard;
		}
		
		//adds a card from the top of the deck to the players hand
		public void draw(Deck deck)
		{
			
			hand.add(deck.draw());
			
		}
		
		public void incrementScore()
		{
			score++;
		}
		
		//player constructor that sets their initial score
		//to zero
		public Player()
		{
			score=0;
		}
		
		
		
		
	}
