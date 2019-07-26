package service;

import controller.RegisterController;
import dao.RegisterDAO;
import dao.RegisterDAOImpl;
import main.Atm;
import pojo.AtmUser;

public class RegisterServiceImpl implements RegisterService 
{


	RegisterController refRegisterController = new RegisterController(); //create an object of RegisterController class
	RegisterDAO refRegisterDAO = new RegisterDAOImpl(); //create an object of RegisterDAOImpl and refer to its interface RegisterDAO
	AtmUser refAtmUser = new AtmUser();
	
	@Override
	public void verifyEmail(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//checks the boolean status returned from checkEmail method RegisterDAOImpl with if else loop
		 if(refRegisterDAO.checkEmail(ref)== true)
	      {
			 refRegisterController.userInputPassword();  //calls userInputPassword method of RegisterController class
			
		  }
		 else
		 {
			
			 System.out.println("Email exists already!!");
			 System.out.println();
			 refRegisterController.userInputRegister();  //calls userInputRegister method of RegisterController class
		 }
		
	}

	@Override
	public void verifyPassword(AtmUser ref) {
		// TODO Auto-generated method stub
		
		//checks the boolean status returned from checkPassword method of RegisterDAOImpl with if else loop
		if(refRegisterDAO.checkPassword(ref)==true)
		{
				refRegisterController.userInputSecurityKey();  //calls userInpuSecurityKey method of RegisterController class
		}
		else
		{
			System.out.println("Password does'nt match!!");
			System.out.println();
			refRegisterController.userInputReTypePassword();   //calls userInputReTypePassword method of RegisterController class
		}
	}

	@Override
	public void PrintSecurityKey(AtmUser ref) 
	
	//securityKey value from RegisterController class is passed and printed here
	{
		// TODO Auto-generated method stub
		System.out.println(ref.getColour()+ " " + "is your security key, if you forget your password" );
		
        System.out.println();
 		
 	    System.out.println("REGISTRATION SUCCESSFUL !!");
 		System.out.println();
		Atm.main(null);

   }
}

