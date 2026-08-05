package arrays;

public class singleelemwnt {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,4};
        int result =0;
        for(int num : arr){
            result = result ^ num; 
        }
        System.out.println(result);
    }
    
}
