import java.util.*;

public class Array {
    public static void main(String[]args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int []arr=new int[n];
    //     for(int i=0;i<arr.length;i++){
    //         // input 
    //         arr[i]=sc.nextInt();
    //     }
    //     // print array 1;
    //     System.out.println("print the array 1");
    //     printarr(arr);
    //     int []arr2=arr;
    //     System.out.println("copied array with updated value");
    //     arr2[0]=1;
    //     arr[2]=6;
    //     printarr(arr2);
        
        
    // }
    // public static void printarr(int []arr){
    //     // Scanner sc=new Scanner(System.in);
    //     // for(int i=0;i<arr.length;i++){
    //     //     // input 
    //     //     arr[i]=sc.nextInt();
    //     // }
    //     System.out.println("original");
    //     for(int i=0;i<arr.length;i++){
    //         // input 
    //         System.out.println(arr[i]);        
    //     }
    // -----------------------------------------------------------------------------------------
    // largest element in array
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    // int []arr=new int[n];
    // int sum=0;
    // System.out.println("input");
    // for(int i=0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    // }
    // System.out.println("output");
    
    // for(int x:arr){
    //     System.out.println(x);
    //     sum+=x;
    // }
    // System.out.println("sum is"+sum);
    // --------------------------------------------------------------------------------------
    
    // max value at array
    // int []arr=new int[n];
    
    // System.out.println("input");
    // for(int i=0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    // }
    // // searched element a
    // int a=sc.nextInt(); 
    // int count=0;
    // for(int x:arr){
    //     if(x==a){
    //         System.out.println("index:"+count);
    //     }
    //     count++;
    // }
    // ------------------------------------------------------------------------------------------------
    // max of the array
    // int []arr=new int[n];
    // System.out.println("input");
    // for(int i=0;i<n;i++){
    //     arr[i]=sc.nextInt();
    // }
    // int max=arr[0];
    // for(int i=0;i<n;i++){
    //     if(arr[i]>max){
    //     max=arr[i];
    // }
    // } 
    // System.out.println("max:"+ max);
    // -----------------------------------
    // find the last occurance of given number
//     int []arr=new int[n];
    
//     int lastindex=-1;
//     System.out.println("input");
//     for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("number to find the occerance");
//     int number=sc.nextInt();
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==number){
//             lastindex=i;
//         }
        
//     }
//     System.out.println("last occurance of:"+ number +" is "+ lastindex);
// --------------------------------------------

System.out.println("enter array");
int[] arr1=new int[n];

for (int i = 0; i < n; i++) {
    arr1[i] = sc.nextInt();
}
int[] arr2=new int[n];
System.out.println("diff");
int d=sc.nextInt();
int j=0;
for(int i=d;i<n;i++){
    arr2[j]=arr1[i];  
    j++;  
}
int sum=n-d;
for(int k=0;k<d;k++){
    
    arr2[sum]=arr1[k];
    sum++;

}
for(int ele:arr2){
    System.out.println(ele +" ");
}

 }

}

