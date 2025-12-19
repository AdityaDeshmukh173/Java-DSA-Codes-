public class Abstraction {
    public static void main(String args[]){
        
        Mustang myhorse = new Mustang();        //Animal -> Horse -> Mustang

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal{                  //We cannot create object of Abstract classes
    String color ;
    Animal(){
        color = "Brown" ;
        System.out.println("Animal constructor called..");
    }
    void eat(){
        System.out.println("Animal Eats ..");
    }
    abstract void walk();          // No Implimentation !!!      Its just an Idea that this function must exist in every Animal 
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called..");
    }
    void changecolor(){
        color = "Darkk Brown" ;
    }

    void walk(){
        System.out.println("Walks on 4 Legs ..");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called..");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called..");
    }
    void changecolor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("Walks on 2 Legs ..");
    }
}
