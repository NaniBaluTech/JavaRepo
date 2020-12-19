package com.example.springBootDocker.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootDocker.model.EndUser;

@RestController
@RequestMapping("/endUsers")
public class EndUserController {
	
	@GetMapping("/listOfEndUsers")
	public List<EndUser> getListOfEndUsers(@RequestParam("userDesg") String userDesg){
		List<EndUser> list = new ArrayList<EndUser>();
		EndUser  eu1 = new EndUser(111,"Nani","Engineer","Hyd");
		EndUser  eu2 = new EndUser(222,"Balu","Vendor","Egdt");
		EndUser  eu3 = new EndUser(333,"Bhanu","Engineer","Hyd");
		EndUser  eu4 = new EndUser(444,"Kriishna","Devleoper","Egdt");
		EndUser  eu5 = new EndUser(555,"Bala","Vendor","Razole");
		list.add(eu1);
		list.add(eu2);
		list.add(eu3);
		list.add(eu4);
		list.add(eu5);
		
		//
		
		List<EndUser> endUserBasedOnDesg= list.stream().filter(emp->emp.getEndUserDesg().equalsIgnoreCase(userDesg)).collect(Collectors.toList());
		
		
		
		return endUserBasedOnDesg;
	}
	

}
