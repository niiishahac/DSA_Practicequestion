import java.util.*;
// prime no 
public class Revision1{
    public static void main(String[]args){
        // System.out.println("--------------------------------------------------------------------------------");
        // Scanner sc=new Scanner(System.in);
        // // no of integer
        // int t=sc.nextInt(); 
        // for(int i=1;i<=t;i++){
        //     // number
        //     System.out.print("enter the number");
        //     int n=sc.nextInt();
        //     int count=0;
        //     for(int div=2;div*div<=n;div++){
        //         if(n%div==0){
        //             count++;

        //         }
        //     }
        //     if(count==0){
        //         System.out.println(n +"is a prime number");
        //     }else{
        //         System.out.println(n+"is not a prime number");
        //     }
        // }
        // --------------------------------------------------------------------------------------------------
        // range of prime no
        // Scanner sc=new Scanner(System.in);
        // int low=sc.nextInt();
        // int high=sc.nextInt();
        // for(int i =low;i<=high;i++){
        //     int count=0;
        //     for(int div=2;div*div<=i;div++){
        //         if(i%2==0){
        //             count++;
        //             break;
        //         }
        //     } 
        //     if(count==0){
        //         System.out.print(i+"   ");
        //     }  
        // }
        // -----------------------------------------------------------------------------------------------------
        // fibonacci number
    //     Scanner sc =new Scanner(System.in);
    //     int n=sc.nextInt();
    //     fibo(n);

    // }
    // public static void fibo(int n){
    //     if(n==1){
    //         System.out.println("0");
    //     }
    //     if(n==2){
    //         System.out.println("1");
    //     }
    //     int a=0;
    //     int b=1;
    //     int sum=0;
        
    //     for(int i=0;i<n;i++){
    //         // har baar" a "return karwaaga toh all element milega
    //         sum+=a;
    //         System.out.println(a);
    //         int c=a+b;
    //         a=b;
    //         b=c;
    //     }
    //     System.out.println(sum);
        // ----------------------------------------------------------------------------------------------
        // Scanner sc=new Scanner (System.in);
        // int n=sc.nextInt();
        // digit=n    
    //     codigit(n);    
    // }
    // public static void codigit(int n){
    //     int count=0;
    //     while(n!=0){
    //         n/=10;
    //         count++;
    //     }
    //     System.out.println("no of digit");
    //     System.out.println(count);
        // -------------------------------------------------------------------------------------------
        // digits of number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dinum(n);
    }
    public static void dinum(int n){
        
        int count=0;
        while(n!=0){
            n=n/10;
            count+=1;   
        }
        System.out.println(count);
        int div=(int)Math.pow(10,count-1);
        // correction left

        while(count!=0){
            int q=n/div;
            System.out.print(q+" ");
            n=n%div;
            div=div/10;
            count--;   
        }
        // ---------------------------------------------------------------------------------------
        
    }
}

        