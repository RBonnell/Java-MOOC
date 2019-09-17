package clicker.applicationlogic;

/**
 *
 * @author 358721
 */
public class PersonalCalculator implements Calculator{
    private int value;
    
    public PersonalCalculator(){
        this.value = 0;
    }
   
    @Override
    public int giveValue() {
        return this.value;
    }

    @Override
    public void increase() {
        this.value++;
    }
}
