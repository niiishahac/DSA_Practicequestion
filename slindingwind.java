// import java.util.*;

// public class slindingwind {
//     public static int countAnagram(String txt,String pat){
//         int count=0;
//         int n=txt.length();
//         int m=pat.length();
//         char[] patarr=pat.toCharArray();
//         Arrays.sort(patarr);
//         String sortedpat=new String(patarr);
//         for(int i=0;i<=n-m;i++){
//             String sub=txt.substring(i,i+m);
//             char[] subarr=sub.toCharArray();
//             Arrays.sort(subarr);
//             if(sortedpat.equals(new String(subarr))){
//                 count++;
//             }

//         }
//         return count;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String txt=sc.nextLine();
//         String pat=sc.nextLine();
//         System.out.println(countAnagram(txt,pat));

//     }    
// }
// complexity n*m logm
// ------------------------------------------------------


