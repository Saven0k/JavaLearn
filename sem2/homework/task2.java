// Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.

public class task2 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 2, 1, 9 };
        int[] arr2 = { 2, 5, 0 };
        int[] arr3 = { 3, 2, 5 };

        System.out.println(difference(arr1));
        System.out.println(difference(arr2));
        System.out.println(difference(arr3));
    }

    public static int difference(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив пустой");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        int diff = max - min;

        return diff;
    }
}