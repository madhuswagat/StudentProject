package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import model.StudentForm;
import repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	

    @Autowired
    StudentRepository studentRepository;
    
 

    //Get all the students
    public List<StudentForm> getAllStudents() {
        List<StudentForm> students = studentRepository.findAll();
        return students;
    }

    //display one student by id
    public StudentForm getStudentById(int id) {
        return studentRepository.findById(id);
    }

    //save student in database
    public void saveStudent(StudentForm student) {
        try{
            studentRepository.save(student);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //delete stuednt by id
    public void deleteStudent(int id) {
        try{
            studentRepository.deleteById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}


