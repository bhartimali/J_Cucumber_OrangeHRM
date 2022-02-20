package StepDefinations;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B_Admin {

	/*WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	}
	
	@Given("^User on the login page$")
	public void user_on_the_login_page() {
		String actualTitle = driver.getTitle();
	    System.out.println("Title of the Login Page is:"+actualTitle);
	    String expectedTitle = "OrangeHRM";
	    Assert.assertEquals(actualTitle,expectedTitle);
	}
	@When("^User Enter username and password$")
	public void user_enter_username_and_password(DataTable loginData) {
		for (Map<String, String> data : loginData.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(data.get("password"));
		}
	}
	@Then("^User click on the login button$")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	@Then("^User is on the home page$")
	public void user_is_on_the_home_page() {
	   String title = driver.findElement(By.xpath("//b[text()='Dashboard']")).getText();
	   Assert.assertEquals(title,"Dashboard");
	}
	
	@Then("^User click on the admin menu$")
	public void user_click_on_the_admin_menu() {
	   driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	@Then("^User fill up the search from$")
	public void user_fill_the_search_from(DataTable searchData) {
		for (Map<String, String> sdata : searchData.asMaps(String.class, String.class)) {
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys(sdata.get("SearchUsername"));
			driver.findElement(By.id("searchSystemUser_userType")).sendKeys(sdata.get("userRole"));
		}
	}
	@Then("^click on the search button$")
	public void click_on_the_search_button() {
	    driver.findElement(By.id("searchBtn")).click();
	}
	@Then("^click on the admin name in the table$")
	public void click_on_the_admin_name_in_the_table() {
		driver.findElement(By.linkText("Jenny")).click();
	}
	
	@Then("^user click on the edit button$")
	public void user_click_on_the_edit_button() {
	    driver.findElement(By.id("btnSave")).click();
	}
	@Then("^user edit the emloyeeName$")
	public void user_edit_the_emloyeename(DataTable editData) {
		for(Map<String, String>Edata:editData.asMaps(String.class,String.class)) {
			 WebElement editName = driver.findElement(By.name("systemUser[employeeName][empName]"));
			 editName.clear();
			 editName.sendKeys(Edata.get("emloyeeName"));
		}
	}
	@Then("^user click on the save button$")
	public void user_click_on_the_save_button() {
		driver.findElement(By.id("btnSave")).click();
	}
	
	@Then("user click on the add button")
	public void user_click_on_the_add_button() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(By.id("btnAdd")).click();
	}
	@Then("User fill up the form")
	public void user_fill_up_the_form(DataTable addUser) {
		for(Map<String, String>AData:addUser.asMaps(String.class, String.class)) {
	   driver.findElement(By.name("systemUser[userType]")).sendKeys(AData.get("User Role"));
	   driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys(AData.get("Employee Name"));
	   driver.findElement(By.name("systemUser[userName]")).sendKeys(AData.get("Username"));
	   driver.findElement(By.name("systemUser[status]")).sendKeys(AData.get("Status"));
	  WebElement pass =  driver.findElement(By.name("systemUser[password]"));
	  pass.sendKeys(AData.get("Password"));
	  pass.sendKeys(Keys.TAB);
	  driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys(AData.get("Confirm Password"));
		} 
	}
	@Then("user Click on the Editsave button")
	public void user_click_on_the_Editsave_button() {
		driver.findElement(By.id("btnSave")).click();
	}
	
	@Then("Select the checkbox from the table")
	public void select_the_checkbox_from_the_table() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_83']")).click();
	    Thread.sleep(2000);
	}
	@Then("user clcik on the delete button")
	public void user_clcik_on_the_delete_button() throws InterruptedException {
	   driver.findElement(By.id("btnDelete")).click();
	   Thread.sleep(2000);
	}
	@Then("user click on the conform button")
	public void user_click_on_the_conform_button() {
		 driver.findElement(By.id("dialogDeleteBtn")).click();
	}
	
	
	@Then("^User click on the Logout from the application$")
	public void user_click_on_the_logout_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}*/

}
