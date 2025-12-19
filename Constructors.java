public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Shahu");
        Student s3 = new Student(123);
//        Student s4 = new Student("Adi" , 124) ;     

        Stud std1 = new Stud();
        std1.name = "Fuck You" ;
        std1.rollno = 2134 ;
        std1.password = "abcd1" ;
        std1.marks[0] = 100 ;
        std1.marks[1] = 95 ;
        std1.marks[2] = 90 ;
        
        Stud std2 = new Stud(std1);
        std2.password = "newpass" ;

        std1.marks[2] = 100 ;      //Marks shouldnt have changed but it changes  (Because the whole array is not being copied just reference is copied)
        for(int i=0 ; i<3 ; i++){
            System.out.println(std2.marks[i]);
        }

    }
}

class Student{
    String name ;
    int rollno ;

    Student(){
        System.out.println("Constructor is called....");
    }
    Student(String name){
        this.name = name ;
    }
    Student(int rollno){
        this.rollno = rollno ;
    }
}

class Stud{            // Student class for Copy Constructor 
    String name ;
    int rollno ;
    String password ;
    int marks[];

    //Shallow Copy Constructor !!
 /*   Stud(Stud std1){
        marks = new int[3] ;
        this.name = std1.name ;
        this.rollno = std1.rollno ;
        this.marks = std1.marks ;
    }     */

    //Deep Copy Constructor !!!
    Stud(Stud std1){
        marks = new int[3];
        this.name = std1.name ;
        this.rollno = std1.rollno ;
        for(int i=0 ; i<marks.length ;i++){
            this.marks[i] = std1.marks[i] ;
        }
    }

    Stud(){
        System.out.println("Std constructed");
        marks = new int[3] ;                //To ensure that every constructor is calling for 3 subject marks only
    }
}