package org.test.groupconcept;

import org.testng.annotations.Test;

public class Sample {
@Test(groups="@smoke")
private void tc0() {
System.out.println("method1");
}
@Test(groups="@sanity")
private void tc1() {
System.out.println("method2");
}
@Test(groups="@reg")
private void tc2() {
System.out.println("method3");
}
@Test(groups="@sanity")
private void tc3() {
System.out.println("method4");
}
@Test
private void tc4() {
System.out.println("meth");
}
}
