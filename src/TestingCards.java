import java.lang.reflect.Array;
import java.util.ArrayList;


public class TestingCards {
    public static void main(String[] args) {
        Card card1 = new Card("ace","Spades");
        Card card2 = new Card("four","hearts");
        Card card3 = new Card("five","diamonds");
        Card card4 = new Card("queen","hearts");
        Card card5 = new Card("king","hearts");

        ArrayList<Card> myHand = new ArrayList<>();
        myHand.add(card1);
        myHand.add(card2);
        myHand.add(card3);
        myHand.add(card4);
        myHand.add(card5);
        System.out.println(myHand);

        DeckofCards deck1 = new DeckofCards();
        System.out.println(deck1);

        for(int i = 1; i <=5; i++)
        {
            System.out.printf("Card %d : %s%n",i,deck1.dealTopCard());
        }
    }
}
