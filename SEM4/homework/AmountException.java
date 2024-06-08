public class AmountException extends RuntimeException{
    public AmountException(){}

    public AmountException(int expected) {
        super(String.format("Ожидали положительное колличество  продуктов , а получили отрицательное  '#s'", expected));
    }
}
