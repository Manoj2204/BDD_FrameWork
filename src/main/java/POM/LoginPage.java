package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class LoginPage 
{
	// Delreare WebElement
	@FindBy(id ="login:username")
	private WebElement Username;
	
	@FindBy(id ="login:password")
	private WebElement Password;
	
	@FindBy(id ="login:type")
	private WebElement logintypeDropdown;
	
	@FindBy(css = "input[type='submit']")
	private WebElement SubmitButton;
	
	
	// Initializion of WebElement
	public LoginPage(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);	
	}
    
	// Utiliation of WebElement
	public WebElement getUsername() 
	{
		return Username;
	}

	public WebElement getPassword() 
	{
		return Password;
	}

	public WebElement getLogintypeDropdown() 
	{
		return logintypeDropdown;
	}

	public WebElement getSubmitButton() 
	{
		return SubmitButton;
	}
	
	// Business logics to enter username and password
	public void EnterUsernameAndPassword(String username,String password)
	{
		Username.sendKeys(username);
		Password.sendKeys(password);		
	}
	
	//Business Logic for Selcet the LoginType
	public void EnterLoginType(String logintype)
	{
		Select select = new Select(logintypeDropdown);
		select.selectByVisibleText(logintype);
		//dropdownSelectByVisibleText(logintypeDropdown, logintype);
		//logintypeDropdown.sendKeys(logintype);
	}
	// Business Logic for click on loginbutton
	public void ClickOnLoginButton()
	{
		SubmitButton.click();
	}
	
	
	

}
