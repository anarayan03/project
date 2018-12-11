package com.cg.donor.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.util.DBConnection;
import com.cg.donor.exception.DonorException;

public class DonorDaoImpl implements IdonorDAO {

	@Override
	public String addDonor(DonorBean donor) throws DonorException, ClassNotFoundException, IOException, SQLException {
		Connection connection = DBConnection.getInstance().getConnection();
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

}
