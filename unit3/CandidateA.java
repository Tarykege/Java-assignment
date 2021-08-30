package unit3;

public class CandidateA extends Candidate{
    public static final String math = "Math";
    public static final String physical = "Physical";
    public static final String chemical = "Chemical";
    public CandidateA(String id, String name, String addr, int priority) {
        super(id, name, addr, priority);
    }
    @Override
    public String toString() {
        return "CandidateA{"+"id: "+id+", name: "+name+", addr: "+addr+", priority: "+priority+", Subject: "+math+"-"+physical+"-"+chemical+"}";
    }
    public static void main(String[] args) {
        System.out.println("Oke");
    }
}
