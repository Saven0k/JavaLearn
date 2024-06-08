public class Order {
    
    private Buyer buyer;
    private final Product product;
    private int count;

    public  Buyer getBuyer() {
        return this.buyer;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getCount() {
        return this.count;
    }

    public Order(Buyer buyer, Product product, int count) {
        this.buyer = buyer;
        this.product = product;
        this.count = count;
    }

    public static void doOrder(Buyer buyer, Product product, int count) {
        Order order = new Order(buyer, product, count);
    }
}
