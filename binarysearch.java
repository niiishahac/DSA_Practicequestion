// -----------------------------------------------------------------------------------
// import java.util.Scanner;
// public class binarysearch{
//     public static int binaryno(int arr[],int target,int n){
//         int start =0;
//         int end=n-1;

//         while(start<=end){
//         int mid=(start+end)/2;
//             if(target==arr[mid]){
//                 return mid;
//             }
//             if(target>arr[mid]){
//                 start=mid+1;
//             }
//             if(target<arr[mid]){
//                 end=mid-1;
//             }    
//         }
//         return -1;

//     }
    
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("input size");
//         int n=sc.nextInt();
//         int[]arr=new int[n];
//         System.out.println("input array");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int target=5;
//         System.out.println("index:");
//         System.out.println(binaryno(arr, target, n));

//     }
// }
// -----------------------------------------------------------------------
// dec form of binary search
// import java.util.*;
// public class binarysearch{
//     public static int binary(int arr[],int target){
//         int start=0;
//         int end=arr.length-1;
        
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target==arr[mid]){
//                 return mid;
//             }
//             if(target>arr[mid]){
//                 end=mid-1;
//             }
//             if(target<arr[mid]){
//                 start=mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("size:");
//          int n=sc.nextInt();
//         System.out.println("target");
//         int target=sc.nextInt();
//         int []arr=new int[n];
//         System.out.println("dec array input");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("index:");
//         System.out.println(binary(arr, target));
        
//     }
// }
// ----------------------------------------------------------------------------
// order of known search
// import java.util.*;
// public class binarysearch{
//     public static int binary(int arr[],int target){
//         int start=0;
//         int end=arr.length-1;
//         
//         while(start<=end){
             // int mid=start+(end-start)/2;
//             if(arr[0]>arr[1]){
//                 if(target==arr[mid]){
//                  return mid;
//                  }
//              if(target>arr[mid]){
//                end=mid-1;
//              }
//              if(target<arr[mid]){
//                 start=mid+1;
//              }

//             }
//             if(arr[0]<arr[1]){
//                 if(target==arr[mid]){
//                 return mid;
//             }
//             if(target>arr[mid]){
//                 start=mid+1;
//             }
//             if(target<arr[mid]){
//                 end=mid-1;
//             }    

//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("size:");
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         System.out.println("input array:");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("target:");
//         int target=sc.nextInt();
//         System.out.println("index:");
//         System.out.println(binary(arr, target));
        
//     }
// }
// ----------------------------------------------------------------------------------
// first occurance of number
// import java.util.*;
// public class binarysearch{
//     public static int binaryno(int arr[],int target){
//         int start =0;
//         int end=arr.length-1;
//         int res=-1;
        
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target==arr[mid]){
//                 res=mid;
//                 // for 1st occurance
//                 end=mid-1;
//                 // for last occurance -> start=mid+1;

//             }
//             if(target>arr[mid]){
//                 start=mid+1;
//             }
//             if(target<arr[mid]){
//                 end=mid-1;
//             }    
//         }
//         return res;

//     }
    
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("input size");
//         int n=sc.nextInt();
//         int[]arr=new int[n];
//         System.out.println("input array");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int target=5;
//         System.out.println("index:");
//         System.out.println(binaryno(arr, target));

//     }
// }
// ---------------------------------------------------------------------------
// count no occurance
// import java.util.Scanner;

// public class binarysearch {

//     // Find first occurrence
//     public static int firstOccurrence(int[] arr, int target) {
//         int start = 0, end = arr.length - 1, res = -1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 res = mid;
//                 end = mid - 1; // move left
//             } else if (arr[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return res;
//     }

//     // Find last occurrence
//     public static int lastOccurrence(int[] arr, int target) {
//         int start = 0, end = arr.length - 1, res = -1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 res = mid;
//                 start = mid + 1; // move right
//             } else if (arr[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input size:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Input sorted array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Input target element:");
//         int target = sc.nextInt();

//         int first = firstOccurrence(arr, target);
//         int last = lastOccurrence(arr, target);

//         if (first == -1) {
//             System.out.println("Element not found.");
//         } else {
//             int count = last - first + 1;
//             System.out.println("Count of target " + target + ": " + count);
//         }
//     }
// }
// --------------------------------------------------------------------------
// binary no of times a sortd array is rotated
// import java.util.*;
// public class binarysearch{
//     public static int count(int arr[]){
//         int n=arr.length;
//         int start=0;
//         int end=n-1;
//         while(start<=end){
//             if(arr[start]<=arr[end]){
//                 return start;
//             }
//             int mid =start+(end-start)/2;
//             int prev=(mid+n-1)%n;
//             int next=(mid+1)%n;
//             // Check if mid is the minimum element
//             if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
//                 return mid;
//             }
//             else if(arr[start]<=arr[mid]){
//                 // Left part is sorted, go to right part
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }    
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("size:");
//         int n=sc.nextInt();
//         System.out.println("input array:");
//         int []arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("no of times a sorted array rotated:");
//         System.out.println(count(arr));   
//     }
// }
// -------------------------------------------------------------------------------- 
// import java.util.*;
// public class binarysearch{
//     public static int lowerbound(int arr[],int target){
//         int n=arr.length;
//         int start=0;
//         int end=n-1;
//         int ans=n;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]>=target){
//                 ans=mid;
//                 end=mid-1;   
//             }
//             else{
//                 start=mid+1;
//             }
//         }
//         return ans;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("size:");
//          int n=sc.nextInt();
        
//         System.out.println("target");
//         int target=sc.nextInt();
//         int []arr=new int[n];
//         System.out.println("array input");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("index:");
    
//         System.out.println(lowerbound(arr, target));
        
//     }
// }
// ----------------------------------nearly sorted array--------------------
// import java.util.*;
// public class binarysearch{
//     public static int binary(int arr[],int target){
//         int n=arr.length;
//         int start=0;
//         int end=n-1;
//         while(start<=end){
//             int mid= start+(end-start)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             if(arr[start]<=arr[mid-1]&& arr[mid-1]==target){
//                 return mid-1;
//             }
//             if(arr[end]<=arr[mid+1]&&arr[mid+1]==target){
//                 return mid+1;
//             }
//             if(target<arr[mid]){
//                 end=mid-2;
//             }
//             else{
//                 start=mid+2;
//             }
//         }
//         return -1;


//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int target=5;
//         System.out.println(binary(arr,target));

        
//     }
// }
// ---------------









    

    

