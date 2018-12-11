package com.cg.donor.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.exception.DonorException;

public interface IDonoeService
{
	public String addDonor(DonorBean donor) throws DonorException, IOException, SQLException, Exception ;
	public DonorBean viewDonorDetails(String donorId) throws DonorException;
	public List retrieveAllDonor() throws DonorException;
	
	
}
