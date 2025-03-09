package bookshelf;

public class BookshelfApp {
    public static void main(String[] args) {
// Abstraction utilized, user does not see the array created or added to, nor the checks for arguments
// Assuming the user wrote this app, they only are able to add books or create books through their classes, not directly editing arrays
// or variables.
        Bookshelf A = new Bookshelf(3);
        Books book1 = new Books("novel", "Frankenstein", 300, 5);
        Books book2 = new Books("novella", "Pride & Prejudice", 500, 2);
        Books book3 = new Books("graphic novel", "Pride & Prejudice", 0, 0);
        Books book4 = new Books("Cover Only",null,0,0);
        A.addBook(book1);
        A.addBook(book2);
        A.addBook(book3);
        A.addBook(book4);

        System.out.println(A);

    }
}
