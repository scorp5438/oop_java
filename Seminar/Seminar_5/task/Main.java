package Seminar.Seminar_5.task;

import java.util.List;

import Seminar.Seminar_5.task.data.Student;
import Seminar.Seminar_5.task.data.Teacher;
import Seminar.Seminar_5.task.service.DataService;

public class Main {
    public static void main(String[] args) {
        DataService data = new DataService();

        data.create(new Student("Алексей", 15));
        data.create(new Student("Иван", 16));
        data.create(new Student("Алиса", 18));
        data.create(new Teacher("Ольга Петровна", 32, List.of("math")));
        data.create(new Teacher("Раиса Ивановна", 43, List.of("math", "phisics")));
        data.create(new Teacher("Николай Константинович", 32, List.of("math", "phisics", "astronomy")));
        data.create(new Teacher("Сергей Алексеевич", 32, List.of("informatics", "astronomy")));

        data.read(true);
        System.out.println();
        data.read(false);
        System.out.println();

        data.showStudent(1);
        data.showStudent(2);
        data.showStudent(3);
        data.showStudent(4);

    }
}
