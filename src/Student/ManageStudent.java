package Student;

import java.util.ArrayList;

public class ManageStudent {
    ArrayList<Student> list = new ArrayList<Student>();
    public void AddStudent(int id, String name, int age, String address){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        list.add(student);
    }

    public boolean FoundUniqueId(int inputId){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == inputId) {
                return false;
            }
        }
        return true;
    }

    public boolean DeleteStudent(int inputId){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == inputId) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean UpdateStudent(int inputId, String inputName, int inputAge, String inputAddress){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == inputId) {
                list.get(i).setName(inputName);
                list.get(i).setAge(inputAge);
                list.get(i).setAddress(inputAddress);
                return true;
            }
        }
        return false;
    }

    public void GetList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() +" "+list.get(i).getName()+" "
                    +list.get(i).getAge()+" "+list.get(i).getAddress());
        }
    }

}
