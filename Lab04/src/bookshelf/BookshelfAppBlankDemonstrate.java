package bookshelf;

public class BookshelfAppBlankDemonstrate {
    public static void main(String[] args) {
        Bookshelf B = new Bookshelf(6); //Made to demonstrate that the blank aspect of the code works
        Books book1 = new Books("novel", "Frankenstein", 300, 5);
        Books book2 = new Books("novella", "Pride & Prejudice", 500, 2);
        Books book3 = new Books("graphic novel", "Pride & Prejudice", 0, 0);
        Books book4 = new Books("Cover Only",null,0,0);
        B.addBook(book1);
        B.addBook(book2);
        B.addBook(book3);
        B.addBook(book4);

        System.out.println(B);

    }
}
