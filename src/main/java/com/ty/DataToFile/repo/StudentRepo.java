package com.ty.DataToFile.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.DataToFile.dto.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
	@Query(value="SELECT s FROM Student s")
	public List<Student> getAllName();

}
