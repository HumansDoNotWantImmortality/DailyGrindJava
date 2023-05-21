package hackerrank.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Integer ID = sc.nextInt();
            String name = sc.next();
            Double CGPA = sc.nextDouble();
            students.add(new Student(ID, name, CGPA));
        }

        sc.close();

        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student implements Comparable<Student> {

    private final Integer ID;
    private final String name;
    private final Double CGPA;

    public Student(Integer ID, String name, Double CGPA) {
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Double getCGPA() {
        return CGPA;
    }

    @Override
    public int compareTo(Student o) {
        return Comparator.comparing(Student::getCGPA)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getID)
                .compare(this, o);
    }
}
