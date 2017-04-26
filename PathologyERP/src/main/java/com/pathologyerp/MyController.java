package com.pathologyerp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pathology")
public class MyController {

	@RequestMapping("/patients")
	public ResponseEntity<?> getAllPatients(){
		System.out.println("On patients page");
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping("/tests")
	public ResponseEntity<?> getAllTests(){
		System.out.println("On Tests page");
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
}
