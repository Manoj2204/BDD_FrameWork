package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import POM.AdminHomePage;
import POM.LoginPage;
import POM.ManufacturerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def2 
{
	public WebDriver driver;
	public LoginPage login;
	public AdminHomePage adminpage;
	public ManufacturerHomePage manufacturerPage;
	@Given("user launch the browser")
	public void User_launch_the_browser() 
	{
	    driver =new ChromeDriver();
	    login = new LoginPage(driver);
	    adminpage= new AdminHomePage(driver);
	    manufacturerPage =new ManufacturerHomePage(driver); 
		
	}

	@When("user enter the url {string}")
	public void user_enter_the_url(String url) 
	{
         driver.get(url);
         driver.manage().window().maximize();

	}

	@When("user enter the username as {string} and passwaord as {string}")
	public void user_enter_the_username_as_and_passwaord_as(String username, String password) 
	{
	    login.EnterUsernameAndPassword(username, password);
		
	}

	@When("select and click on loginType as {string}")
	public void select_and_click_on_login_type_as(String loginType) 
	{
	    login.EnterLoginType(loginType);
		
	}
	
	@When("click on login button")
	public void click_on_login_button() 
	{
	    login.ClickOnLoginButton();
		
	}

	@Then("Admin home page will be displayed")
	public void admin_home_page_will_be_displayed() 
	{
		String actualtitle = driver.getTitle();
		String expectedtitle="Admin: Home";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Homepage is displayed... and its verified with title");
	}

	@When("click on add retailer link")
	public void click_on_add_retailer_link() 
	{
		//adminpage.getReatilersLink();
		driver.findElement(By.xpath("//a[text()='Add Retailers']")).click();
	}

	@Then("add retailer page should be displayed")
	public void add_retailer_page_should_be_displayed() 
	{
		String addproductactualtitle = driver.getTitle();
		String addproductexpectedtitle="Add Retailer";
		Assert.assertEquals(addproductactualtitle, addproductexpectedtitle);
		
		System.out.println("AddRetailer is displayed... and its verified with title");
	}

	@Then("click on logout button")
	public void click_on_logout_button() 
	{
		manufacturerPage.ClickOnLogoutButton();
		
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() 
	{
		String actualloginpageTitle = driver.getTitle();
		String ExpectedLoginpageTitle = "";
		Assert.assertEquals(actualloginpageTitle, ExpectedLoginpageTitle);
		System.out.println("Login page is displayed and its verified with title");
	     
	}
	
	@Then("close the browser")
	public void close_the_browser() 
	{
	    driver.quit();
	}

}
