package arrays;

import java.util.Arrays;

public class movezerotoright {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,4,0,5,6};

        int j = 0; // pointer for non-zero placement

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
