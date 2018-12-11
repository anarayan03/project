package com.cg.donor.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.dao.DonorDaoImpl;
import com.cg.donor.dao.IdonorDAO;
import com.cg.donor.exception.DonorException;

public class DonorServiceImpl implements IDonoeService {

	IdonorDAO donordao = new DonorDaoImpl();
	@Override
	public String addDonor(DonorBean donor) throws IOException, SQLException, Exception {
		String donorseq;
		donorseq=donordao.addDonor(donor);
		return null;
	}

	@Override
	public DonorBean viewDonorDetails(String donorId) throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List retrieveAllDonor() throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}

	public void validateDonor(DonorBean donorBean) throws DonorException
	{
		List<String> validationError  = new ArrayList<String>();
		
		if(!(isValidName(donorBean.getDonorName())))
		{
			validationError.add("\n donor name should be in alphabet and min 3 character long");
		}
		
		if(!(isValidAddress(donorBean.getAddress())))
		{
			validationError.add("\n Address should be greater than 5 characters");
		}
		
		if(!(isValidPhoneNumber(donorBean.getPhoneNumber())))
		{
			validationError.add("\n Phone number be in 10 digits only");
		}
		
		if(!(isValidAmount(donorBean.getDonationAmount())))
		{
			validationError.add("\n Amount should be a positive number");
		}
		
		if(!(validationError.isEmpty()))
		{
			throw new DonorException(validationError +"");
		}
	}

	private boolean validId(String donorId) {
		Pattern pattern = Pattern.compile("[0=9]{1,4}");
		Matcher matcher = pattern.matcher(donorId);
		
		if(matcher.matches())
		{
			return true;
		}
		else
			return false;
	}

	private boolean isValidAmount(double donationAmount) {
		return donationAmount>0;
	}

	private boolean isValidPhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile("^[6-9][0-9]{9}$");
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

	private boolean isValidAddress(String address) {
		
		return (address.length()>6);
	}

	private boolean isValidName(String donorName) {
		Pattern pattern = Pattern.compile("^[A-Za-z]{3,}$");
		Matcher matcher = pattern.matcher(donorName);
		return matcher.matches();
	}
}
