package exception;

import java.util.Scanner;

public class MainDetail
{
	public static void main(String[] args)
	{
		String strFirstName = null;
		String strLastName = null;
		char gender = 'M';
		try
		{
			if(strFirstName==null && strLastName==null)
				throw new NameException("Invalid Name");
			else
				System.out.println(strFirstName+"\n"+strLastName+"\n"+gender);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
