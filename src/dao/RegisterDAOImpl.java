package dao;

import pojo.AtmUser;

public class RegisterDAOImpl implements RegisterDAO 
{
    boolean status;
	
	@Override
	public boolean checkEmail(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//get Email value from AtmUser using getter method of that class and check
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
	public boolean checkPassword(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//get password and rePassword value from AtumUser class using getter method and check 
		if(ref.getPassword().equals(ref.getRePassword()))
		{
			status = true;
		}
		else
		{
			status =false;
		}
		
		return status;
	}
}
