package tr.edu.maltepe.oop;

public class Student extends Person{
    private int id;
    private Book temp;

    public Student(int id){
        this.id = id;
    }

    public void hadBook(Book book){
        System.out.println("\n(Student) I had this book:"+book.getName()+"\n");
        temp=book;
    }
    public Book returnBook(){
        System.out.println("\n(Stuent) I am returning this book:"+temp.getName());
        return temp;
    }
}
