package com.ty.DataToFile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.DataToFile.dto.Student;
import com.ty.DataToFile.repo.StudentRepo;
@Repository
public class dao {
	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> getAll(){
		return studentRepo.findAll();
	}
	public List<Student> getAllName(){
		return studentRepo.getAllName();
	}

}
