package com.facebookboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facebookboot.entity.FacebookUser;

@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookUser, Long>{
	
}
