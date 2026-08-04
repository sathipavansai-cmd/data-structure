package arrays;

public class missingelement {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5} ;
        int n = arr.length+1;
        int  ans = n*(n+1)/2;
         int sum =0;
        for(int i=0;i<=arr.length-1;i++){
           
            int result = arr[i] + sum;
            sum = result;
         
        }
        System.out.println(ans-sum);
        
    }
    
}
