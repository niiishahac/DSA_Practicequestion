import java.util.*;
public class slinding1 {
    // MAX SUM OF SUBARRAY OF SIZE K-------------------------------------------
    // BRUTE FORCE APPROACH======
    // public static void maxsumarray(int[] arr,int k){
    //     int n=arr.length;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0;i<=n-k;i++){
    //         int sum=0;
    //         for(int j=i;j<i+k;j++){
    //             sum+=arr[j];    
    //         }
    //         maxSum=Math.max(maxSum, sum);
    //     }
    //     System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the size of array");
    //     int n=sc.nextInt();
    //     System.out.println("Enter the elements of array");
    //     int [] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     System.out.println("Enter the size of subarray");
    //     int k=sc.nextInt();
    //     maxsumarray(arr, k);

    // }
    // BETER APPROACH==============
    // public static void maxsum(int[] arr,int k){
    //     int n=arr.length;
        
    //     // PREFIX SUM APPROACH
    //     int[] prefixsum=new int[n];
    //     prefixsum[0]=arr[0];
    //     for(int i=1;i<n;i++){
    //         prefixsum[i]=prefixsum[i-1]+arr[i];
    //     }
    //     int maxsum=prefixsum[k-1];
    //     for(int i=k;i<n;i++){
    //         int sum=prefixsum[i]-prefixsum[i-k];
    //         maxsum=Math.max(maxsum, sum);
    //     }
    //     System.out.println("Maximum sum of subarray of size " + k + " is: " + maxsum);
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the size of array");
    //     int n=sc.nextInt();
    //     int [] arr=new int[n];
    //    for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();       
    //    }
    //    System.out.println("Enter the size of subarray");
    //    int k=sc.nextInt();
    //     maxsum(arr, k);
    
    // }
    // SLIDING WINDOW APPROACH=================
    // public static void maxsum(int[] arr,int k){
    //     int n=arr.length;
    //     int windowsum=0;
    //     for(int i=0;i<k;i++){
    //         windowsum+=arr[i];
    //     }
    //     int maxsum=windowsum;
    //     for(int i=k;i<n;i++){
    //         windowsum+=arr[i]-arr[i-k];
    //         maxsum=Math.max(maxsum,windowsum);
    //     }
    //     System.out.println("Maximum sum of subarray of size " + k + " is: " + maxsum);
    // }
    
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the size of array");
    //     int n=sc.nextInt();
    //     int [] arr=new int[n];
    //    for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();       
    //    }
    //    System.out.println("Enter the size of subarray");
    //    int k=sc.nextInt();
    //    maxsum(arr, k);

    // }
    // ------------------------------------------------------------
    // first negative number in every window of size k---------
    // brute force approach====
//     public static void firstnegno(int[] arr,int k){
//         int n=arr.length;
//         List<Integer> res=new ArrayList<>();
//         for(int i=0;i<=n-k;i++){
//             boolean flag=false;
//             for(int j=i;j<i+k;j++){
//                 if(arr[j]<0){
//                     res.add(arr[j]);
//                     flag=true;
//                     break;
//                 }

//             }
//             if(!flag){
//                 res.add(0);   
//             }
//         }
//         System.out.println(res);

//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int n=sc.nextInt();
//         int [] arr=new int[n];
//        for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();       
//        }
//        System.out.println("Enter the size of subarray");
//        int k=sc.nextInt();

//          firstnegno(arr, k);
    
// }
// better approach------------------prefix sum approach
// public static void firstnegno(int[] arr,int k){
//     int n=arr.length;
//     List<Integer> res=new ArrayList<>();
//     List<Integer> neg=new ArrayList<>();
//     // store the index of negative number in the array
//     for(int i=0;i<n;i++){
//         if(arr[i]<0){
//             neg.add(i);
//         }
//     }
//     // traverse the array in window of size k and check if there is any negative number in the window
//     int index=0;
//     for(int i=0;i<n-k;i++){
//         while(index<neg.size()&& neg.get(index)<i){
//             index++;
//         }
//         if(index<neg.size()&& neg.get(index)<i+k){
//             res.add(arr[neg.get(index)]);
//         }
//         else{
//             res.add(0);
//         }
//     }
//     System.out.println(res);        
//     }
// public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int n=sc.nextInt();
//         int [] arr=new int[n];
//        for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();       
//        }
//        System.out.println("Enter the size of subarray");
//        int k=sc.nextInt();
//        firstnegno(arr, k);
// }
// sliding window approach------------------
public static void firstneg(int[] arr,int k){
    int n=arr.length;
    List<Integer> res=new ArrayList<>();
    Queue<Integer> q=new LinkedList<>();
    // first window
    for(int i=0;i<k;i++){
        if(arr[i]<0){
            q.add(i);
        }
    }
    res.add(q.isEmpty()?0:q.peek());
    // slide
    for(int i=k;i<n;i++){
        // remove the element which is out of the window
        if(!q.isEmpty()&& arr[i-k]==q.peek()){
            q.poll();
        }
        // add the new element
        if(arr[i]<0){
            q.add(i);
        }
        res.add(q.isEmpty()?0:q.peek());
}
    System.out.println(res);
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
       for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();       
       }
       System.out.println("Enter the size of subarray");
       int k=sc.nextInt();
       firstneg(arr, k);


}
}
