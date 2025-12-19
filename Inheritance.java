public class Inheritance {
    public static void main(String args[]){
        Fish Shark = new Fish();
        Shark.eat();
        Shark.swims();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4 ;
        System.out.println(dobby.legs);
    }
}

class Animals{       //Base Class / Parent Class
    String color ;
    void eat(){
        System.out.println("Eats !!");
    }
    void breath(){
        System.out.println("Breaths !!");
    }
}

class Fish extends Animals{             //Derived Class / Child Class
    int fins ;
    void swims(){
        System.out.println("Swims in water !!");
    }
}

class Mammal extends Animals{
    int legs ;
    void walks(){
        System.out.println("Walks !!");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("Fly in air !!");
    }
}

class Dog extends Mammal{
    String breed ;
}
