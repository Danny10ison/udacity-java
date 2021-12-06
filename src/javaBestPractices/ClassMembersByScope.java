package javaBestPractices;

import java.util.List;

public class ClassMembersByScope {
    public static void main(String[] args) {
        /*
        *   Organise your class variables by
        *       the visibility of access modifiers(private-first, public-last)
        *
        *   + Class variables should be organised by visibility
        *
        *
        * */
    }
}

public class StudentManager {
    protected List<Student> listStudents;
    public int numberOfStudents;
    private String errorMessage;
    float rowHeight;
    float columnWidth;
    protected String[] columnNames;
    private int numberOfRows;
    private int numberOfColumns;
    public String title;

}

public class Student{
    private String errorMessage;
    private int numberOfColumns;
    private int numberOfRows;


    float columnWidth;
    float rowHeight;

    protected String[] columnNames;
    protected List<Student> listStudents;

    public int numberOfStudents;
    public String title;
}