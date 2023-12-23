package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage 
{
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productLink;
	
	@FindBy(xpath = "//a[text()='Add Retailers']")
	private WebElement addRetailer;
	
	@FindBy(xpath = "//a[text()='Retailers']")
	private WebElement ReatilersLink;
	
	
	
	public AdminHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductLink() 
	{
		return productLink;
	}
	
	public WebElement getaddRetailer()
	{
		return addRetailer;
	}
	public WebElement getReatilersLink()
	{
		return ReatilersLink;
	}
	
	
	// Business logic
	public void ClickOnproductLink()
	{
		productLink.click();
	}
	
	
	

}
