package com.string.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.string.StringProblem;

/**
 * @author Geetha Gowda
 * @date 04/29/2017
 */
public class StringProblemTest {
	@Test (dataProvider = "positiveTestData")
	public void testPositiveRemoveChar(String str, char charToRemove,
	                           String expected) throws Exception {

		Assert.assertEquals(StringProblem.removeChar(str, charToRemove), expected);
	}

	@Test (dataProvider = "positiveTestData")
	public void testPositiveRemoveCharOneLine(String str, char charToRemove,
	                                  String expected) throws Exception {
		Assert.assertEquals(StringProblem.removeCharOneLine(str, charToRemove), expected);
	}

	@Test (dataProvider = "NegativeTestData")
	public void testNegativeRemoveChar(String str, char charToRemove,
	                           String expected) throws Exception {

		Assert.assertNotEquals(StringProblem.removeChar(str, charToRemove), expected);
	}

	@Test (dataProvider = "NegativeTestData")
	public void testNegativeRemoveCharOneLine(String str, char charToRemove,
	                                  String expected) throws Exception {
		Assert.assertNotEquals(StringProblem.removeCharOneLine(str, charToRemove), expected);
	}
	@DataProvider(name="positiveTestData")
	public Object[][] dataProviderPostive (){
		return new Object[][] {
				{ "coding", 'n', "codig" },
				{ "calvin klein design dress calvin klein", ' ', "calvinkleindesigndresscalvinklein" },
				{ "xyzxyz", 'x', "yzyz" },
				{ null, 'x', null },
				{ "", 'x', "" },
		};
	}
	
	@DataProvider(name="NegativeTestData")
	public Object[][] dataProviderNegative (){
		return new Object[][] {
				{ "coding", 'n', "coding" },
				{ "calvin klein design dress calvin klein", ' ', "calvinkleindesigndresscalvinklein  " },
				{ "trigger", 'g', "triger" },
				{ "", 'x', "x" },
				{ "", 'x', "xyz" },
		};
	}
}