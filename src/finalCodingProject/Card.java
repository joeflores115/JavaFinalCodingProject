package finalCodingProject;

public class Card {
	
	//Fields
	
		//value - -contains a value from 2-14 representing cards 2-Ace
		private int value;
		
		// name e.g Ace of Diamonds or two of hearts
		private String name;
		//number or jack/queen/king
		private String number;
		
		//methods
		
		//gets value of the card
		public int getValue() {
			return value;
		}
		
		//gets the suite of the card
		public String getName() {
			return name;
		}
		
		//prints out the name and number of the card but not the value
		public void describe()
		{
			System.out.print(this.number +" of "+this.name+ " ");
		}
		
		//constructors
		public Card(){}
		
		//parameters include the suite, number, and the value of the card
		public Card(String number, String name, int value)
		{
			this.name=name;
			this.number=number;
			this.value=value;
		}
		
		//gets the number of the card
		public String getNumber() {
			return number;
		}
		
	}
