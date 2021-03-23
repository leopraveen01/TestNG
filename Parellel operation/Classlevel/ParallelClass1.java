package org.test.groupconcept;

import org.testng.annotations.Test;

public class ParallelClass1 {
	@Test(groups="@smoke")
	public void tc0() {
System.out.println("method0  class1");
}
}
