package tr.edu.maltepe.oop;

public class Book {
    private int page;
    private String name;

    public Book(int page, String name){
        this.name = name;
        this.page = page;
    }
    public int getPage(){
        return page;
    }

    public void setPage(int page){
        this.page = page;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
