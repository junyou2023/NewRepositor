package Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.AddStudent(8,"Rose",16,"Glasgow");
        manageStudent.AddStudent(9,"Lisa",12,"London");
        Scanner sc = new Scanner(System.in);
        Boolean operationSuccess = true;
        do {
            System.out.println("请输入您想要的选项");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");

            int opion = sc.nextInt();
            switch (opion){
                case 1:
                    Add(manageStudent);
                    break;
                case 2:
                    operationSuccess = Del(manageStudent);
                    break;
                case 3:
                    UpdateStudent(manageStudent);
                    break;
                default:
                    System.out.println("无效的选项，请重新选择。");
                    operationSuccess = false;  // 操作失败
                    break;
            }
        } while (!operationSuccess);
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

    }

    public static Boolean Del(ManageStudent manageStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Student ID to delete: ");
        int inputId = sc.nextInt();
        Boolean Found = manageStudent.DeleteStudent(inputId);
        if (Found == true) {
            System.out.println("学生信息删除成功");
        }else {
            System.out.println("此学生id不存在");
        }
        return Found;
    }

    public static void UpdateStudent(ManageStudent manageStudent){
        Scanner sc = new Scanner(System.in);
        int inputId;
        do {
            System.out.println("Please enter Student ID：");
            inputId = sc.nextInt();
            if (manageStudent.FoundUniqueId(inputId) == false) {
                System.out.println("请输入需要修改的学生姓名: ");
                String inputName = sc.next();
                System.out.println("请输入需要修改的学生年龄: ");
                int inputAge = sc.nextInt();
                System.out.println("请输入需要修改的学生地址: ");
                String inputAddress = sc.next();
                manageStudent.UpdateStudent(inputId, inputName, inputAge, inputAddress);
                break;
            } else {
                System.out.println("学生ID不存在");
            }
        }while (manageStudent.FoundUniqueId(inputId) == true);

    }

}
