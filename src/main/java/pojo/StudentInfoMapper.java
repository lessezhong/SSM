package pojo;

import java.util.List;

public interface StudentInfoMapper {  
    /**����**/  
    public void insertStudent(Student userinfo);  
    /**�޸�**/  
    public void updateStudent(Student userinfo);  
    /**����**/  
    public List<Student> getStudentList();  
    /**ɾ��**/  
    public void deleteStudent(String name);  
    public void deleteStudent();  
    public int getStudentCount();
    public Student getStudentById(int id);
 }