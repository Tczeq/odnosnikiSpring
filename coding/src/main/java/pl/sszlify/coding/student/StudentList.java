package pl.sszlify.coding.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
        students.add(new Student(1, "John", "Doe"));
        students.add(new Student(2, "Jane", "Smith"));
        // Dodaj więcej studentów według potrzeb
    }

    public List<Student> getStudents() {
        return students;
    }
}
