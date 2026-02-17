// -------------------------input given--------------------------------
// import java.util.*;
// public class multiarraylist {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

//         arr.add(new ArrayList<>(Arrays.asList(1,2,3)));
//         arr.add(new ArrayList<>(Arrays.asList(4,5,6,7)));
//         arr.add(new ArrayList<>(Arrays.asList(8,9,0)));

//         System.out.println(arr.get(1).get(1));  
//     }
// }
// --------------------input by user-------------------------
import java.util.*;

public class multiarraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns in row " + i + ": ");
            int cols = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();
            System.out.println("Enter " + cols + " elements:");
            for (int j = 0; j < cols; j++) {
                row.add(sc.nextInt());
            }

            arr.add(row);
        }

        // Print all rows
        System.out.println("ArrayList of ArrayLists:");
        for (ArrayList<Integer> row : arr) {
            System.out.println(row);
        }

        // Access a specific element
        System.out.print("Enter row index to access: ");
        int r = sc.nextInt();
        System.out.print("Enter column index to access: ");
        int c = sc.nextInt();

        System.out.println("Element at (" + r + "," + c + ") = " + arr.get(r).get(c));
        // commands like
        // arr.get(1).set(1,30);
        // arr.get(2).add(20);
        // new arraylist->collection of element -row
        arr.add(new ArrayList<>());
        // ---------------------------
        // print the element of multiarraylist
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
        }
        // for each
        for(ArrayList<Integer> list:arr){
            for(int ele:list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        // -------------------------------
    }
}


