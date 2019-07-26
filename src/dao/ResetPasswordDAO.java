package dao;

import pojo.AtmUser;

public interface ResetPasswordDAO
{

	boolean checkID(AtmUser ref);  //checkID method declaration
	boolean checkSecurity(AtmUser ref); //checkSecurity method declaration
	boolean checkPassword(AtmUser ref);   //checkPassword method declaration
	
	
}
