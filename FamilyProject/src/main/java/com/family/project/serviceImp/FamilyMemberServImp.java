package com.family.project.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.project.entity.FamilyMember;
import com.family.project.repository.FamilyMemberRep;
import com.family.project.service.FamilyMemberServ;

@Service
public class FamilyMemberServImp implements FamilyMemberServ{
	@Autowired
	FamilyMemberRep familyMemberRep;
	
	@Override
	public FamilyMember save(FamilyMember famMembServSav) {
		return familyMemberRep.save(famMembServSav);
	}

	@Override
	public FamilyMember update(FamilyMember famMembServUpd) {
		return null;
	}

	@Override
	public void delete(Long famMembServDel) {
		
	}

	@Override
	public List<FamilyMember> findAll(FamilyMember famMembServAll) {
		return null;
	}


}
