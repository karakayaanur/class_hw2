package tr.edu.maltepe.oop;

public class Proff extends Person{
    private String department;
    private Book temp;

    public Proff(String department){
        this.department = department;
    }
    public void hadBook(Book book){
        System.out.println("\n(Professor) I had this book:"+book.getName()+"\n");
        temp = book;
    }
    public Book returnBook(){
        System.out.println("\n(Professor) I am returning this book:"+temp.getName());
        return temp;
    }
}
