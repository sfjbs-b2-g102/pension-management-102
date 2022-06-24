package com.process.service;

import com.process.entity.PensionDetail;

public interface ProcessPensionService {
	
	public PensionDetail calculatePensionAmount(PensionDetail pensionDetail);
	
	public String savePensioner(PensionDetail pensioner);

}
