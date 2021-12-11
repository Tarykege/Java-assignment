package unit1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageOfficer manageOfficer = new ManageOfficer();
        while(true){
            System.out.println("Press 1 to add Officer.");
            System.out.println("Press 2 to search name Officer.");
            System.out.println("Press 3 to show Officer.");
            System.out.println("Press 4 to exit.");
            String line = scanner.nextLine();
            switch (line) {
                case "1":{
                    System.out.println("Press a to add Worker");
                    System.out.println("Press b to add Staff");
                    System.out.println("Press c to add Engineer");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a":{
                            String name,gender,addr;
                            int age,level;
                            System.out.print("Name: ");
                            name = scanner.nextLine();
                            System.out.print("Age: ");
                            age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Gender: ");
                            gender = scanner.nextLine();
                            System.out.print("Address: ");
                            addr = scanner.nextLine();
                            System.out.print("Level: ");
                            level = scanner.nextInt();
                            scanner.nextLine();
                            Worker worker = new Worker(name, age, gender, addr, level);
                            manageOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            break;
                        }
                        case "b":{
                            String name,gender,addr,task;
                            int age;
                            System.out.print("Name: ");
                            name = scanner.nextLine();
                            System.out.print("Age: ");
                            age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Gender: ");
                            gender = scanner.nextLine();
                            System.out.print("Address: ");
                            addr = scanner.nextLine();
                            System.out.print("Task: ");
                            task = scanner.nextLine();
                            Staff staff = new Staff(name, age, gender, addr, task);
                            manageOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        case "c":{
                            String name,gender,addr,branch;
                            int age;
                            System.out.print("Name: ");
                            name = scanner.nextLine();
                            System.out.print("Age: ");
                            age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Gender: ");
                            gender = scanner.nextLine();
                            System.out.print("Address: ");
                            addr = scanner.nextLine();
                            System.out.print("Branch: ");
                            branch = scanner.nextLine();
                            Engineer engineer = new Engineer(name, age, gender, addr, branch);
                            manageOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;
                        }
                        default:{
                            System.out.println("valid...");
                            break;
                        }
                    }
                    break;
                }
                case "2":{
                    System.out.print("name: ");
                    String name = scanner.nextLine();
                    for (Officer o : manageOfficer.searchOfficerByName(name)) {
                        System.out.println(o.toString());
                    }
                    break;
                }
                case "3":{
                    manageOfficer.showOfficer();
                    break; 
                }
                case "4":{
                    scanner.close();
                    return;
                }
                default:{
                    System.out.println("Error...");
                    break;
                }
            }
        }
    }
}