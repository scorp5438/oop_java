package Seminar.Seminar_3.task_DZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

// - Создать класс Студент
// - Создать класс УчебнаяГруппаИтератор
// - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
// - Реализовать его контракты

/**
 * - Создать класс Студент
 * - Создать класс УчебнаяГруппа
 * - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс
 * Iterator
 * - Реализовать его контракты
 *
 *
 *
 *
 * - Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
 * - Реализовать контракт compareTo () со сравнением по какому-либо параметру
 * (пример studentId)
 *
 *
 *
 * - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
 * - Реализовать контракт compare () со сравнением по какому-либо параметру
 * (пример: сочетание Имя+Фамилия)
 */
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ivan", 20, "Chemistry", 5);
        Student s2 = new Student("Oleg", 22, "Chemistry", 1);
        Student s4 = new Student("Sveta", 21, "Chemistry", 4);
        Student s3 = new Student("Petr", 24, "Chemistry", 3);
        Student s5 = new Student("Alina", 19, "Chemistry", 2);
        Student s6 = new Student(6);
        Student s7 = new Student(7);
        Student s8 = new Student(10);
        Student s9 = new Student(15);
        Student s10 = new Student(11);
        Student s11 = new Student(100);

        ArrayList<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));
        Group group1 = new Group(students);

        students = new ArrayList<>(List.of(s1, s9, s5, s4, s11));
        Group group2 = new Group(students);

        students = new ArrayList<>(List.of(s8, s7, s5, s4, s10));
        Group group3 = new Group(students);

        Group group4 = new Group(students);

        ArrayList<Group> groups = new ArrayList<>(List.of(group1, group2, group3));

        Flow flow1 = new Flow(groups);

        groups = new ArrayList<>(List.of(group1, group2, group3, group4, group3, group1));
        Flow flow2 = new Flow(groups);

        System.out.println(flow1.compareTo(flow2));

        // ArrayList<Flow> flows = new ArrayList<>(List.of(flow1, flow2));

        // Collections.sort(flows);

        // for (Flow flow : flows) {
        // System.out.println(flow);
        // }
        // students.sort(new StudentComparator());
        // Collections.sort(students);

        // for (Student student : group1) {
        // System.out.println(student);
        // }

        // Iterator<Student> iterator = group.iterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

    }
}