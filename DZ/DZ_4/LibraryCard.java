// Каждая карточка должна содержать параметры типов K для номера карточки и V
// для информации о книге.

public class LibraryCard<K, V> {
    private K num;
    private V book;

    public LibraryCard(K num, V book) {
        this.num = num;
        this.book = book;
    }

    public K getNum() {
        return num;
    }

    public void setNum(K num) {
        this.num = num;
    }

    public V getBook() {
        return book;
    }

    public void setBook(V book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "LibraryCard [num=" + num + ", book=" + book + "]";
    }

}
