


public class string {
    public static void main(String[] args) {
        // ----------------------------
        // char[] arr={'r','e','m'};
        // for(int ele:arr){//here int used so ascci value
        //     System.out.print(ele+" ");
        // }
        // System.out.println();
        // for(char ele:arr){//here char used so character print
        //     System.out.print(ele+" ");
        // }
        // --------------------------------
        // String g1="good girl";
        // System.out.println("input");
        // Scanner sc=new Scanner(System.in);
        // String g2=sc.next();
        // String g3=sc.nextLine();
        // System.out.println(g1);
        // System.out.println(g2);
        // System.out.println(g3);
        // System.out.println("charAt"+g1.charAt(3));
        // -----------------------------------
        // vowelcount
        // String s1="nisha kumari";
        // int count=0;
        // for(int i=0;i<s1.length();i++){
        //     char ch=s1.charAt(i); 
        //     if(ch=='a'||ch=='i'||ch=='u'||ch=='o'||ch=='e'){
        //         count++;
        //     }    
        // }
        // System.out.println(count);
        // ----------------------------------------
        String g1="bab";
        int i=0;
        int j=g1.length()-1;
        while(i<=j){
            if(g1.charAt(i)!=g1.charAt(j)){
                System.out.println("false");
                break;
            }
            else{
                i++;
                j--;
                
            }
        }
        
    }
    
}
