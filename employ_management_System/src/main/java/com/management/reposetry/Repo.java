package com.management.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.entity.EmpEntity;
@Repository
public interface Repo extends JpaRepository<EmpEntity, Integer>{
	

}
