package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

//Whenever the client code says UserManager.getInstance, in the first time, the JVM loads this class into memory and it will 
//execute the first statement and the instance will be created. This is a good way to create Singleton Patter

public class UserManager {
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();

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

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirsName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		return user;
	}
	public User[] getUser() {
		return dao.getUser();
	}
}
