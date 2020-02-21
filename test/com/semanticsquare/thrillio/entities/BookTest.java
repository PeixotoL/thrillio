package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsKidFriendlyEligible() {
		// Test 1: is book Philosophy - false

		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", "", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);

		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();

		assertFalse("For Philosophy Book - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		// Test 2 : is book self-help - false

		book = BookmarkManager.getInstance().createBook(4000, "Walden", "", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);

		isKidFriendlyEligible = book.isKidFriendlyEligible();

		assertFalse("For Self-help Book - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		// Test 3: if is not Philosophy nor self-help - true

		book = BookmarkManager.getInstance().createBook(4004, "Effective Java Programming Language Guide", "", 2007,
				"Prentice Hall", new String[] { "Joshua Bloch" }, BookGenre.TECHNICAL, 4.9);

		isKidFriendlyEligible = book.isKidFriendlyEligible();

		assertTrue("For Book other than Philosophy & Self Help- isKidFriendlyEligible() must return True", isKidFriendlyEligible);

	}

}
