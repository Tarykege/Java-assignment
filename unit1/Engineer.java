package unit1;

public class Engineer extends Officer{
    private  String branch;
    public Engineer(String name, int age, String gender, String addr, String branch) {
        super(name, age, gender, addr);
        this.branch = branch;
    }
    @Override
    public String toString(){
        return "Engineer{"+"name: "+name+", age: "+age+", gender: "+gender+", addr: "+addr+", branch: "+branch+"}";
    }
    public static void main(String[] args) {
        System.out.println("Success");
    }
}