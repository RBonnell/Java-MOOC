package farmsimulator;

import java.util.Random;

/**
 *
 * @author 358721
 */


public class Cow implements Milkable, Alive{
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name;
    private double udderCapacity;
    private double amount;
    private Random random;
    
    public Cow(){
        this.random = new Random();
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.udderCapacity = 15 + random.nextInt(26);
        this.amount = 0;
    }
    
    public Cow(String name){
        this.random = new Random();
        this.name = name;
        this.udderCapacity = 15 + random.nextInt(26);
        this.amount = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udderCapacity;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    @Override
    public void liveHour(){
        double added = ((7.0 + random.nextInt(14)) / 10);
        if (this.amount + added > this.udderCapacity){
            this.amount = this.udderCapacity;
        }
        else{
            this.amount += added;
        }
    }
    
    @Override
    public double milk() {
        double amt = this.getAmount();
        this.amount = 0;
        return amt;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" ").append(Math.ceil(this.amount)).append("/").append(this.udderCapacity);
        return sb.toString();
    }


    
}
