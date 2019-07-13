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

import com.family.project.entity.Family;
import com.family.project.service.FamilyServ;

@RestController
@RequestMapping("/Family")
public class FamilyCon {
	@Autowired
	FamilyServ familyServ;
	
	//
	@PostMapping("/Save")
	public Family Save(@RequestBody Family familyConSav) {
		return familyServ.save(familyConSav);	
	}
	
	@PutMapping("/Update")
	public Family Update(@RequestBody Family familyConDel) {
		return familyServ.update(familyConDel);
	}

	@DeleteMapping("/Delete/{id}")
		public void Delete(@PathVariable("id") Long id) {
		familyServ.delete(id);			
	}
			
	@GetMapping("/Get")
	public java.util.List<Family> findAll(){
		return familyServ.findAll(null);		
	}
	

}
