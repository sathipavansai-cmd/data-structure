package arrays;
import java.util.*;

public class tofindarrayissortedornot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,7,6};
        int flag = 0;

        for(int i =1 ; i<=arr.length-1;i++){
            if(arr[i]< arr[i-1]){
                 flag = 1;

            }
           

            
        }
        if(flag == 0){
                System.out.println("array is  sorted");
            }
            else{

            


        System.out.println("array is not sorted");
            }
    }
}
