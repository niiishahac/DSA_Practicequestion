
public class multiarray1{
    public static void main(String[] args) {
        
        int[][] arr1={{1,2,3},{4,5,6},{8,7,9}};
        // snake pattern
        // --------------------------------------------
        // for(int i=0;i<arr1.length;i++){
        //         if(i%2==0){
        //             for(int j=0;j<arr1[0].length;j++){
        //             System.out.print(arr1[i][j]+" ");
        //             }
        //         }
        //         else{
        //             for(int j=arr1[0].length-1;j>=0;j--){
        //                 System.out.print(arr1[i][j]+" ");
        //             }
        //         }
        //         System.out.println();    
        //     }
        // ---------------------------------------
        // reverse all rows
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=arr1[0].length-1;j>=0;j--){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // reverse all cols
        // for(int j=0;j<arr1[0].length;j++){
        //     for(int i=arr1.length-1;i>=0;i--){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // -----------------------------------------
        //print colwise
        // for(int j=0;j<arr1[0].length;j++){
        //     for(int i=0;i<=arr1.length-1;i++){
        //         System.out.print(arr1[i][j]+" ");

        //     }
        //     System.out.println();
        // }
        // ----------------------------------------
        // snake colwise
        // for(int j=0;j<arr1[0].length;j++){
        //     if(j%2==0){
        //         for(int i=0;i<arr1.length;i++){
        //             System.out.print(arr1[i][j]+" ");
        //         }
        //     }
        //     else{
        //         for(int i=arr1.length-1;i>=0;i--){
        //             System.out.print(arr1[i][j]+" ");

        //         }
        //     }
        //     System.out.println();
        // }
        // ---------------------------------------------
        // transpose of square matrix
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[0].length;j++){
        //         if(i<j)
        //         {
        //             int temp=arr1[i][j];
        //             arr1[i][j]=arr1[j][i];
        //             arr1[j][i]=temp;
                    
        //         }

        //     }
        // }
        // for(int[] a:arr1){
        //     for(int ele:a){
        //     System.out.print(ele+" ");
        //     }
        //     System.out.println();
        // }
        // --------------------------------------
//         void transpose(int N, int mat[][N]) {
//     // Transpose the matrix
//     for(int i = 0; i < N; i++) {
//         for(int j = i + 1; j < N; j++) {
//             int temp = mat[i][j];
//             mat[i][j] = mat[j][i];
//             mat[j][i] = temp;
//         }
//     }

//     // Print the transposed matrix
//     for(int i = 0; i < N; i++) {
//         for(int j = 0; j < N; j++) {
//             System.out.print(mat[i][j] + " ");
//         }
//         System.out.println();
//     }
// }

    }
}