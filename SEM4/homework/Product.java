public class Product {
    private String name;
    private int cost;

    public String getName() {
        return  name;
    }
    
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    
}
