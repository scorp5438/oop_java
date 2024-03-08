package Seminar.Seminar_5.task.service;

import java.util.ArrayList;
import java.util.List;
import Seminar.Seminar_5.task.data.Student;
import Seminar.Seminar_5.task.data.Teacher;
import Seminar.Seminar_5.task.data.User;
import Seminar.Seminar_5.task.view.StudentView;

public class DataService {

    private StudentView studentView = new StudentView();

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public DataService() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void create(User user) {
        if (user instanceof Student) {
            int id = students.size();
            Student student = new Student(user.getName(), user.getAge());
            student.setId(id + 1);
            students.add(student);
        } else if (user instanceof Teacher) {
            Teacher teacher = new Teacher(user.getName(), user.getAge(), List.of("Math", "Phisics"));
            teachers.add(teacher);
        }

    }

    public void read(boolean bool) { // true student
        if (bool) {
            System.out.println(students);
        } else if (!bool) {
            System.out.println(teachers);
        }
    }

    public void showStudent(int id) {
        studentView.findStudent(students, id);
    }
}
