package com.process.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.process.entity.PensionDetail;
import com.process.repository.PensionDetailsRepo;

@Service
public class ProcessPensionServiceImpl implements ProcessPensionService {
	@Autowired
	PensionDetailsRepo pensionDetailRepo;

	@Override
	public PensionDetail calculatePensionAmount(PensionDetail pensionDetail) {
		double pensionAmount = 0;
		if (pensionDetail.getPensionType().equalsIgnoreCase("self")) {
			pensionAmount = (0.8*pensionDetail.getSalary() + pensionDetail.getAllowance());
		} else if (pensionDetail.getPensionType().equalsIgnoreCase("family")) {
			pensionAmount = (0.5 * pensionDetail.getSalary() + pensionDetail.getAllowance());
		}
		if (pensionDetail.getBankType().equalsIgnoreCase("private")) {
			pensionAmount = pensionAmount - 550;
			
		}
		else if (pensionDetail.getBankType().equalsIgnoreCase("public")) {
			pensionAmount = pensionAmount - 500;
		}
		return pensionDetail;
	}

	@Override
	public String savePensioner(PensionDetail pensioner) {
		PensionDetail savedPensioner = pensionDetailRepo.save(pensioner);
		return savedPensioner.getAadhar();
	}
	


}
