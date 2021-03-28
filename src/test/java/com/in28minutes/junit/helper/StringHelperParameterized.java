package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterized {
	
	private String input;
	private String expectedOutput;
	
	StringHelper helper = new StringHelper();

	public StringHelperParameterized(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}


	@Parameters
	public static Collection<String[]> testConditions() {
		 String expectedOutputs[][]= {
				 {"AACD","CD"},
				 {"ACD","CD"},
				 {"AABNHD","BNHD"}
		 }; 
		 
		 return Arrays.asList(expectedOutputs);		 
		 
	}
	
	
	@Test
	public void testTrunactaeInFirst2Positions_AInFirst1Positions() {

		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));

	}

}
