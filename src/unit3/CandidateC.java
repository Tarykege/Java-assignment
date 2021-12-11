package unit3;

public class CandidateC extends Candidate{
    public static final String lecturature = "Lecturature";
    public static final String history = "History";
    public static final String geography = "Geography";
    public CandidateC(String id, String name, String addr, int priority) {
        super(id, name, addr, priority);
    }
    @Override
    public String toString() {
        return "CandidateC{"+"id: "+id+", name: "+name+", addr: "+addr+", priority: "+priority+", Subject: "+lecturature+"-"+history+"-"+geography+"}";
    }
    public static void main(String[] args) {
        System.out.println("Oke");
    }
}