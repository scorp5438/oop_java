package Seminar.Seminar_5.task.view;

import java.util.ArrayList;
import Seminar.Seminar_5.task.data.Student;

public class StudentView {
    public StudentView() {
    }

    public void findStudent(ArrayList<Student> students, int id) {
        boolean isFind = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                isFind = true;
            }
        }
        if (!isFind) {
            System.out.println("Такого студента нет");
        }
    }
}
