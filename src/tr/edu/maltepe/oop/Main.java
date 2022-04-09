package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Library library1 = new Library();
        Book book1 = new Book(348,"oop");
        Book book2 = new Book(348,"java");
        Book book3 = new Book(349,"python");

        library1.add_book(book1);
        library1.add_book(book2);
        library1.add_book(book3);

        library1.listBook();

        Student student1 = new Student(200704006);

        student1.hadBook(library1.get_book(0));

        library1.listBook();

        Proff proff1 = new Proff("Computer Engineering");

        proff1.hadBook(library1.get_book(1));

        library1.listBook();

        library1.return_book(proff1.returnBook());

        library1.return_book(student1.returnBook());

        library1.listBook();
    }

}
