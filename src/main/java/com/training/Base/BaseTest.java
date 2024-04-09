package com.training.Base;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import net.bytebuddy.asm.Advice.Return;

	public class BaseTest {
	//write a method that will send the driver
		//if the driver==null only create an instance and return the driver
		//if you pass chromedriver it will create an instance of chrome and send as return value chrome
		////if you pass edgedriver it will create an instance of edge and send it as edge
		
		WebDriver driver;
		public WebDriver getDriver() {
			if(driver==null) {
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			}
			return driver;
		}
		
	}



