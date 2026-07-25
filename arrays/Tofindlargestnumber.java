package arrays;
import java.util.*;

public class Tofindlargestnumber {
    public static void main(String[] args) {
        int [] number = {2,5,8,9,1};

        Arrays.sort(number);

        int largest = number[0];

        for(int i=1;i<=number.length-1;i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        System.out.println(largest);
    }
    
}
