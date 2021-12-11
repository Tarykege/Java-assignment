package unit2;

public class Newspaper extends Document {
    int dateOfIssue;
    public Newspaper(String id, String namePublisher, int quanlity, int dateOfIssue) {
        super(id, namePublisher, quanlity);
        this.dateOfIssue = dateOfIssue;
    }
    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
    public int getDateOfIssue() {
        return dateOfIssue;
    }
    @Override
    public String toString() {
        return "Newspaper{"+"id: "+id+", namePublisher: "+namePublisher+", quanlity: "+quanlity+", dateOfIssue: "+dateOfIssue+"}";
    }
    public static void main(String[] args) {
        System.out.println("Success");
    }
}
