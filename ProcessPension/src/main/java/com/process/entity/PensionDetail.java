package com.process.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PensionDetail {
	private String aadhar;
    private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "YYYY-MM-dd" , timezone="IST")
	private Date dateOfBirth;
	private String pan;
	private double salary;
	private double allowance;
	private String pensionType;
	private String bankName;
	private long accountNumber;
	private String bankType;
	private double bankServiceCharge;
	private double totalAmount;
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	public double getBankServiceCharge() {
		return bankServiceCharge;
	}
	public void setBankServiceCharge(double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public PensionDetail(String aadhar, String name, Date dateOfBirth, String pan, double salary, double allowance,
			String pensionType, String bankName, long accountNumber, String bankType) {
		super();
		this.aadhar = aadhar;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.salary = salary;
		this.allowance = allowance;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}
	
	public PensionDetail(double bankServiceCharge, double totalAmount) {
		super();
		this.bankServiceCharge = bankServiceCharge;
		this.totalAmount = totalAmount;
	}
	public PensionDetail() {
		super();
	}
	
	

}
