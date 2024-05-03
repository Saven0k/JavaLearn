// Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class task3 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 0, 0, 9 };
        int[] arr2 = { 2, 5, 0 };
        int[] arr3 = { 3, 2, 5, 0,0 };

        System.out.println(GetBoollean(arr1));
        System.out.println(GetBoollean(arr2));
        System.out.println(GetBoollean(arr3));
    }


    public static boolean GetBoollean(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив пустой");
        }

        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return result = true;
            }
        }
        return result;

    }
}
