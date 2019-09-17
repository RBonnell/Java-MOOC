package people;
/**
 *
 * @author 358721
 */
public class Student extends Person{
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    public void study(){
        this.credits++;
    }
    
    public int credits(){
        return this.credits;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n  credits ").append(this.credits());
        return sb.toString();
    }
}
