package fr.dta.parent;

import org.junit.Test;

import fr.dta.commons.utils.MyStringUtils;
//import junit.framework.Assert;
import org.junit.Assert;

public class AppliWebTest {
	
	@Test
	public void testWithNull() {
		Assert.assertEquals(true, MyStringUtils.isNullOrEmpty(null));
		
	}
	@Test
	public void testWithSpace() {
		Assert.assertEquals(true, MyStringUtils.isNullOrEmpty(" "));
	}
	
	@Test
	public void testWithString() {
		Assert.assertEquals(false, MyStringUtils.isNullOrEmpty("  abcs "));
	}
	

}