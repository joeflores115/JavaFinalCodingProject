package finalCodingProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("	    ***Welcome to WAR!***");
		Player player1= new Player();
		Player player2= new Player();
		int round=1;
		//deck is automatically shuffled when it is constructed
		Deck deck=new Deck();
		
		
		
		//iterates through the deck 52 times
		//each player will get 26 cards
		
		for(int i=0;i<52;i++)
		{
			if(i%2==0)
			{
				player1.draw(deck);
			}
			else
			{
				player2.draw(deck);
			}
		}
		
		//iterates for the 26 rounds
		//flips 
		for(int k=0;k<26;k++)
		{	
			System.out.println();
			
			asteriskLine();
			System.out.println("		   Round " + round + "!");
			System.out.println();
			System.out.print("	Player One's card: ");
			Card card1=player1.flip();
			card1.describe();
			System.out.println();
			
			System.out.print("	Player two's card: ");
			Card card2=player2.flip();
			card2.describe();
			System.out.println();
			
			if(card1.getValue()>card2.getValue())
			{
				player1.incrementScore();
				System.out.println();
				System.out.println("   Congratulations Player 1, you won the round!");
			}
			else if(card1.getValue()<card2.getValue())
			{
				player2.incrementScore();
				System.out.println();
				System.out.println("   Congratulations Player 2, you won the round!");
			}
			else
			{
				System.out.println();
				System.out.println("	***Tie round! No points awarded.***");
			}
		round++;
		System.out.println();
		System.out.println("		Game Score: ");
		System.out.println("		Player1: "+ player1.getScore()+"pts");
		System.out.println("		Player2: "+ player2.getScore()+"pts");
		//.describe works and prints out all cards in hand
		//player1.describe();
	}
		System.out.println();
		asteriskLine();
		System.out.println();
		
		System.out.println("Final Scores:");
		System.out.println("Player One's Score: "+player1.getScore());
		System.out.println("Player Two's Score: "+player2.getScore());
		System.out.println();
		if(player1.getScore()>player2.getScore())
		{
			System.out.println("Congratulations Player One!!!!");
		}
		else if(player1.getScore()<player2.getScore())
		{
			System.out.println("Congratulations Player Two!!!!");
		}
		else 
		{
			System.out.println();
			System.out.println("	Tie Game!");
		}
}
//methods
//asterisk line
public static void asteriskLine()
{
	System.out.println("**************************************************");
}

}

