package com.family.project.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.family.project.entity.Student;
import com.family.project.service.StudentServ;

@RestController
@RequestMapping("/Student")
public class StudentCon {
	@Autowired
	StudentServ studentServ;
	
	//
	@PostMapping("/Save")
	public Student Save(@RequestBody Student studentConSav) {
		return studentServ.save(studentConSav);	
	}
	
	@PutMapping("/Update")
	public Student Update(@RequestBody Student studentConUpd) {
		return studentServ.update(studentConUpd);
	}

	@DeleteMapping("/Delete/{id}")
		public void Delete(@PathVariable("id") Long id) {
		studentServ.delete(id);			
	}
			
	@GetMapping("/Get")
	public java.util.List<Student> findAll(){
		return studentServ.findAll(null);		
	}
	

}