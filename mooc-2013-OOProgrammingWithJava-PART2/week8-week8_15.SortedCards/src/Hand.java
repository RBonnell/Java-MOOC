
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 358721
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card : hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    @Override
    public int compareTo(Hand compared){
        int hand1 = 0;
        int hand2 = 0;
        for (Card card : this.hand){
            hand1 += card.getValue();
        }
        for (Card card : compared.hand){
            hand2 += card.getValue();
        }
        return hand1 - hand2;
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitValueSorter = new SortAgainstSuitAndValue();
        Collections.sort(hand, suitValueSorter );
    }
}
