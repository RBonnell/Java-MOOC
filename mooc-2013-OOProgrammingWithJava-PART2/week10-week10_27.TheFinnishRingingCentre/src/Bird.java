
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public int getRingingYear(){
        return this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object other){
        if (other == null || (this.getClass() != other.getClass())){
            return false;
        }

        Bird otherBird = (Bird)other; // cast Object other as Bird

        if (this.latinName.equals(otherBird.latinName) 
            && this.ringingYear == otherBird.ringingYear){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        hash = 79 * hash + this.ringingYear;
        return hash;
    }
}


