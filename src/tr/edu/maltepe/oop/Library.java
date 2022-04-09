package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library {
    Vector vector1 = new Vector();

    public Library(){
    }

    public void add_book(Book book){
        vector1.add(book);
    }

    public void listBook(){
        System.out.println("List of Books:");
        for(int i = 0;i<vector1.size();i++){
            Book temp = (Book) vector1.get(i);
            System.out.println(i+")"+temp.getName());
        }
    }

    public Book get_book(int index){
        Book temp = (Book) vector1.get(index);
        vector1.remove(index);
        return temp;
    }
    public void return_book(Book book){
        vector1.add(book);
    }
}
