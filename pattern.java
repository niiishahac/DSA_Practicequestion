
public class pattern {
    public static void main(String[]args){
    // pattern based on given input row,col...............................
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("row");
    //     int row=sc.nextInt();
    //     System.out.println("col");
    //     int col=sc.nextInt();
    //     for(int i=1;i<=row;i++){
    //         for(int j=1;j<=col;j++){
    //             System.out.print("* ");
    //     }
    //     System.out.println();

    // }
    // ----------------------------------------------------------
    // pattern of numberbased on j:
    // Scanner sc=new Scanner(System.in);
    // System.out.print("enter the number:");
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println(" ");
    // }
    // --------------------------------------------------------
    //  pattern based on i:
    // Scanner sc=new Scanner(System.in);
    // System.out.print("enter the number:");
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print(i +" " );
    //     }
    //     System.out.println( );
    // }
    // ----------------------------------------------------
    // alphabet logic based on i ->print ascii number of alphabet
    // Scanner sc= new Scanner(System.in);
    // System.out.print("enter the number:");
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print((i+64)+" ");
    //     }
    //     System.out.println();
    // }
    // ---------part2 of this based on j
    // Scanner sc =new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print((j+64)+" ");
    //     }
    //     System.out.println();
    // }
    // ----------------------------------------------------
    // for printing alphabet based on j
    // Scanner sc =new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print((char)(j+64)+" ");
    //     }
    //     System.out.println();
    // }
    // ---------------------------------------------------
    // pattern where j is <=i condition (right angle triangle of star or number or alphabet) 
    // Scanner sc= new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=0;j<=i;j++){
    //         System.out.print("* or j or i or (char)(j+64) or (char)(i+64)");
    //     }
    //     System.out.println();
    // }
    // ----------------------------------------------
    // combination of 1 and ABCD
    // 1
    // 123
    // ABCD
    // 12345PATTERN
    // Scanner sc= new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if(i%2!=0){
    //             System.out.print(j+" ");
    //         }
    //         else{
    //             System.out.print((char)(j+64)+" ");
    //         }
            
    //     }
    //     System.out.println();
    // }
    // --------------------------------------------
    // i+j=n+1 print ulta triangle
    // ****
    // ***
    // **
    // *
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print("* or i or j or char ");
    //     }
    //     System.out.println();

    // }
    // ---------------------------------------------
    // AAAAA
    // 2222
    // CCC
    // 44
    // E WHERE N=5;
    // Scanner sc= new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
    //         if(i%2!=0){
                // System.out.print(j+" "); /// i+" "
    //         }
    //         else{
    //             System.out.print((char)(j+64))///i+64;
    //         }
    // }
    // System.out.println();   
    //     }
    // -------------------------------------------
    // 1
    // 1 3
    // 1 3 5
    // 1 3 5 7 pattern
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
        // for(int j=1;j<=2*i-1;j++){///j<=i and print(2*j-1)
    //         if(j%2!=0){
    //             System.out.print(j+" ");
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //     System.out.println();
    // }
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10 easy and important use dummy variable.
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // int a=1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(a+" ");
    //         a++;
    //     }
    //     System.out.println();
    // }
    // important i&j are oddthen1 else 0
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // Scanner sc=new Scanner(System.in);
    //  int n=sc.nextInt();
    //  for(int i=1;i<=n;i++){
    //      for(int j=1;j<=i;j++){
    //         if((i%2==0 &&j%2==0 )||(i%2!=0&&j%2!=0)){ or if(i+j)%2=0->1
                
    //             System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
             
    //      }
    //      System.out.println();
    //  }
    // ---------------------------------------------
    // plus sign +
    // Scanner sc= new Scanner(System.in);
    // int n=sc.nextInt();
    // int mid=(n+1)/2;  
    // for(int i=1;i<=n;i++){
    //      for(int j=1;j<=n;j++){ 

    //         if(i==mid ||j==mid){
    //          System.out.print("*");
    //          }
    //         else{
    //          System.out.print(" ");
    //        }
    //     }
    //     System.out.println();
    // }
    // -------------------------------------------
    // hollow rectangle only border par star
    // Scanner sc=new Scanner(System.in);
    // int m=sc.nextInt();
    // int n=sc.nextInt();
    // for(int i=1;i<=m;i++){
    //     for(int j=1;j<=n;j++){
    //         if(i==1||i==m||j==1||j==n){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // --------------------------------------
    // cross X
    // Scanner sc =new Scanner (System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         if(i==j || i+j==n+1){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // --------------------------------------
    // _ _ _ *
    // _ _ * * 
    // _ * * *
    // * * * *
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         if((i+j)<=n){
    //             System.out.print("  ");
    //         }
    //         else{
    //             System.out.print("* ");
    //         }
    //     }
    //     System.out.println();
    // }
    // A
    // BC
    // DEF
    // FGHI
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // char ch='A';
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(ch);
    //         ch++;
    //     }
    //     System.out.println();

    // }------------------------------------------------------------------
    //            *
    //         *  *
    //      *  *  * 
    //   *  *  *  *
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }-----------------------------------------------------------
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }------------------------------------------------------------------
    



    
    

}
}
