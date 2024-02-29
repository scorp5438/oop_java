package Seminar.Seminar_3.info;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class School implements Iterable<Person> {
    private List list = new ArrayList<>();

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public Iterator<Person> iterator() {
        return new PeopleIterator(list);
    }
}

// Создаем компаратор для сортировки объектов Person по имени
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class PeopleIterator implements Iterator<Person> {
    public PeopleIterator(List<Person> people) {
        this.people = people;
    }

    private List<Person> people = new ArrayList<>();
    private int count;

    @Override
    public boolean hasNext() {
        return count < people.size();

    }

    @Override
    public Person next() {
        return people.get(count++);
    }
}

public class Main {
    public static void main(String[] args) {
        // List<Person> people = new ArrayList<>();
        // people.add(new Person("Charlie", 30));
        // people.add(new Person("Alice", 25));
        // people.add(new Person("Bob", 20));
        //
        // // Сортировка списка людей по имени с помощью компаратора
        // Collections.sort(people, new NameComparator());
        //
        // // Вывод отсортированного списка с помощью Iterator
        // System.out.println("People sorted by name:");
        // Iterator<Person> iterator = people.iterator();
        // while (iterator.hasNext()) {
        // Person person = iterator.next();
        // System.out.println(person.getName() + ": " + person.getAge());
        // }
        Person p1 = new Person("Charlie", 25);
        Person p2 = new Person("Johnh", 18);
        Person p3 = new Person("Alex", 26);
        Person p4 = new Person("Gordon", 30);
        List list = new ArrayList<>(List.of(p1, p2, p3, p4));
        School school = new School();
        school.setList(list);
        Iterator<Person> iterator = school.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("name " + person.getName() + " age " + person.getAge());
        }
    }
}