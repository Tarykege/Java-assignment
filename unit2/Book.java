package unit2;

public class Book extends Document{
    String author;
    int pageNumber;
    public Book(String id, String namePublisher, int quanlity, String author, int pageNumber) {
        super(id, namePublisher, quanlity);
        this.author = author;
        this.pageNumber = pageNumber;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public String getAuthor() {
        return author;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    @Override
    public String toString() {
        return "Book{"+"id: "+id+", namePublisher: "+namePublisher+", quanlity: "+quanlity+", author: "+author+", pagenumber: "+pageNumber+"}";
    }
    public static void main(String[] args) {
        System.out.println("Success");
    }
}
