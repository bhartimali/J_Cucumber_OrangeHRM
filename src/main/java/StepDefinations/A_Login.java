package StepDefinations;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constant.constant;
import PageObject.A_LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class A_Login {
	
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", constant.chromePth);
		driver=new ChromeDriver();
		driver.get(constant.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	}
	
	@Given("^User is on the Login page$")
	public void user_is_on_the_login_page() {
		String actualTitle = driver.getTitle();
	    System.out.println("Title of the Login Page is:"+actualTitle);
	    String expectedTitle = "OrangeHRM";
	    Assert.assertEquals(actualTitle,expectedTitle);
	}
	@When("^User Enter the username and password$")
	public void user_enter_the_username_and_password(DataTable loginData) throws InterruptedException {
		for (Map<String, String> data : loginData.asMaps(String.class, String.class)) {
			
			A_LoginPage loginpage =new A_LoginPage(driver);
			loginpage.usernameMeth(data.get("username"));
			loginpage.passwordMeth(data.get("password"));
			loginpage.loginBtnMeth();
			loginpage.logoutMeth();
		}
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
