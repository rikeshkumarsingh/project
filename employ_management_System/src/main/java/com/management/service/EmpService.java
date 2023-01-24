package com.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.EmpEntity;
import com.management.reposetry.Repo;
@Service
public class EmpService {
	@Autowired
	private Repo reposetry;
	
	public void addemp(EmpEntity empEntity) {
		reposetry.save(empEntity);		
		
	}
	public List<EmpEntity> getAllEmpEntities(){
		
		return reposetry.findAll();
	}
	
	public EmpEntity getEmpById(int id) {
	
	 Optional<EmpEntity> rp = reposetry.findById(id);
	 if (rp.isPresent()) {
		 return rp.get();		
	}
	 return null;
	}
	public void deletemp(int id) {
		
		reposetry.deleteById(id);
	}

}
