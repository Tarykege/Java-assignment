package unit3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStudent manageStudent = new ManageStudent();
        while(true){
            System.out.println("Enter 1: add Candidate");
            System.out.println("Enter 2: Show list");
            System.out.println("Enter 3: Search by Id");
            System.out.println("Enter 4: Exit");
            String line = scanner.nextLine();
            switch (line) {
                case "1":{
                    System.out.println("Enter a: add Candidate A");
                    System.out.println("Enter b: add Candidate B");
                    System.out.println("Enter c: add Candidate C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a":{
                            System.out.print("Id: ");
                            String id = scanner.nextLine();
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Addr: ");
                            String addr = scanner.nextLine();
                            System.out.print("Priority: ");
                            int priority = scanner.nextInt();
                            scanner.nextLine();
                            CandidateA candidateA = new CandidateA(id, name, addr, priority);
                            manageStudent.addCandidate(candidateA);
                            System.out.println(candidateA.toString());
                            break;
                        }
                        case "b":{
                            System.out.print("Id: ");
                            String id = scanner.nextLine();
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Addr: ");
                            String addr = scanner.nextLine();
                            System.out.print("Priority: ");
                            int priority = scanner.nextInt();
                            scanner.nextLine();
                            CandidateB candidateB = new CandidateB(id, name, addr, priority);
                            manageStudent.addCandidate(candidateB);
                            System.out.println(candidateB.toString());
                            break;
                        }
                        case "c":{
                            System.out.print("Id: ");
                            String id = scanner.nextLine();
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Addr: ");
                            String addr = scanner.nextLine();
                            System.out.print("Priority: ");
                            int priority = scanner.nextInt();
                            scanner.nextLine();
                            CandidateC candidateC = new CandidateC(id, name, addr, priority);
                            manageStudent.addCandidate(candidateC);
                            System.out.println(candidateC.toString());
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2":{
                    manageStudent.showCandidate();
                    break;
                }
                case "3":{
                    System.out.print("search id: ");
                    String id = scanner.nextLine();
                    manageStudent.searchCandidateByID(id).forEach(o -> System.out.println(o.toString()));
                    break;
                }
                case "4":{
                    scanner.close();
                    return;
                }
                default:{
                    System.out.println("Invalid");
                    break;
                }
            }
        }
    }
}
