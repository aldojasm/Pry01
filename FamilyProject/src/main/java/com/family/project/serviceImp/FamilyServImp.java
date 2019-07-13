package com.family.project.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.project.entity.Family;
import com.family.project.repository.FamilyRep;
import com.family.project.service.FamilyServ;

@Service
public class FamilyServImp implements FamilyServ {
	@Autowired
	FamilyRep familyRep;

	@Override
	public Family save(Family famServSav) {
		return familyRep.save(famServSav);
	}

	@Override
	public Family update(Family famServUpd) {
		return familyRep.save(famServUpd);
	}

	@Override
	public void delete(Long famServDel) {
		familyRep.deleteById(famServDel);
		
	}

	@Override
	public List<Family> findAll(Family famServAll) {
		return familyRep.findAll();
	}
	

}
