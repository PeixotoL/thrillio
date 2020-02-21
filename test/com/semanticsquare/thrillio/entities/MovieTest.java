package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		// test 1: Movie is Horror -- false

		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);

		boolean isKidFriendlyEligeble = movie.isKidFriendlyEligible();

		assertFalse("For Horro Genre - isKidFriendlyEligible() must return false", isKidFriendlyEligeble);
		// Test 2: Movie is Thriller -- False

		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);

		isKidFriendlyEligeble = movie.isKidFriendlyEligible();

		assertFalse("For Thriler Genre - isKidFriendlyEligible() must return false", isKidFriendlyEligeble);

		// Test 2: Movie is not Horror or Thriller -- True
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.CLASSICS,
				8.5);

		isKidFriendlyEligeble = movie.isKidFriendlyEligible();

		assertTrue("For Horro Genre - isKidFriendlyEligible() must return true", isKidFriendlyEligeble);
	}

}
