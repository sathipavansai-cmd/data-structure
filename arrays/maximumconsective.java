package arrays;

public class maximumconsective {
    public static void main(String[] args) {
        int [] arr = {1,0,0,0,1,1,0,1,1,1};
        int max =0;
        int count=0;
        for(int i =0;i<=arr.length-1;i++){
            if(arr[i]==1){
                count = count +1;
            }
            else{
                count =0;

            }
            if(count >max){
                max = count;
            }

            
        }
        System.out.println(max);
    }

    
}
