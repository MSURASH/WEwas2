package com.java.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.demo.bean.SSN;

@Repository
public class SSNRepo implements SSNDao{

	
	public List<SSN> createTeam() {
		
		List<SSN> ssn = new ArrayList<SSN>();
		int i = 1;
		String val = "SSN number: "+"123-456-789";
		
		while(i < 6) {
			
			
			ssn.add(new SSN(val+Integer.toString(i), "12/"+i+"/2022"));
			i++;
		}
		return ssn;
	}

}
