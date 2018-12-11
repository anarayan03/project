package com.cg.donor.pi;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.exception.DonorException;
import com.cg.donor.service.DonorServiceImpl;
import com.cg.donor.service.IDonoeService;

public class DonorMain {
	static Scanner scanner = new Scanner(System.in);
	static IDonoeService iDonoeService = null;
	static DonorServiceImpl donorServiceImpl = null;

	public static void main(String[] args) {
		DonorBean donorBean = null;
		String donorId = null;
		int option = 0;

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println(" ICARE CAPGEMINI TRUST  ");
			System.out.println("----------------------------");
			System.out.println("1. Add Donator");

			System.out.println("2. View Donator");
			System.out.println("3. Retrieve All");
			System.out.println("4. Exit");
			System.out.println("_________________________________");
			System.out.println("Select An Option :");

			try {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					while(donorBean==null)
					{
						donorBean=populateDonorBean();
					}
					try
					{
						donorServiceImpl = new DonorServiceImpl();
						donorId=donorServiceImpl.addDonor(donorBean);
						System.out.println("Donator details has been successfully registered");
						System.out.println("Donator ID is :"+ donorId);
					}catch (DonorException donorException) {
						System.out.println("ERROR :" + donorException.getMessage());
					}
					finally {
						donorId = null;
						donorServiceImpl = null;
						donorBean = null;
					}
					break;

				case 2:

					break;
					
				case 3:

					break;
					
				case 4:

					break;
					
				default:
					
					break;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	private static DonorBean populateDonorBean() {
		DonorBean donorBean = new DonorBean();
		System.out.println("\n Enter Details :\n");
		
		System.out.println("Enter Donor Name :");
		donorBean.setDonorName(scanner.next());
		
		System.out.println("Enter Donor Contact :");
		donorBean.setPhoneNumber(scanner.next());
		
		System.out.println("Enter Donor Address :");
		donorBean.setAddress(scanner.next());
		
		System.out.println("Enter donate Amount");
		try
		{
		donorBean.setDonationAmount(scanner.nextDouble());
		}catch (InputMismatchException ime) {
			scanner.nextLine();
			System.err.println("Please enter a numeric value for donation amount, try again");
		}
		
		donorServiceImpl = new DonorServiceImpl();
		try
		{
			donorServiceImpl.validateDonor(donorBean);
			return donorBean;
		}catch (DonorException donorException) {
			System.out.println("Invalid Data");
			System.err.println(donorException);
			System.exit(0);
		}
		return null;
	}
}
