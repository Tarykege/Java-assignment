package unit3;

public class Candidate {
    protected String id;
    protected String name;
    protected String addr;
    protected int priority;
    public Candidate(String id, String name, String addr, int priority){
       this.id = id;
       this.name = name;
       this.addr = addr;
       this.priority = priority; 
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getAddr() {
        return addr;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPriority() {
        return priority;
    }
    public static void main(String[] args) {
        System.out.println("Success");
    }
}