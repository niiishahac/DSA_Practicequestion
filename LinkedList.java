// --------------------------------INTRO------------------------------------------
// public class LinkedList {
//     public static class Node{
//         int data;
//         Node next;
//     }
//     public static void main(String[] args) {
//         Node x=new Node();
//         System.out.println(x.data); //-->0
//         System.out.println(x.next);//-->null
//     }
    
// }
// ------------------------construtor in linkedlist-------------------------------
// public class LinkedList{
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         public Node(int data){
//             this.data=data;
            
//         }
//     }
//     public static void main(String[]args){
//         Node x=new Node(5);
//         Node y=new Node(10);
//         Node z=new Node(15);
//         Node w=new Node(20);
//         x.next=y;//x->y
//         y.next=z;//y->z
//         z.next=w;//z->w
//         System.out.println("head data");
//         System.out.println(x.data);
//         System.out.println("address of 2nd");
//         System.out.println(x.next);  //x->y
//         System.out.println("address of 2nd ka data");
//         System.out.println(x.next.data);
//         System.out.println(x.next.next.data);
//         System.out.println(x.next.next.next.data);

//     }
// }
// -----------IMPLEMENTATION OF SINGLY LINKEDLIST------------------------
// using temp variable
// public class LinkedList{
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         Node b=new Node(3);
//         Node c=new Node(2);
//         Node d=new Node(8);
//         Node e=new Node(9);
//         // a.next=b;---> a->b
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         Node temp=a;
//         // better condition

//         while(temp!=null){
//             System.out.println(temp.data+" ");
//             temp=temp.next;
//         }
//     }
// }
// ------------function----------------------------------
// public class LinkedList{
//     public static void display(Node head){
//         Node temp=head;
//         while(temp!=null){
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         Node b=new Node(3);
//         Node c=new Node(2);
//         Node d=new Node(8);
//         Node e=new Node(9);
//         // a.next=b;---> a->b
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         Node temp=a;
//         display(a); //5->3->2->8->9
//     }
// }
// -----------RECURSION--------------
// public class LinkedList{
//     public static void displayR(Node head){
//         if(head==null) return;
//         System.out.print(head.data+" ");
//         displayR(head.next);
//     }
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         Node b=new Node(3);
//         Node c=new Node(2);
//         Node d=new Node(8);
//         Node e=new Node(9);
//         // a.next=b;---> a->b
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         displayR(a); //5->3->2->8->9
//     }
// }
// -----print reverse order of linkedlist---------------------
// public class LinkedList{
//     public static void displayReverse(Node head){
//         if(head==null) return;
//         displayReverse(head.next);
//         System.out.print(head.data+" ");
//     }
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         Node b=new Node(3);
//         Node c=new Node(2);
//         Node d=new Node(8);
//         Node e=new Node(9);
//         // a.next=b;---> a->b
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         displayReverse(a); //5->3->2->8->9
//     }
// }
// -------length--------------------------------
// public class LinkedList{
    
//     public static int length(Node a){
//         int count=0;
//         while(a!=null) {
//             count++;
//             a=a.next;
//         }
//         return count;
//     }
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         Node b=new Node(3);
//         Node c=new Node(2);
//         Node d=new Node(8);
//         Node e=new Node(9);
//         // a.next=b;---> a->b
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         int len=length(a);
//         System.out.println(length(a));
//     }
// }
// ---------------implementatio head and data-------------------
// public class LinkedList{
//     public static void insertAtEnd(Node head,int data){
//         Node temp=new Node(data);
//         Node t=head;
//         while(t.next!=null){
//             t=t.next;
//         }
//         t.next=temp;
//     }
//     public static void displayReverse(Node head){
//         if(head==null) return;
//         displayReverse(head.next);
//         System.out.print(head.data+" ");
//     }
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a=new Node(5);
//         Node b=new Node(3);
//         Node c=new Node(2);
//         Node d=new Node(8);
//         Node e=new Node(9);
//         // a.next=b;---> a->b
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         displayReverse(a); //5->3->2->8->9
        
//         System.out.println("after insert ");
//         insertAtEnd(a, 34);
//         displayReverse(a);
        

//     }
// }
// ------------------array to llist--------------
// public class LinkedList{
//     public static class Node{
//         int data;
//         Node next;
//         // constructor
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node convertarrtoll(int[]arr){
//         Node head=new Node(arr[0]);
//         Node mover=head;
//         for(int i=1;i<arr.length;i++){
//             Node temp=new Node(arr[i]);
//             mover.next=temp;
//             mover=temp;
//         }
//         return head;
       
//     }
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4};
//         Node head=convertarrtoll(arr);
//         System.out.println(head.data);
        
//     }

// }-->1












