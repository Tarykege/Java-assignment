package unit4;

import java.util.List;

public class Family {
    private List<Person> persons;
    private String address;
    public Family(List<Person> persons, String address){
        this.persons = persons;
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public List<Person> getPersons() {
        return persons;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    @Override
    public String toString() {
        return "Family{"+"persons: "+persons+", address"+address+"}";
    }
}
