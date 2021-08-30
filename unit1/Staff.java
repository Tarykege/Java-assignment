package unit1;

public class Staff extends Officer{
    private
     String task;
    public Staff(String name, int age, String gender, String addr, String task) {
        super(name, age, gender, addr);
        this.task = task;
    }
    @Override
    public String toString(){
        return "Staff{"+"name: "+name+", age: "+age+", gender: "+gender+", addr: "+addr+", task: "+task+"}";
    }
    public static void main(String[] args) {
        System.out.println("Success...");
    }
}