import java.util.ArrayList;

public class SimpleCardGame2 {
 

  public static void main(String[] args) {

    ArrayList<Card> deck;  // an arraylist of Cards, representing a deck of cards

    // put a copy of each card into cards
    // The order of the cards in the array is: 
    // S2, S3, ..., SK, H2, ..., HK, C2, ..., CK, D2, ..., DK



    //
    // YOU DO NOT HAVE TO MODIFY ANYTHING BELOW
    //

    // print out the whole deck once
    System.out.println("The whole deck is:");
    System.out.println(deck);
    
    // randomly draw 10 cards
    // cards drawn will be removed from deck 
    MyRandom rnd = new MyRandom();
    ArrayList<Card> cards = new ArrayList<Card>();
    for (int i = 0; i < 10; i++)
      addCard(cards, deck.remove(rnd.nextInt(deck.size())-1));


    // print out the card drawn and the number of pairs
    System.out.print("The cards drawn are: ");
    System.out.println(cards);
    System.out.print("There are ");
    System.out.print(numPairs(cards));
    System.out.println(" pair(s) of cards.");
  }
}
