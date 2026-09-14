package Task_1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudentById(int id){
        for (Student student : students){
            if (student.getId() == id){
                students.remove(student);
            }
        }
    }

    public Student findStudentById(int id){
        for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudents(){
        return students;
    }
}
