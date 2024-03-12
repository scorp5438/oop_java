public class Book<T> {
    private T name;
    private String author;
    private boolean issued;

    public Book(T name, String author) {
        this.name = name;
        this.author = author;
        this.issued = true;
    }

    public Book(T name) {
        this(name, "default");
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    @Override
    public String toString() {
        return issued ? String.format("%s, в библиотеке", name) : String.format("%s, выдана", name);
    }

}
