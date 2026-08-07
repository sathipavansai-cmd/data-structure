package arrays;

public class tofindlongestsubarraywithsumk {
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,5,6,6};

        int max = 0;
        int sum = 0;
        int right = 0;
        int left = 0;
        int k =3;
        while(right<arr.length-1){
      
          sum = sum+arr[right];

           while(sum > k  && left<=right ){
            sum = sum - arr[left];
            left++;
           }
           if(sum == k){
            max =  Math.max(max,right-left + 1); 
           }

            right++;

        }
        System.out.println("longest sub array is " + max);
    }
}
