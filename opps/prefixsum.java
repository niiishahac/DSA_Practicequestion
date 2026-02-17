
import java.util.*; 
public class prefixsum {
    public static List<Integer> prefixsum(int []arr){
        List<Integer> res=new ArrayList<>();
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum=sum-leftSum-arr[i];
            if(leftSum==rightSum){
                res.add(i);

            }       
            leftSum+=arr[i];
         }
         return res;
    }
    public static void main(String[] args){
        int []arr={1,2,3,4,5};
        List<Integer> result=prefixsum(arr);
        for(int x:result){
            System.out.println(x);
        }

    }
    
}
