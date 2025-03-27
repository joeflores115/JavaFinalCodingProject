WAR Card Game
Description
This Java-based WAR Card Game is a console application that simulates 
a simple card game between two players. The game automatically shuffles 
a deck of 52 cards and deals 26 cards to each player. Players then compete 
in rounds, with the player having the higher card value winning each round. 
The game continues until all cards have been played.

Key Features:
-Automatic deck shuffling and card dealing

-Simple console-based gameplay

-Rounds are played until all cards are exhausted

-Scorekeeping for each player

Technologies Used:
-Java

-ArrayList for storing cards in the deck and players' hands

-Collections.shuffle for randomizing the deck

Favorite Features
1. Automated Deck Shuffling and Card Dealing
One of the standout features is the automated 
process of shuffling the deck and dealing cards 
evenly between two players. This ensures a fair start to the game.

java
public Deck() {
    // ...
    for(String suit : suits) {
        value = 2;
        for(String number : numbers) {
            Card card = new Card(number, suit, value);
            value++;
            cards.add(card);
        }
    }
    shuffle(cards);
}
2. Simple Console-Based Gameplay
The game provides a straightforward console interface 
for users to play the game without needing a graphical 
interface. This simplicity makes it easy to understand and play.

java
for(int k = 0; k < 26; k++) {
    System.out.println();
    System.out.println(" Round " + round + "!");
    System.out.println();
    System.out.print(" Player One's card: ");
    Card card1 = player1.flip();
    card1.describe();
    System.out.println();
    System.out.print(" Player two's card: ");
    Card card2 = player2.flip();
    card2.describe();
    System.out.println();
    if(card1.getValue() > card2.getValue()) {
        player1.incrementScore();
        System.out.println(" Congratulations Player 1, you won the round!");
    }
    // ...
}
Installation & Usage Instructions:
-Ensure you have Java Development Kit (JDK) installed on your system.

-Clone the repository to your local machine.

-Navigate to the project directory.

Compile the Java files:

bash
javac finalCodingProject/*.java
Run the application:

bash
java finalCodingProject.App
Follow the on-screen prompts to play the game.

Contributing
Contributions to improve the WAR Card Game are welcome. 
Please follow these steps to contribute:

-Fork the repository.

-Create a new branch for your feature or bug fix.

-Make your changes and commit them with descriptive commit messages.

-Push your changes to your fork.

-Submit a pull request with a clear description of your changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact Information
For any queries or suggestions, please contact the project maintainer at: 
joseph.flores125@gmail.com
