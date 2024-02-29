package Seminar.Seminar_3.task_DZ;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    // @Override
    // public int compare(Student t1, Student t2) {
    // String s1 = t1.getName() + t1.getAge();
    // String s2 = t2.getName() + t2.getAge();
    // return s1.compareTo(s2);
    // }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGrade().compareTo(o2.getGrade());
    }
}