package org.test.dataProvider;

	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.test.main.BaseClass;
	import org.test.pages.AdactinBookHotel;
	import org.test.pages.AdactinLogin;
	import org.test.pages.AdactinSearchHotel;
	import org.test.pages.AdactionPrintInvoice;
	import org.test.pages.SelectHotel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


	public class AdactinWithDataProvider extends BaseClass {
		BaseClass b;
		AdactinBookHotel ab;
		public static WebDriver driver;
		@BeforeClass
		public void browser()  {
                       getDriver();				 
                     launchUrl("http://adactinhotelapp.com/");	
                     }
		@Test(dataProvider="data1",dataProviderClass=DataProvider1.class)
		public void tc0(String s,String s1) {
			BaseClass b=new BaseClass();
			AdactinLogin login = new AdactinLogin();
			b.enterText(login.getTxtUSerNAme(), s);
			b.enterText(login.getTxtPass(), s1);
			buttonClick(login.getLogin());
			//b.screenShot("login");
		}
		@Test(dataProvider="data2",dataProviderClass=DataProvider1.class)
		public void tc1(String s,String s2,String s3,String s4,
				String s5,String s6,String s7,String s8) throws IOException{
			BaseClass b=new BaseClass();
			AdactinSearchHotel search=new AdactinSearchHotel();
			b.dropDownSingleselection(search.getLocation(), s);
			b.dropDownSingleselection(search.getHotel(), s2);
			b.dropDownSingleselection(search.getRoom_type(), s3);
			b.dropDownSingleselection(search.getRoom_nos(), s4);
			b.dropDownSingleselection(search.getAdult_room(), s7);
			b.dropDownSingleselection(search.getChild_room(), s8);
			b.enterText(search.getDatepick_in(),s5);
			b.enterText(search.getDatepick_out(),s6);
			b.buttonClick(search.getLogin());
			SelectHotel sh=new SelectHotel();
			b.buttonClick(sh.getRadioButton());
			b.buttonClick(sh.getContinue1());
			//b.screenShot("HotelBooking");

		}
		
			@Test(dataProvider="data3",dataProviderClass=DataProvider1.class)
			public void tc2(String s1,String s2,String s3,String s4,String s5,
					String s6,String s7,String s8) throws InterruptedException, IOException   {
			AdactinBookHotel ab=new AdactinBookHotel();
			BaseClass b=new BaseClass();
			b.enterText(ab.getFirst_name(),s1);
			b.enterText(ab.getLast_name(),s2);
			b.enterText(ab.getAddress(),s3);
			b.enterText(ab.getCc_num(),s4);
			b.dropDownSingleselection(ab.getCc_type(), s5);
			b.dropDownSingleselection(ab.getCc_exp_month(), s6);
			b.dropDownSingleselection(ab.getCc_exp_year(), s7);
			b.enterText(ab.getCc_cvv(),s8);
			b.buttonClick(ab.getBook_now());
		//	b.screenShot("Transaction");
		}
	        @Test()
	        public void tc3() throws IOException, InterruptedException {
	AdactionPrintInvoice print=new AdactionPrintInvoice();
	Thread.sleep(10000);
	BaseClass b=new BaseClass();
	String attribute = b.getAttribute(print.getOrder_no(),"value");
	System.out.println(attribute);
	b.screenShot("Booking number");
	b.WriteExcel("C:\\\\Users\\\\leo\\\\eclipse-workspace\\\\MavenMain1\\\\ExcelRead\\\\Book2.xlsx", "Sheet2", 8, 7, attribute);
	        }
	}

