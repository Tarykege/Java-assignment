package unit1;

public class Worker extends Officer{
    private int level;
    public Worker(String name, int age, String gender, String addr, int level) {
        super(name, age, gender, addr);
        this.level = level;
    }
    @Override
    public String toString(){
        return "Worker{"+"name: "+name+", age: "+age+", gender: "+gender+", addr: "+addr+", level: "+level+"}";
    }
    public static void main(String[] args) {
        System.out.println("Success...");
    }
}