package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;

public class DataStore {
	private static final int USER_BOOKMARK_LIMIT = 5;

	private static final int BOOKMARK_COUNT_PER_TYPE = 5;

	private static final int BOOKMARK_TYPES_COUNT = 3;

	private static final int TOTAL_USER_COUNT = 5;

	private static User[] users = new User[TOTAL_USER_COUNT];

	// bookmark need to be two dimension because one is for type and other for
	// actual bookmark
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
	
	// is five users and each user can only bookmark 5 of them
	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
	
	public static void loadData() {
		loadUsers();
	}
	
	private static void loadUsers() {
	//	users[0] = UserManager.getInstance().createUser() 1000	user0@semanticsquare.com	test	John	M	m	user
	}

}
