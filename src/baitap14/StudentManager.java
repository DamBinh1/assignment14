package baitap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<Student>();
    }
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter date of birth: ");
        String dateOfBirth = sc.next();
        System.out.print("Enter address: ");
        String address = sc.next();
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();
        students.add(new Student(id, name, dateOfBirth, address, gpa));
        System.out.println("Student added successfully.");
    }
    public void editStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id to edit: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new name: ");
                String name = sc.next();
                System.out.print("Enter new date of birth: ");
                String dateOfBirth = sc.next();
                System.out.print("Enter new address: ");
                String address = sc.next();
                System.out.print("Enter new GPA: ");
                double gpa = sc.nextDouble();
                s.setName(name);
                s.setDateOfBirth(dateOfBirth);
                s.setAddress(address);
                s.setGpa(gpa);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student edited successfully.");
        }
    }
    public void deleteStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id to delete: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student deleted successfully.");
        }
    }
    public void sortStudentsByGpa(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getGpa() < s2.getGpa()) {
                    return 1;
                } else if (s1.getGpa() > s2.getGpa()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Students sorted by GPA.");
        showStudent();
    }
    public void sortStudentsByName(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("Students sorted by name.");
        showStudent();
    }
    public void showStudent(){
        System.out.println("List of students:");
        for (Student s : students) {
            System.out.println(s.toString());
        }


        }


}
