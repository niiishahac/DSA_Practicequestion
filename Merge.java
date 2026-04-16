import java.util.*;
public class Merge{
    public static int[] mergearaay(int[] arr1,int[] arr2){
        // sort two sorted array and merge it.
        int i=0,j=0,k=0;
        int[] ans=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
    public static int[] mergeSort(int [] arr){
        // create two array of n/2 size
        int[] arr1=new int[arr.length/2];
        int[] arr2=new int[arr.length-arr.length/2];
        // base case
        if (arr.length <= 1) {
            return arr;
        }
        int ind=0;
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[ind++];
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[ind++];
        }
        arr1=mergeSort(arr1);
        arr2=mergeSort(arr2);
        return mergearaay(arr1,arr2);
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int[] sortedArr=mergeSort(arr);
        for(int i=0;i<sortedArr.length;i++){
    System.out.print(sortedArr[i] + " ");
}
        // int m=sc.nextInt();
        // int[] arr2=new int[m];
        // for(int i=0;i<m;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // int[] ans=mergearaay(arr1,arr2);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }
    }

}