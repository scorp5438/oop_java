import java.util.ArrayList;
import java.util.List;

public class Library implements CardManager {
    private List<LibraryCard<Integer, Book>> library;
    private Integer mum = 1;

    public Library() {
        library = new ArrayList<>();
    }

    public List<LibraryCard<Integer, Book>> getList() {
        return library;
    }

    @Override
    public void addLibrary() {
    }

    @Override
    public void issueBook() {
    }

    public void addLibrary(Book book) {
        library.add(new LibraryCard<Integer, Book>(mum++, book));
    }

    public void issueBook(String book) {
        boolean isFind = false;
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i));
            if (library.get(i).getBook().getName().equals(book)) {
                library.get(i).getBook().setIssued(false);
                System.out.printf("\nКарточка %s выдана\n", book);
                isFind = true;
            }
        }
        if (!isFind) {
            System.out.printf("Карточка %s не найдена...\n", book);
        }
    }
}