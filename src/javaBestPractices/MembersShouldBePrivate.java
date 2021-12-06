package javaBestPractices;

public class MembersShouldBePrivate {
    public static void main(String[] args) {
        /*
        * + Class members should be private
        *
        * */

        StudentBad badstudent = new StudentBad();
        badstudent.name = "";
        badstudent.age = 2005;

        Student student = new Student();
        student.name = "";
        student.age = 2005;
    }
}

// bad
public class StudentBad {
    public String name;
    public int age;
}

// better
public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name is invalid");
        }

        this.name = name;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw new IllegalArgumentException("Age is invalid");
        }

        this.age = age;
    }
}
