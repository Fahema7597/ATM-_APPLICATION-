package controller;

import java.util.Scanner;

import pojo.AtmUser;
import service.LoginService;
import service.RegisterService;
import service.RegisterServiceImpl;

public class RegisterController {


	 Scanner sc = new Scanner(System.in);
	 static RegisterService refRegisterService;  //RegisterService is an interface
	 static AtmUser refAtmUser;                  //AtmUser is a POJO (Plain Old Java Object)
	 static LoginService refLoginService;        //LoginService is an interface
	
	 public void userInputRegister()
	 {
		 userInputEmail();       //calls email method
	 }
	public void userInputEmail()
	{
		refRegisterService = new RegisterServiceImpl();  //create an object for RegisterServiceImpl class and refer to it's interface
		refAtmUser = new AtmUser();     //create object for AtmUser class
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter email address: ");
		String email = sc.next();
		refAtmUser.setEmail(email);    //set email value to the setter method of AtmUser class
	
		
        refRegisterService.verifyEmail(refAtmUser);  //pass reference of the email to the verifyEmail method of RegisterServiceImpl class
        System.out.println();
		
	}
	public void userInputPassword()
	{
		
		System.out.print("Enter Password: ");
		final String password = sc.next();
		refAtmUser.setPassword(password);   //Set password to the setter method of AtmUser class
		
		userInputReTypePassword();   //calls userInputReTypePassword method
	}	
	
	
	
	public void userInputReTypePassword()
	{

		Scanner sc = new Scanner(System.in);
	
		
	    System.out.print("Re-type password: ");
		
	    String rePassword = sc.next();
		refAtmUser.setRePassword(rePassword);  //set rePassword(re-entered password) to the setter method of AtmUser class
	
        
        refRegisterService.verifyPassword(refAtmUser);  //pass reference of rePassword to the the verifyPassword method in registerServiceImpl class
 		
    }

	public void userInputSecurityKey()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your favourite COLOUR ? ");
 		String colour = sc.next();
 		refAtmUser.setColour(colour);   //set color to setter method of AtmUser class
 		
 		refRegisterService.PrintSecurityKey(refAtmUser);  //pass reference of color to printSecurityKey of RegisterService class
	}
}

