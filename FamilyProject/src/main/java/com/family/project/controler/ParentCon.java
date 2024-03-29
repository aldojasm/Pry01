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

import com.family.project.entity.Parent;
import com.family.project.service.ParentServ;

@RestController
@RequestMapping("/Parent")
public class ParentCon {
	@Autowired
	ParentServ parentServ;
	
	//
	@PostMapping("/Save")
	public Parent Save(@RequestBody Parent parentConSav) {
		return parentServ.save(parentConSav);	
	}
	
	@PutMapping("/Update")
	public Parent Update(@RequestBody Parent parentConUpd) {
		return parentServ.update(parentConUpd);
	}

	@DeleteMapping("/Delete/{id}")
		public void Delete(@PathVariable("id") Long id) {
		parentServ.delete(id);			
	}
			
	@GetMapping("/Get")
	public java.util.List<Parent> findAll(){
		return parentServ.findAll(null);		
	}
	

}
