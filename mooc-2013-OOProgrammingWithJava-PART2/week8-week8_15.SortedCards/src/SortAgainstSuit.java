import java.util.Comparator;

/**
 *
 * @author 358721
 */
public class SortAgainstSuit implements Comparator<Card> {
    
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSuit()-card2.getSuit();
    }
}
