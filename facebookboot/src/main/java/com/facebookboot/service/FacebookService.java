package com.facebookboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebookboot.dao.FacebookDAOInterface;
import com.facebookboot.entity.FacebookUser;

@Service
public class FacebookService implements FacebookServiceInterface{
	
	@Autowired
	private FacebookDAOInterface fd;

	@Override
	public FacebookUser createProfileService(FacebookUser fu) {
			return fd.save(fu);
	}

}
