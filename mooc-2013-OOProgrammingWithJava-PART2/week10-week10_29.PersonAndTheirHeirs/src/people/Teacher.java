package people;
/**
 *
 * @author 358721
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    public int salary(){
        return this.salary;
    }
    
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString()).append("\n  salary ").append(this.salary()).append(" euros/month");
    return sb.toString();
    }
}
