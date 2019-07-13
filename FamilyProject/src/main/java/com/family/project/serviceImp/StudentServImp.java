package com.family.project.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.project.entity.Student;
import com.family.project.repository.StudentRep;
import com.family.project.service.StudentServ;

@Service
public class StudentServImp implements StudentServ{
	@Autowired
	StudentRep studentRep;
	
	@Override
	public Student save(Student stuServSav) {
		return studentRep.save(stuServSav);
	}

	@Override
	public Student update(Student stuServUpd) {
		return studentRep.save(stuServUpd);
	}

	@Override
	public void delete(Long stuServDel) {
		studentRep.findById(stuServDel);
		
	}

	@Override
	public List<Student> findAll(Student stuServAll) {
		return studentRep.findAll();
	}


}
