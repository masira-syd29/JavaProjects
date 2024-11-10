class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writting something");
        
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Student() {
        System.out.println("Constructer called");
    }
}

public class oops { 
    public static void main(String[] args) {
        /*Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
    
        pen1.write(); 

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor(); */

        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 23;

        s1.printInfo();
    }
    
}
