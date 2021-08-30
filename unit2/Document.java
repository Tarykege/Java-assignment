package unit2;

public class Document{
    String id;
    String namePublisher;
    int quanlity;
    public Document(String id, String namePublisher, int quanlity){
        this.id = id;
        this.namePublisher = namePublisher;
        this.quanlity = quanlity;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }
    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }
    public String getId() {
        return id;
    }
    public String getNamePublisher() {
        return namePublisher;
    }
    public int getQuanlity() {
        return quanlity;
    }
    public static void main(String[] args) {
        System.out.println("Success...");
    }
}