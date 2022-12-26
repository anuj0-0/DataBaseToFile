package com.ty.DataToFile.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.DataToFile.dao.dao;
import com.ty.DataToFile.dto.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	String path = "H:\\New folder\\DB.txt";
	@Autowired
	dao dao;

	@GetMapping()
	public void getAll() throws IOException {
		FileWriter fileWriter = new FileWriter(path);
		List<Student> list = dao.getAllName();
		for(Student student:list) {
			fileWriter.write(student.getName());
		}
		fileWriter.close();
	}

}
