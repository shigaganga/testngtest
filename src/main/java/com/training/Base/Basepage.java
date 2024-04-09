package com.training.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
}