package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junit=new jUnitFunction();
		String result=junit.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
