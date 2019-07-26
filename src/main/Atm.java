package main;

import java.util.Scanner;

import controller.LoginController;
import controller.RegisterController;
import controller.ResetPasswordController;

public class Atm {


	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
     RegisterController refRegisterController = new RegisterController();        //Create object for RegisterController Class
     LoginController refLoginController = new LoginController();                 //Create object for LoginController class
     ResetPasswordController refResetPasswordController = new ResetPasswordController(); //Create object for ResetPasswordController class
		
   	 
   	 System.out.println("USER HOME PAGE");
   	 System.out.println();	 
   	 System.out.println("1. REGISTER");                      
   	 System.out.println("2. LOGIN");
   	 System.out.println("3. FORGET PASSWORD");
   	 System.out.println("4. LOGOUT");
   	 System.out.println();
   	
   	 System.out.print("Enter your choice: ");
     int choice = sc.nextInt();
     System.out.println();
        

       
        
   	 switch(choice)                   //Switch case
   	 {
   	 
   	 case 1:
   	 {
   		refRegisterController.userInputRegister();   //calls userInputRegister method of RegisterController class with the object created for that class
   		break;
   	 }
   	  case 2:
   	 {
   		
	   refLoginController.userInputLogin();      //calls userInputLogin method of LoginController class with the object created for that class
   		break;
   	 }
   	 
   	 case 3:
   	 {
   		 refResetPasswordController.userInputUserID();   //calls userInputUserID method of ResetPasswordController class with the object created for that class
   		 break;
   	 }
  
   	 case 4:
   	 {
   		System.out.println("LOGOUT SUCCESSFULLY");
   		 break;
   	 }
   	 default:
   	 {
   		 System.out.println("Invalid choice !!");
   		 break;
   	 }
   	 
   	 
   	 
   	 }
      }
}