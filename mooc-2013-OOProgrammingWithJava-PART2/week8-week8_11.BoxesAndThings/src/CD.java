/**
 *
 * @author 358721
 */
public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    
    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.publishingYear = year;
    }
    
    @Override
    public double weight(){
        return 0.1;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
    
}
