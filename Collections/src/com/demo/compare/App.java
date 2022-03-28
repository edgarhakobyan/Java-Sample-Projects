package com.demo.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student(2, "Foo", "etc");
        Student student2 = new Student(1, "Student", "bgb");
        Student student3 = new Student(4, "People", "tgf");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.sort(null);
        System.out.println(students);

        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);

        students.sort((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });
    }
}
