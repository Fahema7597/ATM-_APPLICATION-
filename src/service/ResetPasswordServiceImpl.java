package service;

import controller.ResetPasswordController;
import dao.ResetPasswordDAO;
import dao.ResetPasswordDAOImpl;
import main.Atm;
import pojo.AtmUser;

public class ResetPasswordServiceImpl implements ResetPasswordService 
{

	ResetPasswordDAO refResetPasswordDAO = new ResetPasswordDAOImpl(); //create an object of ResetPasswordDAOImpl and refer to its interface ResetPasswordDAO
	ResetPasswordController refResetPasswordController = new ResetPasswordController(); //create an object of ResetPasswordController class
	AtmUser refAtmUser = new AtmUser();  //create an object of AtmUser class - It is a POJO
	
	@Override
	public void verifyID(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//checks the boolean status returned from IDCheck method ResetPasswordDAOImpl class with if else loop
		if(refResetPasswordDAO.checkID(ref)==true)
		{
		
			refResetPasswordController.userInputSecurity();
		}
		else
		{
			System.out.println("Invalid userID !!");
			System.out.println();
			refResetPasswordController.userInputUserID();
		}
	}

	@Override
	public void verifySecurity(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//checks the boolean status returned from SecurityCheck method ResetPasswordDAOImpl class with if else loop
		if(refResetPasswordDAO.checkSecurity(ref)==true)
		{
			refResetPasswordController.userSetPassword();
		}
		else
		{
			System.out.println("Incorrect Security key !!");
			System.out.println();
			refResetPasswordController.userInputSecurity();   //calls userInputSecurity method of ResetPasswordController class
		}
		
		
	}

	@Override
	public void verifyPassword(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//checks the boolean status returned from passwordCheck method ResetPasswordDAOImpl class with if else loop
		if(refResetPasswordDAO.checkPassword(ref)==true)
		{
			
			refResetPasswordController.userInputSecurityKey();  //calls userInputSecurityKey method of ResetPasswordController class
		}
		else
		{
			System.out.println("Password does'nt match!!");
			System.out.println();
			refResetPasswordController.userRetypePassword();  //calls userRetypePassword method of ResetPasswordController class
		}
		
	}
	

}
