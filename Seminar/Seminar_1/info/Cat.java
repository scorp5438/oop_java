package Seminar.Seminar_1.info;

public class Cat {
    private String name;
    private int age;

    public void purr() {
        System.out.println("purring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("murzik")) {
            System.out.println("bad name!");
        } else {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}