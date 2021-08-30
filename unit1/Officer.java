package unit1;


public class Officer{
   protected String name;
   protected int age;
   protected String gender;
   protected String addr;
    public Officer(String name, int age, String gender, String addr){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getAddr() {
        return addr;
    }
    public static void main(String[] args) {
        System.out.println("Success...");
    }
}
