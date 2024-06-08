public class CustomerException   extends RuntimeException{

    public CustomerException() {}

    public CustomerException(Buyer expected) {
        super(String.format("Ожидали настоящего покупателя из массива, а получили '#s'", expected));
    }
    
}
