package StepDefinations;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C_PIM {

	/*WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	}
	
	@Given("^User is on the login Page$")
	public void user_is_on_the_login_page() {
		String actualTitle = driver.getTitle();
	    System.out.println("Title of the Login Page is:"+actualTitle);
	    String expectedTitle = "OrangeHRM";
	    Assert.assertEquals(actualTitle,expectedTitle);
	}
	@When("^User enter the \"(.*)\" and \"(.*)\"$")
	public void user_enter_the_username_and_password(String uname, String upass) {
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(upass);
		
	}
	@Then("^User click on the login button$")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	@Then("^User is on the dashbord$")
	public void user_is_on_the_dashbord() {
		 String title = driver.findElement(By.xpath("//b[text()='Dashboard']")).getText();
		  Assert.assertEquals(title,"Dashboard");
	}
	@Then("^User click on the PIM menu$")
	public void user_click_on_the_pim_menu() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}
	
	@Then("^User Enter the \"(.*)\" and \"(.*)\"$")
	public void user_enter_the_empName_and_Id(String empName, String empId) {
			driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(empName);
			driver.findElement(By.name("empsearch[id]")).sendKeys(empId);
	}
	@Then("^User click on the search button$")
	public void user_click_on_the_search_button() {
	    driver.findElement(By.id("searchBtn")).click();
	}
	@Then("^User checked on the checkbox$")
	public void user_checked_on_the_checkbox() {
	   driver.findElement(By.id("ohrmList_chkSelectRecord_54")).click();
	}
	@Then("^User click on the delete button$")
	public void user_click_on_the_delete_button() throws InterruptedException {
	    driver.findElement(By.id("btnDelete")).click();
	    Thread.sleep(2000);
	}
	@Then("^User click on the conform button$")
	public void user_click_on_the_conform_button() {
	    driver.findElement(By.id("dialogDeleteBtn")).click();
	}
	@Then("^User logout from the apllication$")
	public void user_logout_from_the_apllication() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	}
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}*/
}
