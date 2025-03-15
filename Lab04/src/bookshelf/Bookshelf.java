package bookshelf;

public class Bookshelf { // Used inheritance here, Bookshelf is a parent class of Books
    private int bookCount = 0;
    private Books [] shelf; //Used encapsulation here and throughout, public getters, constructors while
    // keeping variables private

    public Bookshelf() {
        shelf = new Books[5];
    }
    public Bookshelf(int shelfLength) {
        if (shelfLength <= 0) {
            shelf = new Books[5];
        } else {
            shelf = new Books[shelfLength];
        }
    }
    public int getShelfLength() {
        return shelf.length;
    }
    public int getBookCount() {
        return bookCount;
    }

    public void addBook(Books book) {
        if (bookCount < shelf.length) {
            shelf[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Error: Not enough space on bookshelf");
        }
    }
    public String toString() { // Used polymorphism here, the toString() for the parent and child classes do different things.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bookCount; i++) {
            sb.append("\nBook ").append(i+1).append(":\n").append(shelf[i].toString());
        }
        for (int i = bookCount; i < shelf.length; i++) {
            sb.append("\n").append("Empty");
        }
        return sb.toString();
    }
}
