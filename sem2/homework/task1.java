package SEM2;
// Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

public class task1 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 2, 3, 4 };
        int[] arr2 = { 2, 2, 0 };
        int[] arr3 = { 1, 3, 5 };

        System.out.println(countEvens(arr1));
        System.out.println(countEvens(arr2));
        System.out.println(countEvens(arr3));
    }

    public static int countEvens(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив пустой");
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
