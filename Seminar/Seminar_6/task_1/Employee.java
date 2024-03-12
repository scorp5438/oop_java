package Seminar.Seminar_6.task_1;

/*
 * В этом примере класс Employee нарушает SRP,
 * так как он содержит методы как для вычисления заработной платы,
 * так и для сохранения данных в базу данных.
 * Это делает класс менее поддерживаемым и усложняет его изменение.
 */

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        // Подсчет заработной платы
    }

    public void saveEmployee() {
        // Сохранение данных сотрудника в базу данных
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // return "Employee [name=" + name + ", salary=" + salary + "]";
        return String.format("Имя %s, ЗП %d", name, salary);
    }
}
