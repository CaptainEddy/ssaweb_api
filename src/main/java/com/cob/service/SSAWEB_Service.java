package com.cob.service;

import org.springframework.stereotype.Service;

@Service
public class SSAWEB_Service {
	public String getCitizenLocatedState(String ssn) {

		String stateName = null;

		if (ssn.startsWith("1")) {
			stateName = "New Jersey";
		} else if (ssn.startsWith("2")) {
			stateName = "Rhode Island";
		} else if (ssn.startsWith("3")) {
			stateName = "Kentucky";
		} else if (ssn.startsWith("4")) {
			stateName = "Ohio";
		} else if (ssn.startsWith("5") || ssn.startsWith("6") || ssn.startsWith("7") || ssn.startsWith("8")
				|| ssn.startsWith("9") || ssn.startsWith("0")) {
			stateName = "Invalid SSN Provided";
		}
		return stateName;
	}
}
