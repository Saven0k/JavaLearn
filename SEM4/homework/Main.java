public class Main {
    public static enum Holiday {
        NEWYEAR, EIGHTMARCH, TWTHFEBRUARY, NO;
    }

    public final static Buyer[] buyers = {
        new Buyer("Max", 15, "7-888-888-88-88", Buyer.Gender.MALE),
        new Buyer("Olga", 15, "7-123-888-22-88", Buyer.Gender.FEMALE),
    };

    public final static Product[] products =  {
        new Product("Milk", 3),
        new Product("chips", 13),
        new Product("meat", 35),
        new Product("soup", 350),
        new Product("Water", 32),
    };
    private static  Order[] orders = new Order[5];

    private static  boolean isInArray(Object[] arr, Object o) {
        for (Object arr1 : arr) {
            if (arr1.equals(o)) { 
                return true;
            }
        }
        return false;
    }

    public static Order buy(Buyer buyer, Product product, int count) {
        if (!isInArray(buyers, buyer)) 
            throw new CustomerException(buyer);
        if (!isInArray(products, product))
            throw new ProductException(product);
        if (count <= 0 || count > 100)
            throw new AmountException(count);
        return new Order(buyer, product, count);
    }
    
    public static  void Celebrate(Buyer[] buyers, Holiday holiday) {
        for (Buyer b : buyers) {
            if (holiday == Holiday.EIGHTMARCH) {
                if (b.getSex() == Buyer.Gender.FEMALE) {
                    System.out.println("Дорогая" + b.getName() + "! Поздравляем с 8 марта");
                }
            }
            if (holiday == Holiday.NEWYEAR) {
                System.out.println("Поздравляем всех с Новым годом!");
            }

            if (holiday == Holiday.TWTHFEBRUARY) {
                if (b.getSex() == Buyer.Gender.MALE) {
                    System.out.println("Дорогой" + b.getName() + "! Поздравляем с 23 Февраля");
                }
            }
        }
    }
    public static void main(String[] args) {

        Object[][] ob =  {
            {buyers[0], products[0], 1},
            {buyers[1], products[1], -1},
            {buyers[0], products[2], 150},
            {buyers[1], new Product("Volf", 1500), 1},
            {new Buyer("null", 21, "192837791283", Buyer.Gender.MALE), products[3], 1},
        };

        int capacity = 0;
        int i = 0;

        while (capacity != orders.length - 1 || i != ob.length) {
            try {
                orders[capacity] = buy((Buyer) ob[i][0], (Product) ob[i][1], (int) ob[i][2]);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (CustomerException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                e.printStackTrace();
            } finally  {
                System.out.println("Заказ сделан: " + capacity);
            }
            ++i;
        }
        
    }
}
