package service;

import pojo.AtmUser;

public interface RegisterService {


	void verifyEmail(AtmUser ref); //declaration of verifyEmail method

	void verifyPassword(AtmUser ref); //declaration of verifyPassword method
	
	void PrintSecurityKey(AtmUser ref); //declaration of printSecurityKey method

}

