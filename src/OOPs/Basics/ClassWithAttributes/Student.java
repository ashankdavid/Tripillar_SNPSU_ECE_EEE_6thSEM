package OOPs.Basics.ClassWithAttributes;

public class Student {
    String name; // instance variables
    int usn; // instance variable
    static String college; // class variable

    Student(String name, int u){ // parameterized constructoer
        this.name = name;
        usn = u;
        college = "Sapthagiri";
    }

    void printDetails(){
        System.out.println("Student name is " + name);
        System.out.println("Student usn is " + usn);
        System.out.println("Student College is " + college);
    }
}

class Driver{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        Student s2 = new Student("David", 345);

        s1.printDetails();
        s2.printDetails();

    }
}
