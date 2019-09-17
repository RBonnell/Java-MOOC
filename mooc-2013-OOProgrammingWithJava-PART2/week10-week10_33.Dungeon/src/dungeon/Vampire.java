package dungeon;
import java.util.Random;

/**
 *
 * @author 358721
 */

public class Vampire extends Character {
    private Random random = new Random();

    public Vampire(int length, int height){
        super(length, height);
        this.x = random.nextInt(length);
        this.y = random.nextInt(height);

        initialPositionNotZero();
    }

    public void resetInitialPosition(){
        this.x = random.nextInt(length);
        this.y = random.nextInt(height);

        initialPositionNotZero();
    }

    public void initialPositionNotZero(){
        while (this.x == 0){
            this.x = random.nextInt(length);
        }

        while (this.y == 0){
            this.y = random.nextInt(height);
        }
    }

    public void move(){
        OUTER:
        while (true){
            int direction = random.nextInt(4);
            switch (direction){
                case 0:
                    if (this.y > 0){
                        this.y--;
                        break OUTER;
                    }
                    break;
                case 1:
                    if (this.y < this.height - 1){
                        this.y++;
                        break OUTER;
                    }
                    break;
                case 2:
                    if (this.x > 0){
                        this.x--;
                        break OUTER;
                    }
                    break;
                case 3:
                    if (this.x < this.length - 1){
                        this.x++;
                        break OUTER;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public String toString(){
        return "v " + this.x + " " + this.y;
    }
}
