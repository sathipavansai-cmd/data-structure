package arrays;

import java.util.Arrays;

public class tofindleftrotate {
    public static void leftrotate(int [] arr , int k ){
        int [] temp = {1,2,3};
        for(int i = k;i<=arr.length-1;i++){
         arr[i-k]= arr[i];
        }
        for(int j = arr.length-k;j<=arr.length-1;j++){
            arr[j] = temp[j-(arr.length-k)];
        }
        System.out.println(Arrays.toString(arr));
    }
   public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};

    // left rotate by 3 value 
    int k =2;
    leftrotate(arr,k);
   }
}
