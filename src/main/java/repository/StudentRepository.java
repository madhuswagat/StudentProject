package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.StudentForm;

public interface StudentRepository extends JpaRepository<StudentForm,Integer>{
	
	List<StudentForm> findAll();
	StudentForm findById(int id);
    int deleteById(int id);



	
}