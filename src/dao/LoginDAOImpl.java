package dao;

import pojo.AtmUser;

public class LoginDAOImpl implements LoginDAO 
{

	boolean status;

	@Override
	public boolean checkLogin(AtmUser ref){
		// TODO Auto-generated method stub
		

		//get the email from AtmUser using the getter method of that class and compare
		if(ref.getEmail().equals("opt@gmail.com") && ref.getPassword().equals("xyz123"))
		{
			status = true;
		}
		else
		{
			status= false;
		}
		return status;
		
		
		
	}
	
}

 