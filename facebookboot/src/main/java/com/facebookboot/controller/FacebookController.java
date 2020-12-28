package com.facebookboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.facebookboot.dao.FacebookDAOInterface;
import com.facebookboot.entity.FacebookUser;
import com.facebookboot.service.FacebookServiceInterface;
@RestController
@CrossOrigin(origins = {"http://localhost:3000"},methods = RequestMethod.GET,maxAge = 3000)
public class FacebookController {
	
	@Autowired
	private FacebookServiceInterface fs;
	
	@PostMapping("createprofilefacebook")
	public String createProfile(@RequestBody FacebookUser fu) {
		
		
		String str="Registration Fail";
		//int i=fs.createProfileService(fu);
		//if(i>0) {
		////	str="Registration Success";
		//}
	//	ModelAndView mv=new ModelAndView();
	//	mv.addObject("result", str);
	//	mv.setViewName("rr.jsp");
		return "";
	}
	@DeleteMapping("deleteprofilefacebook")
	public String deleteProfile(@PathParam("id") String id,@PathVariable("id") String id1) {
		return id+"  "+id1;
	}
	@PutMapping("editprofilefacebook")
	public String editProfile(@RequestBody FacebookUser fu,@PathParam("id") String id) {
		return fu.getEmail()+"  "+id;
	}
	@GetMapping("viewAllprofilefacebook")
	public List<FacebookUser> viewallProfile() {
		List<FacebookUser> ll=new ArrayList<FacebookUser>();
		return ll;
	}
	@GetMapping("viewprofilefacebook")
	public FacebookUser viewProfile(@PathParam("id") String id) {
		FacebookUser fu=new FacebookUser();
		return fu;
	}
	@GetMapping("searchprofilefacebook")
	public List<FacebookUser> searchProfile(@PathParam("name") String name) {
		List<FacebookUser> ll=new ArrayList<FacebookUser>();
		return ll;
	}

}
