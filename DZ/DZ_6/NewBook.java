public class NewBook<T> extends Book {
    private int state;

    public NewBook(T name, String author, int state) {
        super(name, author);
    }

    public int getState() {
        return state;
    }

}