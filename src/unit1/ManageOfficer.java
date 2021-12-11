package unit1;

import java.util.ArrayList;
import java.util.List;

public class ManageOfficer{
   private List<Officer> officers = new ArrayList<Officer>();
    public void addOfficer(Officer officer){
        this.officers.add(officer);
    }
    public List<Officer> searchOfficerByName(String name){
        List<Officer> filter = new ArrayList<Officer>(this.officers);
        int i=0;
        while (i<filter.size()){
            if(filter.get(i).getName().contains(name)== false)
                filter.remove(i);
            else i++;
        }
        return filter;
    }
    public void showOfficer(){
        for (Officer officer : officers) {
            System.out.println(officer.toString());
        }
    }
    public static void main(String[] args) {
        System.out.println("Success...");
    }
}