package unit4;

class Person{
  private String name;
  private int age;
  private String job;
  private String passport;
    public Person(String name, int age, String job, String passport){
        this.name = name;
        this.age = age;
        this.job = job;
        this.passport = passport;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }
    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }
    public String getName() {
        return name;
    }
    public String getPassport() {
        return passport;
    }
    @Override
    public String toString() {
        return "Person{"+"name: "+name+", age: "+age+", job: "+job+", passport: "+passport+"}";
    }
}