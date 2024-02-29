package Seminar.Seminar_3.task_DZ;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private String specialization;
    private Integer grade;

    public Student(String name, int age, String specialization, int grade) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.grade = grade;
    }

    public Student(Integer grade) {
        this("noName", 20, "Math", grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return String.format("Name %s, age old %d, rating %d", name, age, grade);
    }

    // @Override
    // public int compareTo(Student student) {
    // int res = this.name.compareTo(student.name);
    // if (res == 0) {
    // res = this.age.compareTo(student.age);
    // }
    // return res;
    // }

    @Override
    public int compareTo(Student student) {
        return this.grade.compareTo(student.grade);
    }

}