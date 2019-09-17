package dungeon;

/**
 *
 * @author 358721
 */
public abstract class Character {
    public int x;
    public int y;
    public int height;
    public int length;

    public Character(int length, int height){
        this.length = length;
        this.height = height;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public String location(){
        return this.x + "x" + this.y + "y";
    }
}
