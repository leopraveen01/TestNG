package org.test.groupconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.test.main.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;	

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalleTestLevel extends BaseClass{
	
	public static WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void tc0(String sw) {
		if(sw.equals("Chrome"))
		{
WebDriverManager.firefoxdriver().setup();
driver=new FirefoxDriver();
	}
	else if(sw.equals("ff")){
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();

	}
	else if(sw.equals("Edge")) {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();

	}
		
}
	@Test
	private void tc1() {
		driver.get("https://www.facebook.com/");	
		driver.quit();

		
	}
	
	}
