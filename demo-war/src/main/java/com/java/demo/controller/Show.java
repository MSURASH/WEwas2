package com.java.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.bean.SSN;
import com.java.demo.repository.SSNDao;

@RestController
@RequestMapping("ssa/gv")
public class Show {
	
	@Autowired
	SSNDao ssnDao;
	
	
	@RequestMapping(value = "/claimj", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<SSN> getJsonList() {
		return ssnDao.createTeam();
	}

	@RequestMapping(value = "/claimx", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public List<SSN> getXmlList() {
		return ssnDao.createTeam();
	}

}
