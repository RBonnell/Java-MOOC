package people;
/**
 *
 * @author 358721
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n").append("  ").append(address);
        return sb.toString();
    }
}
