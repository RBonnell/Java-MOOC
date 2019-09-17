package dungeon;

/**
 *
 * @author 358721
 */
public class Player extends Character {

    public Player(int length, int height){
        super(length - 1, height - 1);
        this.x = 0;
        this.y = 0;
    }

    public void move(char input){
        switch (input) {
            case 'w':
                if (this.y > 0){
                    this.y--;
                }   
                break;
            case 'a':
                if (this.x > 0){
                    this.x--;
                }   
                break;    
            case 's':
                if (this.y < this.height){
                    this.y++;
                }   
                break;
            case 'd':
                if (this.x < this.length){
                    this.x++;
                }   
                break;
            default:
                break;
        }
    }

    @Override
    public String toString(){
        return "@ " + this.x + " " + this.y;
    }
}
