package service;

import java.util.Scanner;

import controller.LoginController;
import controller.RegisterController;
import dao.LoginDAO;
import dao.LoginDAOImpl;
import main.Atm;
import pojo.AtmUser;

public class LoginServiceImpl implements LoginService {


	LoginDAO refLoginDAO;  //LoginDAO is an interface
	LoginController refLoginController;  //LoginController is a class
	AtmUser refAtmUser;  //AtmUser is a POJO (Plain Old Java Object)
	RegisterController refRegisterController; //RegisterController is an class
	
	
	
	
	@Override
	public void verifyLogin(AtmUser ref) 
	{
		// TODO Auto-generated method stub
		
		refLoginDAO = new LoginDAOImpl();  //create an object of LoginDAOImpl class and refer to it's interface LoginDAO
		refLoginController = new LoginController(); //create an object of LoginController class
		
		
		//check the boolean status returned from checkLogin method of LoginDAOImpl class
		//if else loop
		if(refLoginDAO.checkLogin(ref)==true)
		{
			System.out.println("LOGIN SUCCESSFUL !!");
			System.out.println();
			bankTransaction();  //calls bankTransaction method of current class
		}
		else
		{
			System.out.println("NOT VALID !!");
			System.out.println();
			refLoginController.userInputLogin();  //calls userInputLogin method of LoginController class
			
		}
	}
	
	//declaration of balance and transaction
	int balance;
	int transaction;
	
	public void deposit(int amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;  //entered amount gets added to balance and stores in balance
			transaction = amount;        //entered amount is stored in transaction
			System.out.println(transaction + " " + "dollars deposited successfully !!" );
			System.out.println();
		}
	}
	
	public void withdraw(int amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;  //entered amount gets deducted from balance and stores the value in balance
			transaction = amount;   //deducted amount is stored in transaction with negative sign
			System.out.println(transaction + " " + "dollars withdrawn successfully!!");  //math.abs operation returns the absolute integer value
			System.out.println();
			
		}
		else
		{
			System.out.println("Insufficient balance !!");
			System.out.println();
			
		}
	
	
	}
	public void yesNoDecision()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Wish to continue ? (yes/no) ");
		String decision = sc.next();
		System.out.println();
		
		//if else condition
		if(decision.equalsIgnoreCase("yes"))
		{
			bankTransaction();    //calls bankTransaction method of current class
		}
		else if(decision.equalsIgnoreCase("no"))
		{
			System.out.println("THANKS FOR BANKING WITH US!!");
			System.out.println();
			Atm.main(null);  //calls main method of Atm class
		}
		else
		{
			System.out.println("Enter valid input");
			System.out.println();
			yesNoDecision();  //calls yesNoDecision method
		}
	}
	
	public void bankTransaction()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Type 1: Check available Balance");
		System.out.println("Type 2: Deposit Amount");
		System.out.println("Type 3: Withdraw Amount");
		System.out.println();
		int choice1;
	
		
		System.out.print("Enter your choice: ");
		choice1 = sc.nextInt();
		
		//switch case 
		switch(choice1)
		{
		case 1:
		{
			System.out.println("Balance: " +balance);
			System.out.println();
			yesNoDecision(); //calls yesNoDecision to print "wish to continue (yes/no)"
			break;
		}
		case 2:
		{
			refAtmUser = new AtmUser();
			
		    System.out.print("Enter amount to deposit: ");
		    int amount = sc.nextInt();
		    
			deposit(amount); //amount is passed to deposit method
			yesNoDecision(); //calls yesNoDecision
			break;
		}
		case 3:
		{

			refAtmUser = new AtmUser(); //create an object for AtmUser class
			
		    System.out.print("Enter amount to withdraw: ");
		
		    int amount1 = sc.nextInt();
	
		    
			withdraw(amount1); //amount is passed to withdraw method
			yesNoDecision(); //calls yesNoDecision
			break;
		}
		default:
		{
			System.out.println("INVALID CHOICE!!");
			yesNoDecision(); //call yesNoDecision
			break;
		}
		}
		
		
		
	}

	
	

	
	
	
}