package OOPs.Inheritance.ClassesWithConstructor;

public class Person {
    String FirstName;
    String LastName;

    Person(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
}

class Student extends Person{
    int usn;

    Student(String FirstName, String LastName, int usn){
        super(FirstName, LastName);
        this.usn = usn;
    }
}

class Driver{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", "David", 123);
    }
}