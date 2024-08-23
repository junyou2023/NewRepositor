package Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.AddStudent(8,"Rose",16,"Glasgow");
        manageStudent.AddStudent(9,"Lisa",12,"London");
        Del(manageStudent);
        manageStudent.GetList();

    }
    public static void Add(ManageStudent manageStudent){
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

    public static void Del(ManageStudent manageStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Student ID to delete: ");
        int inputId = sc.nextInt();
        Boolean Found = manageStudent.DeleteStudent(inputId);
        if (Found == true) {
            System.out.println("学生信息删除成功");
        }else if (Found == false){
            System.out.println("此学生id不存在");
        }

    }

}
