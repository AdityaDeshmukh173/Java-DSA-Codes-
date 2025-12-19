public class GetterSetter {
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.setcolor("Blue");
       // p1.color = "Red" ;       Cant be done since color is private 
       System.out.println(p1.getcolor());
       p1.settip(3);
       System.out.println(p1.gettip());

       p1.setcolor("Red");
       System.out.println(p1.getcolor());
    
       Student s1 = new Student("Adi"); //Initialised the name
        System.out.println(s1.name);
    }
}

class Pen {
    Pen(){
        System.out.println("Constructor called");
    }
    
    private String color ;
    private int tip ;
    
    void setcolor(String newcolor){
        color = newcolor ;
    }
    void settip(int tip){
        this.tip = tip ;      //this.tip refers to the class member and tip refers to the argument             this.tip is inside a pen     tip is external property 
    }
    
    String getcolor(){
        return this.color;       // it will call the color of object in which it is currently  
    }
    int gettip(){
        return this.tip;
    }
    
}

class Student {
    String name ;
    int rollno ;

    Student(String name){          //For Initialization 
        this.name = name ;
        System.out.println("Student object created");
    }
}