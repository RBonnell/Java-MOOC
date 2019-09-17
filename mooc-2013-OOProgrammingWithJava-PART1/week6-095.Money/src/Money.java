
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        return new Money(this.euros() + added.euros(), this.cents() + added.cents());
    }
    
    public boolean less(Money compared){
        if(this.euros() < compared.euros()){
            return true;
        }
        if(this.euros() == compared.euros() && this.cents() < compared.cents()){
            return true;
        }
        return false;
    }
    
    public int convertToCents(){
        return (this.euros() * 100) + this.cents();
    }
    
    public Money convertToMoney(int convertedCents){
        int totalCents = convertedCents;
        int e = 0;
        int c = 0;
        while (totalCents >= 100){
            e++;
            totalCents -= 100;
        }
        c += totalCents;
        return new Money(e, c);
    }
    
    public Money minus(Money decremented){
        if (this.convertToCents() >= decremented.convertToCents()){
            return convertToMoney((this.convertToCents() - decremented.convertToCents()));
        }
        return new Money(0, 0);
    }

}
