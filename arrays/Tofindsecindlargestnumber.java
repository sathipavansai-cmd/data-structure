package arrays;
import java.util.*;

public class Tofindsecindlargestnumber {
    public static void main(String[] args) {
        int [] arr = {1,6,9,8,9,9};
        int n = arr.length; 
        Arrays.sort(arr);
        int largest = arr[n-1];
        int secondlargest = -1;
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
             secondlargest = arr[i];
            break;
            }
        }
        System.out.println(secondlargest);
    }
    
}
