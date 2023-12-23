package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturerHomePage 
{
	@FindBy(xpath = "//a[text()='Add Products']")
	private WebElement addProductLink;
	
	@FindBy(xpath = "//a[text()='Manage Stock']")
	private WebElement manageStockLink;
	
	@FindBy(xpath = "//input[@value='Log out']")
	private WebElement LogoutButton;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productLink;
	
	public ManufacturerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddProductLink() 
	{
		return addProductLink;
	}
	
	public WebElement getManageStockLink() 
	{
		return manageStockLink;
	}

	public WebElement getLogoutButton() 
	{
		return LogoutButton;
	}

	public void setLogoutButton(WebElement logoutButton) {
		LogoutButton = logoutButton;
	}
	
	

	public WebElement getProductLink() 
	{
		return productLink;
	}

	public void setProductLink(WebElement productLink) {
		this.productLink = productLink;
	}

	// Business Logic to click on addproductLink
	public void ClickOnaddProductLink()
	{
		addProductLink.click();
	}
	
	// Business Logic to click on managestock link
	public void ClickonmanageStockLink()
	{
		manageStockLink.click();
	}
	
	public void ClickOnLogoutButton()
	{
		LogoutButton.click();
	}
	
	

}
