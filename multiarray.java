import java.util.*;
public class multiarray{
    public static void main(String args[]){
        int m=3;
        int n=3;
        int[][] arr1=new int[m][n];
        Scanner sc=new Scanner(System.in);
        System.out.println("input array");
        // --------------------------------------------------------
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         arr1[i][j]=sc.nextInt();
        //     }
        //      System.out.println();
        // }

        // output
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.println(arr1[i][j]+" ");
        //     }
        //      System.out.println();
        // }
        // --------------------------------------------------
        // row with max sum
        // int max=Integer.MIN_VALUE;
        // int row=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
             System.out.println();
        }

        
        // for(int i=0;i<m;i++){
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         sum+=arr1[i][j];
        //     }
        //     max=Math.max(max,sum);
        //     row=i;
        //      System.out.println();
        // }
        // System.out.println(row+"  "+max);
        // --------------------------
        // column with print
        // for(int i=0;i<m;i++){ //m=arr.length
            
        //         System.out.println(arr1[i][0]);
            
        //      System.out.println();
        // }
        // for(int i=0;i<m;i++){

        //         System.out.println(arr1[i][1]);
            
        //      System.out.println();
        // }
        // for(int i=0;i<m;i++){
        //     System.out.println(arr1[i][2]);
        //      System.out.println();
        // }
        // for(int j=0;j<arr1[0].length;j++){
        //     for(int i=0;i<arr1.length;i++){
        //         System.out.println(arr1[i][j]);
        //     }
        //     System.out.println();
        // }
        // // print array
        // for(int i=0;i<arr1.length;i++){
        //     for(int ele:arr1[i]){
        //         System.out.println(ele+" ");
        //     }
        //     System.out.println();
        // }
        // // print
        // for(int[] a:arr1){
        //     for(int ele:a){
        //     System.out.println(ele+" ");
        //     }
        // }
        // ----------------------------------------
        // snake pattern
        for(int i=0;i<m;i++){
                if(i%2==0){
                    for(int j=0;j<n;i++){
                    System.out.println(arr1[i][j]);
                    }
                }
                else{
                    for(int j=arr1[0].length-1;j>=0;j++){
                        System.out.println(arr1[i][j]);
                    }
                }
                System.out.println();    
            }
        }
        
    }
