package com.semanticsquare.thrillio.managers;

//Whenever the client code says UserManager.getInstance, in the first time, the JVM loads this class into memory and it will 
//execute the first statement and the instance will be created. This is a good way to create Singleton Patter

public class UserManager {
	private static UserManager instance = new UserManager();

	// creating a Singleton Pattern code
	// private constructor
	// so the clients cannot create instance freely the object UserManager
	private UserManager() {
	}

	// return type UserManager... Since one can not creat a instance of UserManager
	// the method need to be static
	public static UserManager getInstance() {
		return instance;
	}
}
