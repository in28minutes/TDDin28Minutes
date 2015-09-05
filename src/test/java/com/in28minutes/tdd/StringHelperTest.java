package com.in28minutes.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper = new StringHelper();

	// ""=>false,

	@Test
	public void testAreFirstAndLastTwoCharsTheSame_EmptyCondition() {
		assertFalse(stringHelper.areFirstAndLastTwoCharsTheSame(""));
	}

	@Test
	public void testAreFirstAndLastTwoCharsTheSame_StringWith1Char() {
		assertFalse(stringHelper.areFirstAndLastTwoCharsTheSame("A"));
	}

	@Test
	public void testAreFirstAndLastTwoCharsTheSame_TwoChars() {
		assertTrue(stringHelper.areFirstAndLastTwoCharsTheSame("AB"));
	}

	// "A"=>false,"AB"=>true,"ABC"=>false,"AAA"=>true,"ABCAB"=>true,
	// "ABCDEBA"=>false
	@Test
	public void testAreFirstAndLastTwoCharsTheSame_ThreeChars() {
		assertEquals(false, stringHelper.areFirstAndLastTwoCharsTheSame("ABC"));
		assertEquals(true, stringHelper.areFirstAndLastTwoCharsTheSame("AAA"));
		assertEquals(true, stringHelper.areFirstAndLastTwoCharsTheSame("ABCAB"));
		assertEquals(false,
				stringHelper.areFirstAndLastTwoCharsTheSame("ABCDEBA"));
	}
}
