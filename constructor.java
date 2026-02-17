// default constructor
// class Car {
//     Car() {
//         System.out.println("Car is created");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car c = new Car(); // constructor call
//     }
// }------------------------------------------------------------car is created
// parameter
// class Car {
//     String brand;
    
//     Car(String b) {
//         brand = b;
//     }

//     void show() {
//         System.out.println("Brand: " + brand);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car("Toyota");
//         c1.show();
//     }
// }------------------------------------------------------------------------Brand: Toyoto
// copy constructor
// class Car {
//     String brand;

//     Car(String b) {
//         brand = b;
//     }

//     // Copy Constructor
//     Car(Car c) {
//         brand = c.brand;
//     }

//     void show() {
//         System.out.println("Brand: " + brand);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car("Honda");
//         Car c2 = new Car(c1); // copying c1 to c2
//         c2.show();
//     }
// }---------------------------------------------------------------------------
// constractor overloading -multiple constructor same naam and diff paramter
// class Student {
//     String name;
//     int age;

//     // Constructor 1
//     Student() {
//         name = "Unknown";
//         age = 0;
//     }

//     // Constructor 2
//     Student(String n) {
//         name = n;
//         age = 18;
//     }

//     // Constructor 3
//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     void show() {
//         System.out.println(name + " is " + age + " years old");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();               // Unknown
//         Student s2 = new Student("Rahul");        // Rahul, 18
//         Student s3 = new Student("Anjali", 20);   // Anjali, 20

//         s1.show();
//         s2.show();
//         s3.show();
//     }
// }---------------------------------------------------------------------------------
// real life example
// class Mobile {
//     String brand;
//     int price;

//     Mobile(String b, int p) {
//         brand = b;
//         price = p;
//     }

//     void showDetails() {
//         System.out.println(brand + " costs " + price);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Mobile m1 = new Mobile("Samsung", 20000);
//         m1.showDetails();
//     }
// }-----------------------------------------------------------------------
// this
// class Car {
//     String color;

//     Car(String color) {
//         this.color = color;  // this.color = object ka color
//     }
// }---------------------------------------
// 
// class ClassName {
//     // Properties
//     datatype var1;
//     datatype var2;

//     // Constructor
//     ClassName(datatype v1, datatype v2) {
//         var1 = v1;
//         var2 = v2;
//     }

//     void display() {
//         System.out.println(var1 + ", " + var2);
//     }
// }----------------------------------------------------------------
// getter and setter->encapsulation
// class Student {
//     private String name;  // private variable
//     private int age;

//     // Getter for name
//     public String getName() {
//         return name;
//     }

//     // Setter for name
//     public void setName(String newName) {
//         name = newName;
//     }

//     // Getter for age
//     public int getAge() {
//         return age;
//     }

//     // Setter for age
//     public void setAge(int newAge) {
//         if(newAge > 0) {
//             age = newAge;
//         }
//     }
// }public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();

//         s1.setName("Aman");
//         s1.setAge(21);

//         System.out.println("Name: " + s1.getName());
//         System.out.println("Age: " + s1.getAge());
//     }
// }------------------------------------------------------------------------------
// inheritance
// Parent Class
// class Animal {
//     void eat() {
//         System.out.println("This animal eats food");
//     }
// }

// // Child Class
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }
// other child also---

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();   // inherited from Animal
//         d.bark();  // own method
//     }
// }
// }--------------------------This animal eats food  
// ------------------------------Dog barks
// single
// class A {
//     void show() {
//         System.out.println("A class");
//     }
// }

// class B extends A {
//     void display() {
//         System.out.println("B class");
//     }
// }---------------------------
// multilevel
// class A {
//     void show() {
//         System.out.println("Class A");
//     }
// }

// class B extends A {
//     void display() {
//         System.out.println("Class B");
//     }
// }

// class C extends B {
//     void print() {
//         System.out.println("Class C");
//     }
// }-------------------------------
// heirarchical
// class Animal {
//     void sound() {
//         System.out.println("Animals make sound");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     void meow() {
//         System.out.println("Cat meows");
//     }
// }-----------------------------------------
// multiple interferance
// interface A {
//     void show();
// }

// interface B {
//     void display();
// }

// class C implements A, B {
//     public void show() {
//         System.out.println("From A");
//     }
//     public void display() {
//         System.out.println("From B");
//     }
// }----------------------------------
// polymorphism->compile time over loading
// class MathOperation {
//     // Method 1
//     int add(int a, int b) {
//         return a + b;
//     }

//     // Method 2
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MathOperation mo = new MathOperation();
//         System.out.println(mo.add(2, 3));        // 5
//         System.out.println(mo.add(2, 3, 4));     // 9
//     }
// }----------------------------------------------------5  
// ------------------------------------------------------9

// run time 
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Dog();  // Parent reference, child object
//         a.sound();             // Dog's version runs
//     }
// }---------------------------------------------------------
// 



















