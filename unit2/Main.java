package unit2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageDocument manageDocument = new ManageDocument();
        while(true){
            System.out.println("Press 1: add document.");
            System.out.println("Press 2: delete document.");
            System.out.println("Press 3: search type document.");
            System.out.println("Press 4: show document.");
            System.out.println("Press 5: exit.");
            String line = scanner.nextLine();
            switch (line) {
                case "1":{
                    System.out.println("Enter a: insert book");
                    System.out.println("Enter b: insert journal");
                    System.out.println("Enter c: insert newspaper");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a":{
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter Name Publisher: ");
                            String namePublisher = scanner.nextLine();
                            System.out.print("Enter Quanlity: ");
                            int quanlity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Author: ");
                            String author = scanner.nextLine();
                            System.out.print("Enter Page number: ");
                            int pageNumber = scanner.nextInt();
                            scanner.nextLine();
                            Book book = new Book(id, namePublisher, quanlity, author, pageNumber);
                            manageDocument.addDocument(book);
                            System.out.println(book.toString());
                            break;
                        }
                        case "b":{
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter Name Publisher: ");
                            String namePublisher = scanner.nextLine();
                            System.out.print("Enter Quanlity: ");
                            int quanlity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter issue Number: ");
                            int issueNumber = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter month of issue");
                            int monthOfIssue = scanner.nextInt();
                            scanner.nextLine();
                            Journal journal = new Journal(id, namePublisher, quanlity, issueNumber, monthOfIssue);
                            manageDocument.addDocument(journal);
                            System.out.println(journal.toString());
                            break;
                        }
                        case "c":{
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter Name Publisher: ");
                            String namePublisher = scanner.nextLine();
                            System.out.print("Enter Quanlity: ");
                            int quanlity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Issue day: ");
                            int dateOfIssue = scanner.nextInt();
                            scanner.nextLine();
                            Newspaper newspaper = new Newspaper(id, namePublisher, quanlity, dateOfIssue);
                            manageDocument.addDocument(newspaper);
                            System.out.println(manageDocument.toString());
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.print("Enter Id to delete: ");
                    String id = scanner.nextLine();
                        System.out.println(manageDocument.deleteDocument(id) ? "Success." : "Fail.");
                    break;
                }
                case "3":{
                    System.out.println("Enter a: search book: ");
                    System.out.println("Enter b: search journal: ");
                    System.out.println("Enter c: search newspaper: ");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "a":{
                            manageDocument.searchByBook();
                            break;
                        }
                        case "b":{
                            manageDocument.searchByJournal();
                            break;
                        }
                        case "c":{
                            manageDocument.searchByNewspaper();
                            break;
                        }
                        default:{
                            System.out.println("Invalid");
                            break;
                        }
                    }
                    break;
                }
                case "4":{
                    manageDocument.showDocument();
                    break;
                }
                case "5":{
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
