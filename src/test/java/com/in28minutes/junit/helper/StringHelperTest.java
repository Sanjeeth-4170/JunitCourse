package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testTrunactaeInFirst2Positions_AInFirst2Positions() {
		
		StringHelper helper = new StringHelper();
		assertEquals("CDBA", helper.truncateAInFirst2Positions("ACDBA"));
	}

	// The method should be always annotated with @Test
	// The method should always be public and return type should be void
	//assertEquals(Expected, Actual);
	//Package names in src/main/java and src/test/java should always be same class names should be different
	
	@Test
	public void testTrunactaeInFirst2Positions_AInFirst1Positions() {
		
		assertEquals("YUI", helper.truncateAInFirst2Positions("AAYUI"));

	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicScenario() {

		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABKLAB"));

	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicScenario1() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABKLACB"));

	}

}
