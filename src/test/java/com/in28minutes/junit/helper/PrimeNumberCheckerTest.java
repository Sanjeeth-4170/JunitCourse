package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
 
//import org.junit.Test;
//import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
   private Integer inputNumber;
   private Boolean expectedResult;
  

   
 private PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
   
   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
	
   public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, true },
         { 6, false },
         { 19, true },
         { 22, false },
         { 23, true },
         { 11, true }
      });
   }

   // This test will run 5 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expectedResult, 
      primeNumberChecker.validate(inputNumber));
   }
}
