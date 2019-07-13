package com.family.project.service;

import java.util.List;

import com.family.project.entity.Student;

public interface StudentServ {
	
	//Call Class
	Student save(Student stuServSav);
	Student update(Student stuServUpd);
	void delete (Long stuServDel);
	List<Student> findAll(Student stuServAll);

}
