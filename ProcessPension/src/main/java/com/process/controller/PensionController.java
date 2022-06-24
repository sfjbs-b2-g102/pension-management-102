package com.process.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.process.entity.PensionDetail;
import com.process.service.ProcessPensionService;

public class PensionController {
	
	@Autowired
	private ProcessPensionService processPensionService;
	
	@PostMapping("/processPensionInput")
	String createPensioner(@RequestBody PensionDetail pensioner) {
		
		String adhaar = processPensionService.savePensioner(pensioner);
		return adhaar;
	}

}
