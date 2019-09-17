package containers;

/**
 *
 * @author 358721
 */
public class ProductContainer extends Container{
    private String productName;
    
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }
    
    public String getName(){
        return this.productName;
    }
    
    public void setName(String name){
        this.productName = name;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(": ").append(super.toString());
        return sb.toString();
    }
}
