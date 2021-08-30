package unit2;

public class Journal extends Document {
    int issueNumber;
    public Journal(String id, String namePublisher, int quanlity, int issueNumber) {
        super(id, namePublisher, quanlity);
        this.issueNumber = issueNumber;
    }
    @Override
    public String toString() {
        return "Journal{"+"id: "+id+", namePublisher: "+namePublisher+", quanlity: "+quanlity+", issueNumber: "+issueNumber+"}";
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public static void main(String[] args) {
        System.out.println("Success");
    }
}
