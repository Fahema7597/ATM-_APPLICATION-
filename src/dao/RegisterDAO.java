package dao;

import pojo.AtmUser;

public interface RegisterDAO 
{
    boolean checkEmail(AtmUser ref);  //checkEmail method declaration
	boolean checkPassword(AtmUser ref); //checkPassword method declaration

}
