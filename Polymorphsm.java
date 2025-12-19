public class Polymorphsm {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 6));
        System.out.println(calc.sum((float)2.5 , (float)4.3));
        System.out.println(calc.sum(1, 6 ,5));

        Deer d = new Deer();
        d.eats();
    }
}

class Calculator{

    int sum(int a , int b){
        return a+b ;
    }
    int sum(int a, int b , int c){
        return a+b+c ;
    }
    float sum(float a, float b){
        return a+b ;
    }
}

class Animal{
    void eats(){
        System.out.println("Eats Anything !");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass !");
    }
}
