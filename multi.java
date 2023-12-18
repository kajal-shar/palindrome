
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}


class Labrador extends Dog {
    void run() {
        System.out.println("Labrador is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador myLabrador = new Labrador();

        
        myLabrador.eat();
        myLabrador.bark(); 
        myLabrador.run();  
    }
}
