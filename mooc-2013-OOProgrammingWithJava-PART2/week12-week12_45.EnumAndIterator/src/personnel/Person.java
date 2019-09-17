package personnel;

/**
 *
 * @author 358721
 */
public class Person {
    private String name;
    private Education education;
    
    public Person(String name, Education education){
        this.name = name;
        this.education = education;
    }
    
    public Education getEducation(){
        return this.education;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(", ").append(this.education);
        return sb.toString();
    }
    
}

