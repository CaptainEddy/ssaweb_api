package com.cob.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cob.service.SSAWEB_Service;

@RestController
public class SSAWEB_Controller {

	@Autowired
	private SSAWEB_Service ssaweb_Service;

	@GetMapping("/verify/{ssn}")
	public ResponseEntity<String> verifyState(@PathVariable String ssn) {
		return new ResponseEntity<String>(ssaweb_Service.getCitizenLocatedState(ssn), HttpStatus.OK);
	}
}
