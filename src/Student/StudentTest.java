package Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.AddStudent(8,"Rose",16,"Glasgow");
        Scanner sc = new Scanner(System.in);
        int inputId;
        do {
            System.out.println("Please enter Student ID：");
            inputId = sc.nextInt();
            if (manageStudent.FoundUniqueId(inputId) == false) {
                System.out.println("Student with ID " + inputId + " already exists. Please enter again: ");
            } else {
                System.out.println("Please enter Student Name: ");
                String inputName = sc.next();
                System.out.println("Please enter Student Age: ");
                int inputAge = sc.nextInt();
                System.out.println("Please enter Student Address: ");
                String inputAddress = sc.next();
                manageStudent.AddStudent(inputId, inputName, inputAge, inputAddress);
                break;
            }
        }while (manageStudent.FoundUniqueId(inputId) == false);

        manageStudent.GetList();

    }
}
