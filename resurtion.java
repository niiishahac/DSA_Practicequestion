

public class resurtion {
    public static void printDec(int n){
        // base condition..
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        // self work
        System.out.print(n +" ");
        // recursive work 5 4 3 2 1
        printDec(n-1);
    }
    public static void printInc(int n){
        // base condition..
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        // recursive work 1 2 3 4 5
        printInc(n-1);
        // self work
        System.out.print(n+" ");
        
    }
    // int -->return self work.....factorial
    public static int factorial(int n){
        // base condition
        if(n==0){ 
            return 1;
        }
        // recursive work
        int smallans=factorial(n-1);
        // self work
        int nfactorial=n*smallans;
        return nfactorial;
    }
    // 0 1 1 2 3 5 8......fibonacci
    public static int fibonacci(int n){
        // base case
        if(n==0||n==1){
            return n;
        }
        // subproblem
        int prev=fibonacci(n-1);
        int prevprev=fibonacci(n-2);
        return prev+prevprev;
    }
    // sum of digit
    public static int sumofdigit(int n){
        // base case if n>0=0 and n<=9 single digit then return n
        if(n>=0 &&n<=9){
            return n;
        }
        // recursive work
        int smallans=sumofdigit(n/10);
        // self work
        int ans=smallans+n%10;
        return ans;
    }
    // P^Q
     public static int PkipowerQ(int P,int Q){
        // base case
        if(Q==0) return 1;
        // recursive +self work
        return PkipowerQ(P,Q-1)*P;
    }
    // alternate method of P^Q WITH better approch.....
    public static int pow(int P,int Q){
        // base condition
        if(Q==0) return 1;
        // if Q is even
        if(Q%2==0){
            // recursive work
            return pow(P,Q/2)*pow(P,Q/2);
        }
        // for odd Q
        int small=pow(P,Q/2);
        return P*small*small;
    }
    // given num and print k times of num
    public static void multiple(int N,int K){
        // base case
        if(K==1){
            System.out.println(N);
            return;
        }
        // recursive work
        multiple(N, K-1);
        // SELF WORK
        System.out.println(N*K);    
    }
    //given anumber n .find the sum of natural number till n but with aletrnate signs --> 1-2+3-4+5=3.....
    public static int sumofn(int n){
        // BASE CONDITION 
        if(n==0){
            return 0;
        }
        // recursive +self work
        if(n%2==0){
            return sumofn(n-1)-n;
        }
        else{
            return sumofn(n-1)+n;
        }
    }
    // GCD  USING RECURSION
    public static int gcd(int m,int n){
        while(m%n!=0){
            int rem=m%n;
            m= n;
            n=rem;
        }
        return n;
    }
    // print the max value of the array
    public static int maxarr(int n){
        
    }

    public static void main(String args[]){
        // int n=13;
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(n));
        // System.out.println("total factorial no n");
        // System.out.println(fibonacci(n));
        // agar question ye ho ki0 th position se i position tak print karo tab
        // System.out.println("print the series");
        // for(int i=0;i<=n;i++){
        //     System.out.println(fibonacci(i));
        // }
        // System.out.println("sum of digit is:");
        // System.out.println(sumofdigit(n));
        //1 2 4 8 ...........8 where p=2,q=3
        // int P=2;
        // int Q=3;
        // // both helps get print 1 2 4 8 8 4 2 1......
        // for(int i=0;i<=Q;i++){
        //     System.out.println(PkipowerQ(P, i));
        // }
        
        // for(int i=Q;i>=0;i--){
        //     System.out.println(PkipowerQ(P, i));
        // }
        // System.out.println("better approach");
        // System.out.println(pow(P, Q));
        // multiple n and k
        // int N=3;
        // int K=5;
        // multiple(N, K);
        int m=4;
        int n=12;
        // System.out.println(sumofn(n));
        System.out.println(gcd(m, n));


    }
    
}
