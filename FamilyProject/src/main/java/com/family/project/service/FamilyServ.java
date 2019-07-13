package com.family.project.service;

import java.util.List;

import com.family.project.entity.Family;

public interface FamilyServ {
	
	//Call Class
	Family save(Family famServSav);
	Family update(Family famServUpd);
	void delete (Long famServDel);
	List<Family> findAll(Family famServAll);

}
