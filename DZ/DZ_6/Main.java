public class Main {

    // SRP
    // Реализован принцип Single Responsibility Principle - из файла Library методы
    // добавления и
    // выдачи карточки вынесены в интерфейс CardManager который имплементирует сам
    // класс Library

    // LCP
    // Реализован принцип Liskov Substitution Principle - новый класс NewBook
    // который подставлен в основной код
    // и работа программы не изменила поведение

    public static void main(String[] args) {
        Library library = new Library();

        library.addLibrary(new Book<String>("Кладбище домашних животных", "С. Кинг"));
        library.addLibrary(new Book<String>("Лангоньеры", "С. Кинг"));
        library.addLibrary(new Book<String>("Худеющий", "С. Кинг"));
        library.addLibrary(new Book<String>("Оно", "С. Кинг"));
        library.addLibrary(new NewBook<String>("1984", "Оруэл", 10));

        for (LibraryCard string : library.getList()) {
            System.out.println(string);
        }

        library.issueBook("Худеющий");
        System.out.println();

        for (LibraryCard string : library.getList()) {
            System.out.println(string);
        }

        library.issueBook("1984");
        System.out.println();

        for (LibraryCard string : library.getList()) {
            System.out.println(string);
        }
    }
}
