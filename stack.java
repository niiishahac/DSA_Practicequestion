public class stack {
    // get()---3---------
    //  public static void getAt(Stack<Integer> s,int index){
    //     Stack<Integer> st=new Stack<>();
    //     while(s.size()>index+1){
    //         st.push(s.pop());
    //     }
    //     System.out.println(s.peek()); 
    //     while(st.size()>0){
    //         s.push(st.pop());
    //     }  
    //  }
    //  ---push at bootom -------5--------------------
    // public static void pushAtBottom(Stack<Integer> s,int element){
    //     Stack<Integer> st=new Stack<>();
        // while(s.size()>0){
        //     st.push(s.pop());
        // }
        // s.push(element);
        // while(st.size()>0){
        //     s.push(st.pop());
        // }
        // System.out.println("stack after pushing at bottom: "+s);
        // by recursive approach--
        // if(s.size()==0){
        //     s.push(element);
        //     return;
        // }
        // int top=s.pop();
        // pushAtBottom(s,element);
        // s.push(top);
        // ---------------------------
    //     System.out.println("stack after pushing at bottom: "+s);
    // }
    // recursively reverse the stack------------------4----------------------
    public static void pushAtBottom(Stack<Integer> s, int element) {
        if (s.size() == 0) {
            s.push(element);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, element);
        s.push(top);

    }
    public static void main(String[] args) {
        // stack operation and declarartion------------1
        // Stack<Integer> s=new Stack<>();
        // s.push(5);
        // s.push(3);
        // s.push(8);
        // s.push(9);
        // s.pop();
        // System.out.println(s.peek());
        // System.out.println(s.isEmpty()); //s.isEmpty()=s.size()=0
        // System.out.println(s.size()); 
        // // [5,3,8]  
        // System.out.println(s); //o(n)
        // System.out.println(s.pop()); //it will remove the top element and return it
        // traversal---------------------------------2
        // Stack<Integer> s=new Stack<>();
        // Stack<Integer> s2=new Stack<>();
        // s.push(5);
        // s.push(3);
        // s.push(8);
        // s.push(9);
        // while(s.size()>0){
        //     int top=s.pop();
        //     System.out.println(top);
        //     s2.push(top);
        // }
        // while(s2.size()>0){
        //     s.push(s2.pop());    
        // }
        // System.out.println("s after restoring ");
        // System.out.println(s);
        // peek,add,and remove---------------3
        // Stack<Integer> s=new Stack<>();
        // s.push(5); 
        // s.push(3);
        // s.push(8);
        // s.push(9);
        // System.out.println("original stack: "+s);
        // System.out.println("element at index 2: "+s.get(2)); //o(n)
        // // through function *get()---
        // getAt(s,2);
        // ---------------Reverse the stack------------------4
        // method1: using extra stack-
        // Stack<Integer> s=new Stack<>();
        // s.push(5);  
        // s.push(3);
        // s.push(8);
        // s.push(9);
        // Stack<Integer> s2=new Stack<>();
        // Stack<Integer> s3=new Stack<>();
        // while(s.size()>0){
        //     s2.push(s.pop());
        // }
        // while(s2.size()>0){
        //     s3.push(s2.pop());
        // }
        // System.out.println("s="+s3);
        // while(s3.size()>0){
        //     s.push(s3.pop());
        // }
        // System.out.println("Reversed stack s="+s);
        // method2: using array-
        // Stack<Integer> s=new Stack<>();
        
        // s.push(5);
        // s.push(3);
        // s.push(8);
        // s.push(9);
        // int[] arr=new int[s.size()];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=s.pop();    
        // }
    
        // for(int i=0;i<arr.length;i++){
        //     s.push(arr[i]);
        // }
        // System.out.println("Reversed stack s="+s);
        // --------------------push element at bottom of stack------------------5
        // Stack<Integer> s=new Stack<>();
        // s.push(5);
        // s.push(3);
        // s.push(8);
        // s.push(9);
        // System.out.println("original stack s="+s);
        // pushAtBottom(s,1); 
        // --   
    }
    
}
