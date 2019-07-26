package service;

import pojo.AtmUser;

public interface ResetPasswordService 
{

	void verifyID(AtmUser ref);  //declaration of IDVerify method

	void verifySecurity(AtmUser ref); //declaration of SecurityVerify method

	void verifyPassword(AtmUser ref); //declaration of passwordVerify method

 
	
}
