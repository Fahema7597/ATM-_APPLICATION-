package dao;

import pojo.AtmUser;

public class ResetPasswordDAOImpl implements ResetPasswordDAO 
{

    boolean status;

	@Override
	public boolean checkID(AtmUser ref) {
		// TODO Auto-generated method stub

		//get Email value from AtmUser using getter method of that class and compare
		if(ref.getEmail().equals("opt@gmail.com"))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
	}

	@Override
	public boolean checkSecurity(AtmUser ref) {
		// TODO Auto-generated method stub
	
		//get color value from AtmUser using getter method of that class and compare
		if(ref.getColour().equals("black"))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}

	@Override
	public boolean checkPassword(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//get Password and rePassword value from AtmUser using getter method of that class and compare
		if(ref.getPassword().equals(ref.getRePassword()))
		{
			status = true;
		}
		else
			
		{
			status = false;
		}
		
		return status;
	}

	

}
