package arrays;
import java.util.Arrays;
public class tofindleftrotate {


    public static void leftrotate(int [] arr,int left,int right){
        

        while(left<=right){

            int temp = arr[left];
            arr[left ] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
       
    }
    public static void main(String[] args) {
        int k = 3;
        
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length-1;
        leftrotate(arr, 0, k-1);
        leftrotate(arr, k, n);
        leftrotate(arr,0 , n);
         System.out.println(Arrays.toString(arr));


        
        
    }





}
