package com.family.project.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.project.entity.Parent;
import com.family.project.repository.ParentRep;
import com.family.project.service.ParentServ;

@Service
public class ParentServImp implements ParentServ{
	@Autowired
	ParentRep parentRep;

	@Override
	public Parent save(Parent parServSav) {
		return parentRep.save(parServSav);	
	}

	@Override
	public Parent update(Parent parServUpd) {
		return parentRep.save(parServUpd);
	}

	@Override
	public void delete(Long parServDel) {
		parentRep.deleteById(parServDel);
		
	}

	@Override
	public List<Parent> findAll(Parent parServAll) {
		return	parentRep.findAll();
	}

}
