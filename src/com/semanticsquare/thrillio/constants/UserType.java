package com.semanticsquare.thrillio.constants;
/* Since is going to expose only constant, no instance variables or methods, only will be static & final fields - compile time constants
 * we do not need to create a instance of this class
 */
public class UserType {
	//private constructor
	private UserType() {}
	
	//final variables are All CAPS of coning convention. 
	public static final String USER = "user";
	public static final String EDITOR = "editor";
	public static final String CHIEFEDITOR= "chiefeditor";
	
	
}
