
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 *
 * @author 358721
 */
public class Jump {
    private Random random;
    private int length;
    private List<Integer> votes;

    public Jump(){
        votes = new ArrayList<Integer>();
    }

    public void takeJump(){
        for(int i = 0; i < 5; i++){
            votes.add(generateVote(10, 20));
        }
        this.length = generateVote(60, 120);
    }

    public int generateVote(int min, int max){
        random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public int getLength(){
        return length;
    }

    public int getScore(){
        Collections.sort(votes);
        int score = 0;
        for (Integer vote : votes){
            score += vote;
        }
        score -= Collections.min(votes);
        score -= Collections.max(votes);
        score += length;
        return score;
    }

    @Override
    public String toString(){
        return "" + votes;
    }
}