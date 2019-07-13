package com.family.project.service;

import java.util.List;

import com.family.project.entity.Parent;

public interface ParentServ {
	
	//Call Class
	Parent save(Parent parServSav);
	Parent update(Parent parServUpd);
	void delete (Long parServDel);
	List<Parent> findAll(Parent parServAll);

}
