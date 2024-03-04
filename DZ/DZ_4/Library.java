import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryCard<Integer, Book>> library;
    private Integer mum = 1;

    public Library() {
        library = new ArrayList<>();
    }

    public List<LibraryCard<Integer, Book>> getList() {
        return library;
    }

    public void addLibrary(Book book) {
        library.add(new LibraryCard<Integer, Book>(mum++, book));
    }

    public void issueBook(String book) {
        boolean isFind = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getBook().getName().equals(book)) {
                library.get(i).getBook().setIssued(false);
                System.out.printf("\nКарточка %s выдана\n", book);
                isFind = true;
            }
        }

        if (!isFind) {
            System.out.println("Карточка не найдена...");
        }
    }
}
