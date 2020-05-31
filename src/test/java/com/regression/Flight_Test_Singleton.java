package com.regression;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.util.BaseTest;

public class Flight_Test_Singleton extends BaseTest {

	@Test
	public void h() {
		System.out.println("This is the third test case");
		throw new SkipException("This is the exception");
	}

}
