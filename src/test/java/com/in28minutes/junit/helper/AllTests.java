package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArraysCompareTest.class, PrimeNumberCheckerTest.class, QuickBeforeAfterTest.class,
		StringHelperParameterized.class, StringHelperTest.class })
public class AllTests {

}
