package onauma.week9;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        sortASC(arr);

        //iterates over the array and prints each element in ascending order.
        for (int each : arr) {
            System.out.print(each + " ");
        }
    }

    public static void sortASC(int[] arr) {

        //This method sorts an array in ascending order using a nested loop and swapping technique.

        for (int i = 0; i < arr.length; i++) {    // arr[0] = 10   | arr[1] = 10   | arr[2] = 10
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {   // 10 > 9         | 9 > 8          | 8 > 7         | 10 > 9          | 9 > 8         | 10 > 9
                    int temp = arr[i];   // temp = 10      | temp = 9       | temp = 8      | temp = 10       | temp = 9      | temp = 10
                    arr[i] = arr[j];     // arr[0] = 9     | arr[0] = 8     | arr[0] = 7    | arr[1] = 9      | arr[1] = 8    | arr[2] = 9
                    arr[j] = temp;       // arr[1] = 10    | arr[2] = 9     | arr[3] = 8    | arr[2] = 10     | arr[3] = 9    | arr[3] = 10
                }
            }
        }
    }
}

/*

Question2: Array - Sort Ascending
Write a return method that cam sort an int array in Ascending order without using the sort method of the Arrays class

Ex: int[] arr = {10,9,8,7};

    arr=Sort(arr);  ==> {7,8,9,10};

 */