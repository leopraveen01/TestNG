package org.test.dataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
//     @DataProvider(name="data")
//	public Object[][]  getData() {
//    return new Object[][] {{"leo","praveen"}};
//	}
     
    @DataProvider(name="data1")
    public Object[][] getdata1() {
		return new Object [][] {{"leopraveen01","bo9597894811"}};

	}
    @DataProvider(name="data2")
    public Object[][] getdata2() {
		return new Object [][] {{"Paris","Hotel Cornice","Super Deluxe","5 - Five",
			"23/03/2014","28/03/2014","4 - Four","3 - Three"}};
	}
    @DataProvider(name="data3")
    public Object[][] getdata3() {
		return new Object [][] {{"Praveen","leo","madurai road","4598 7896 7856 9654",
			"American Express","February","2012","007"}};
	}


}
