/**
 *
 * @author 358721
 */
public class CivilService implements NationalService{
    int daysLeft;
    
    public CivilService(){
        this.daysLeft = 362;
    }
    
    public int getDaysLeft(){
        return this.daysLeft;
    }
    
    public void work(){
        if(this.daysLeft - 1 >= 0){
            this.daysLeft--;
        }
    }
}
