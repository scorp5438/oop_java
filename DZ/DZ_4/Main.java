public class Main {

    // Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке.
    // Каждая книга должна содержать параметр типа T для ее названия.
    // Создайте обобщенный класс LibraryCard<K, V>, который представляет
    // библиотечную карточку для определенной книги.
    // Каждая карточка должна содержать параметры типов K для номера карточки и V
    // для информации о книге.
    // Создайте класс Library, который будет представлять библиотеку.
    // У этого класса должны быть методы для добавления книг и выдачи библиотечных
    // карточек.
    // Добавьте метод для вывода информации о всех выданных книгах с их
    // библиотечными карточками.
    public static void main(String[] args) {
        Library library = new Library();

        library.addLibrary(new Book<String>("Война и мир"));
        library.addLibrary(new Book<String>("Война и мир 2"));
        library.addLibrary(new Book<String>("Война миров"));
        library.addLibrary(new Book<String>("Война миров 2"));

        for (LibraryCard string : library.getList()) {
            System.out.println(string);
        }

        library.issueBook("Война миров 2");
        System.out.println();

        for (LibraryCard string : library.getList()) {
            System.out.println(string);
        }

        library.issueBook("Война миров");
        System.out.println();

        for (LibraryCard string : library.getList()) {
            System.out.println(string);
        }
    }
}
