
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 358721
 */
public class ShoppingBasket {
    private Map<String,Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if (basket.containsKey(product)){
            Purchase p = basket.get(product);
            p.increaseAmount();
        }
        else{
            Purchase p = new Purchase(product, 1, price);
            basket.put(product, p);
        }
    }
    
    public int price(){
        int total = 0;
        for (String key : basket.keySet()){
            total += basket.get(key).price();
        }
        return total;
    }
    
    public void print(){
        for (String key : basket.keySet()){
            System.out.println(basket.get(key));
        }
    }
}
