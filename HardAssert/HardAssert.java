package org.test.testng.assert1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void tc0(){
String s="abcdef";
Assert.assertEquals(s,"abcdef");
System.out.println("assert fail");
	}
	@Test
	public void tc2(){
System.out.println("tc fail due to Assert condition");
	}

}
