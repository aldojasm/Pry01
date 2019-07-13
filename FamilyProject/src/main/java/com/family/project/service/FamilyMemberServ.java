package com.family.project.service;

import java.util.List;

import com.family.project.entity.FamilyMember;

public interface FamilyMemberServ {
	
	//Call Class
	FamilyMember save(FamilyMember famMembServSav);
	FamilyMember update(FamilyMember famMembServUpd);
	void delete (Long famMembServDel);
	List<FamilyMember> findAll(FamilyMember famMembServAll);

}
