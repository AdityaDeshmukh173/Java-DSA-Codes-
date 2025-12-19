public class Statickey{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname = "JNV" ;

        Student s2 = new Student();
        System.out.println(s2.schoolname);
        Student s3 = new Student();
        s3.schoolname = "ABC" ;
        System.out.println(s2.schoolname);

    }   
}

class Student{
    static int returnpercent(int maths, int phy, int chem){              //Static Function     it will be created once only !! reduce memory usage
        return (maths+phy+chem)/3  ;
    }

    String name ;
    int rollno ;

    static String schoolname ;

    void setname(String name){
        this.name = name ;
    }
    String getname(){
        return this.name ;
    }
}
