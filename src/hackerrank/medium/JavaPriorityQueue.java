package hackerrank.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.name());
            }
        }
    }
}

record Student(String name, double CGPA, int id) {

}

class Priorities {

    private final PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::CGPA)
                    .reversed()
                    .thenComparing(Student::name)
                    .thenComparing(Student::id)
    );

    public  List<Student> getStudents(List<String> events) {
        events.forEach(e -> {
            if (e.equals("SERVED")) queue.poll();
            else {
                String[] arr = e.split(" ");
                queue.add(new Student(arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3])));
            }
        });

        System.out.println(queue);

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        System.out.println(students);
        return students;
    }
}

