package module6.practice;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String studentName;
    private int course;

    public static void printStudents(List <Student> students, int course) {
        Iterator<Student> i = students.iterator();
        if (i.hasNext()) {
            if (i.next().course == course)
                System.out.println(i.next().course + i.next().studentName);

        }
    }

    public Student(String studentName, int course) {
        this.studentName = studentName;
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
