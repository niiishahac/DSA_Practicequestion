package opps;

public class opps2 {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        student s1=new student();
        s1.name="ram";
        s1.calmarks(97, 87, 78, 98, 85);
        
        System.out.println(s1.name);
        System.out.println(s1.marks);
        account a1=new account();
        a1.username="siya";
        // a1.password=1234345; not working due to private
        // only change cannot be access private things
        a1.setpassword(12345);

        
    }
    
}
class pen {
    String color;
    int tip;
    void setcolor(String newcolor){
        color =newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }   
    String getcolor(){
        return this.color;
    }
}
class student{
    String name;
    int marks;
    void calmarks(int eng,int maths,int sst,int hindi,int ai){
        marks=(eng+hindi+maths+sst+ai)/5;
    }
}
class account{
    public String username;
    private int password;
    public void setpassword(int newpassword){
        password=newpassword;
    }
}

