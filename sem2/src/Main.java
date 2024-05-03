import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int num = 7;
        int index = 2;
        int resultArr[] = newArray(array, num);
        System.out.println(Arrays.toString(resultArr));
        int resultArr2[] = changesArray(array,num,index);
        System.out.println(Arrays.toString(resultArr2));
    }

    public static int[] newArray(int[] array, int number) {
        int[] newArr = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }

        newArr[array.length] = number;

        return newArr;
    }

    public static int[] changesArray(int[] array, int number, int index) {
        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArr[i] = number;
            } else {
                newArr[i] = array[i];
            }
        }

        return newArr;
    }
}