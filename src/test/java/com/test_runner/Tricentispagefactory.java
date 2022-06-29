package com.test_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Tricentispagefactory {


	// pom with page factory 
        WebDriver driver;
		@FindBy(name="txtUsername")
		@CacheLookup
		WebElement username99;

		@FindBy(name="txtPassword")
		@CacheLookup
		WebElement password99;

		@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
		@CacheLookup
		WebElement loginButton;
		
		@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")
		@CacheLookup
		WebElement searchButton;
		
		@FindBy(id="small-searchterms")
		@CacheLookup
		WebElement searchTerms;
		
		public  Tricentispagefactory(WebDriver driver) {
			this.driver = driver;
			//PageFactory.initElements(driver, this);
			}

		public WebElement fieldUname(){
         return username99;
		}

		public void setUname(String uname)
		{
		this.username99.sendKeys("lokeshkumar221999@gmail.com");
		}

		public WebElement fieldPassword(){
		return password99;
		}

		public void setPassword(String password)
		{
		this.password99.sendKeys(password);
		}

		public WebElement loginField(){
		return loginButton;
		}

		public void clickLogin()
		{
		this.loginButton.click();
		}

		public WebElement fieldsearch(){
			return searchButton;
			}

			public void clickSearch()//clicking on search
			{
			this.searchButton.click();

			}
}