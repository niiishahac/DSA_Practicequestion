package opps;

public class opps3 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="tommy";
        d1.bark();
        d1.age=5;
        d1.breed="indian";
        Dog d2=new Dog();
        d2.name="moti";
        d2.walking();
        d2.age=6;
        d2.breed="american";
        
    }    
}
class Dog{
    // property
    String name;
    String breed ;
    int age;
    // behaviour
    void bark(){
        System.out.println(name + " is braking");
    }
    void walking(){
        System.out.println(name+ " is walking");
    }

}
