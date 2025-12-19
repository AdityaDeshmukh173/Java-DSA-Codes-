public class OOPs{
    public static void main (String args[]){
        Pen p1 = new Pen();      // Created a new Pen Object called P1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.settip(3); 
        System.out.println(p1.tip );
        
        //p1.setcolor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
    
        BankAcc myacc = new BankAcc();
        myacc.username = "Aditya " ;
       // myacc.password = "addaslbl" ;       //Password is not visible due to its private tag !!   We will need a function for this work
        myacc.setpassword("addaslbl");  //set as password          we cannot access password we can only change it...
    }    
}

class BankAcc{
    public String username ;
    private String password ;

    public void setpassword(String pass){
        password = pass ;
    }
}

class Pen {
    //Props & Funcs 
    String color ;
    int tip ;

    void setcolor(String newcolor){
        color = newcolor ;
    }

    void settip(int newtip){
        tip = newtip ;
    }
}

class Student {
    String name ;
    int age ;
    float percentage ;

    void calcpercentage(int phy, int maths, int chem){
        percentage = (phy+chem+maths) / 3  ;
    }
}