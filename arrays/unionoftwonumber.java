package arrays;

import java.util.*;
public class unionoftwonumber {
    public static void main(String[] args) {
        
    
  int[] arr1 = {1,2,3};
  int[] arr2 = {1,5,6};

  Set<Integer> union = new HashSet<>();

  for(int num1 : arr1){
    union.add(num1);
  }
  for(int num : arr2){
    union.add(num);
    System.out.println(union); 

  }
    
}
}
