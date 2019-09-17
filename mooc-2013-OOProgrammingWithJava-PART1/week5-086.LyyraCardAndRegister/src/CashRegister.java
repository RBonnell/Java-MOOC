
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double ECON_LUNCH = 2.50;
    private static final double GOURMET_LUNCH = 4.00;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= ECON_LUNCH){
            this.cashInRegister += ECON_LUNCH;
            economicalSold++;
            return (cashGiven - ECON_LUNCH);
        }
        return cashGiven;
    }
    
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= ECON_LUNCH){
            card.pay(ECON_LUNCH);
            economicalSold++;
            return true;
        }
        return false;
    }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        
    

    public double payGourmet(double cashGiven) {
            if (cashGiven >= GOURMET_LUNCH){
            this.cashInRegister += GOURMET_LUNCH;
            gourmetSold++;
            return (cashGiven - GOURMET_LUNCH);
        }
            return cashGiven;
    }
    
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= GOURMET_LUNCH){
            card.pay(GOURMET_LUNCH);
            gourmetSold++;
            return true;
        }
        return false;
    }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if (sum > 0){
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
    
        
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
