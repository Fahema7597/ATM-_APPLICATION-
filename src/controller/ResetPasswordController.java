package controller;

import java.util.Scanner;

import main.Atm;
import pojo.AtmUser;
import service.ResetPasswordService;
import service.ResetPasswordServiceImpl;

public class ResetPasswordController {

	
	static AtmUser refAtmUser;   //AtmUser is POJO
	static ResetPasswordService refResetPasswordService; //ResetPasswordService is an interface

	public void userInputUserID() 
	{
		// TODO Auto-generated method stub
		
		refResetPasswordService = new ResetPasswordServiceImpl();  //create an object of ResetPasswordServiceImpl and refer to it's interface ResetpasswordService
		refAtmUser =  new AtmUser();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your userID: ");
		String email = sc.next();
		refAtmUser.setEmail(email);   //set email value to setter method of AtmUser class
		
		refResetPasswordService.verifyID(refAtmUser);  //pass reference of email to verifyID method of ResetPasswordServiceImpl class
		
	
		
	}
	
	public void userInputSecurity()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Security key: ");
		String colour = sc.next();
		refAtmUser.setColour(colour);  //set color value to the setter method of AtmUser class
		
		
		refResetPasswordService.verifySecurity(refAtmUser);  //pass reference of color to verifySecurity method of ResetPasswordServiceImpl class
		System.out.println();
		
		
	
		
	}
	
	public void userSetPassword()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter new password: ");
		String password = sc.next();
		refAtmUser.setPassword(password); //set password value to the setter method of AtmUser class
	
		
		userRetypePassword(); //call userRetypePassword method
	
	}
	
	public void userRetypePassword()
	{
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Re-type password: ");
		String rePassword = sc.next();
		refAtmUser.setRePassword(rePassword);   //set rePassword value to the setter method of AtmUser class
	
        
        refResetPasswordService.verifyPassword(refAtmUser);  //pass reference of rePassword to verifyPassword method of ResetPasswordServiceImpl class
        
	}
	
	public void userInputSecurityKey()
	{
      
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your favourite colour ? ");
 		String colour = sc.next();
 		refAtmUser.setColour(colour);  //set color value to the setter method of AtmUser class
 		System.out.println(refAtmUser.getColour()+ " " + "is your security key, if you forget your password" );
 		
        System.out.println();
  		
  	    System.out.println("PASSWORD HAS BEEN RESET SUCCESSFULLY !!");
  		System.out.println();
 		Atm.main(null);   //calls main method of Atm class
 		
	}

	}

	

