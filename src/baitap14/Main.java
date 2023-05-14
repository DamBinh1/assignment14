package baitap14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("-----------Menu-----------");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by gpa.");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. Exit.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.editStudent();
                    break;
                case 3:
                    sm.deleteStudent();
                    break;
                case 4:
                    sm.sortStudentsByGpa();
                    break;
                case 5:
                    sm.sortStudentsByName();
                    break;
                case 6:
                    sm.showStudent();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
