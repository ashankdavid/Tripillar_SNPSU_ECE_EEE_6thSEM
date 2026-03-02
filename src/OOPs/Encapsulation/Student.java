package OOPs.Encapsulation;

public class Student {
    private String name; // instance variables
    private int usn; // instance variable
    static String college; // class variable

    Student(String name, int u){ // parameterized constructoer
        this.name = name;
        usn = u;
        college = "Sapthagiri";
    }

    // Getter() --> Name (Private)
    String getName(){
        return name;
    }

    // Getter() --> USN (Private)
    int getUsn(){
        return usn;
    }

    //Setter() --> Name (Private)
    void setName(String n){
        name = n;
    }

    //Setter() --> USN (Private)
    void setUsn(int usn){
        this.usn = usn;
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

        s1.setName("ABC");
        s1.setUsn(123);

        System.out.println(s1.getName());;

        s1.printDetails();

    }
}
