package org.test.groupconcept;

import org.testng.annotations.Test;

public class parallelMethodLevel {
	@Test(groups="@smoke")
	private void tc0() {
System.out.println("method1");
System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups="@smoke")
	private void tc1() {
		System.out.println("method2");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(groups="@reg")
	private void tc2() {
		System.out.println("method3");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc3() {
		System.out.println("method4");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc4() {
		System.out.println("method5");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc5() {
		System.out.println("method6");
		System.out.println(Thread.currentThread().getId());

	}

}
