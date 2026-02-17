
// import java.util.*;
// public class hashing {
//     public static void main(String[] args){
//         // create ->import----------------------------------
//         HashMap<String,Integer> hm=new HashMap<>();
//         // insert
//         hm.put("tea",20);
//         hm.put("coffee",30);
//         hm.put("shake",50);
//         hm.put("milk",40);
//         // {tea=20,coffee=30,milk=40,shake=50}-->unordered form mein
//         System.out.println(hm);
//         //get O(1)->value
//         int rate=hm.get("tea") ;
//         System.out.println(hm.get("tea"));
//         // constainsKey-O(1)->true/false
//         System.out.println(hm.containsKey("tea"));
//         // remove
//         System.out.println(hm.remove("tea"));
//         System.out.println(hm);
//         // size
//         System.out.println(hm.size());
//         // is empty
//         // hm.clear();
//         // System.out.println(hm.isEmpty());
//         // iteration 
//         Set<String>keys=hm.keySet();
//         System.out.println(keys);
//         // [tea,coffee,shake.milk] unordered form mein
//         for(String k:keys){
//             System.out.println("key="+k+", value="+hm.get(k));
//         // -----------------------------------------------
//         // output-> key=tea,value=20
//         // key=coffee=30------so on    
//     } 
    

// }}
// implementation HashMap-------------
// import java.util.HashMap;

// public class hashing{
//     public static void main(String[] args) {
//         // Create a HashMap
//         HashMap<String, Integer> map = new HashMap<>();

//         // Insert key-value pairs
//         map.put("Apple", 3);
//         map.put("Banana", 2);
//         map.put("Orange", 5);

//         // Access value by key
//         System.out.println("Apple count: " + map.get("Apple")); // Output: 3

//         // Update value
//         map.put("Apple", 4);

//         // Check if key exists
//         if (map.containsKey("Banana")) {
//             System.out.println("Banana is present");
//         }

//         // Remove a key
//         map.remove("Orange");

//         // Iterate through HashMap
//         for (String key : map.keySet()) {
//             System.out.println(key + " : " + map.get(key));
//         }
//     }
// }
// ---------------------------------------------------------------
// | Method                 | Description                     |
// | ---------------------- | ------------------------------- |
// | `put(key, value)`      | Insert or update key-value pair |
// | `get(key)`             | Returns value for key or `null` |
// | `containsKey(key)`     | Checks if key exists            |
// | `containsValue(value)` | Checks if value exists          |
// | `remove(key)`          | Removes the key-value pair      |
// | `keySet()`             | Returns all keys                |
// | `values()`             | Returns all values              |
// | `entrySet()`           | Returns all key-value pairs     |
// | `size()`               | Returns the size of the map     |
// | `clear()`              | Removes all entries             |
// -------------------------------------------------------------------------
// majority element ->You are given an array nums of size n. A majority element is an element that appears more than ⌊n/3⌋ times.
// Brute Force (O(n²))
import java.util.*;
public class hashing{
    public static int majority(int[] nums){
        int count=0;
        return count;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(majority(nums));
       
    }

}




