package controller;

import java.util.Scanner;

import pojo.AtmUser;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {


	AtmUser refAtmUser;            //AtmUser is a POJO (Plain Old Java Object)
	LoginService refLoginService;  //LoginService is an interface

	public void userInputLogin()

	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		refAtmUser = new AtmUser();  //Create object for AtmUser class
		refLoginService  = new LoginServiceImpl();   //Create object for LoginServiceImpl class and refer to it's interface LoginService
	
		System.out.print("Enter UserID : ");
		String email = sc.next();
		refAtmUser.setEmail(email);      //set email value to setter method of AtmUser class
		
		System.out.print("Enter password: ");
		String password = sc.next();
		refAtmUser.setPassword(password);  //set password value to setter method of AtmUser class
		
	 
		System.out.println();

		refLoginService.verifyLogin(refAtmUser);   //pass the reference as parameter to verifyLogin method 

	}
	
	
	
}