public class ProductException  extends RuntimeException{
    public ProductException(){}

    public ProductException(Product expected) {
        super(String.format("Ожидали существующий продукт из списка, а получили '#s'", expected));
    }

}
