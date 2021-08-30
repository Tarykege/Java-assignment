package unit4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Town town = new Town();
        int numFamily = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<numFamily; i++){
            System.out.print("Enter addr:");
            String address = scanner.nextLine();

            System.out.print("Enter person number in family");
            List<Person> persons = new ArrayList<>();
            int numPerson = scanner.nextInt();
            scanner.nextLine();
            for(int j=0; j<numPerson; j++){
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter job: ");
                String job = scanner.nextLine();
                System.out.print("Enter passport: ");
                String passport = scanner.nextLine();
                Person person = new Person(name, age, job, passport);
                persons.add(person);
            }
            Family family = new Family(persons, address);
            town.addFamily(family);
        }
        scanner.close();
        System.out.println(town);
   } 
}
