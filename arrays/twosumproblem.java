package arrays;
import java .util.*;
public class twosumproblem {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};

         Arrays.sort(arr);
           int left =0;
           int right = arr.length-1;


         while(left<=right){
            if(arr[left] + arr[right] ==6){
               System.out.println(left + ", " + right);

                break;
            }
            if(arr[left] + arr[right] < 6){
                left ++;
            }
            if(arr[left] + arr[right] > 6){
               right--;
            }
            
         }

        
    }
    
}
