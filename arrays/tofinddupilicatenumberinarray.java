package arrays;

import java.util.Arrays;

public class tofinddupilicatenumberinarray {
    // To find array is dup;icate or not 
    public static void main(String[] args) {
        
    

    int[] arr = {1,1,2,2,3,4,4,5};

    int i = 0;
    for(int j=1;j<=arr.length-1;j++){
        if(arr[i]!=arr[j]){
             i++;
            arr[i] = arr[j];
           
        }
    }
    System.out.println(Arrays.toString(Arrays.copyOf(arr, i+1)));

    }


    
}
