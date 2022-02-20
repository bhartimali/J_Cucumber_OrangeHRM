package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_LoginPage {

	WebDriver driver;

	public A_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='txtUsername']")public WebElement userName_txt;
	@FindBy(xpath = "//input[@id='txtPassword']")public WebElement password_txt;
	@FindBy(xpath = "//input[@id='btnLogin']")public WebElement login_btn;
	@FindBy(xpath = "//a[@id='welcome']")public WebElement welcome;
	@FindBy(xpath = "//a[@href='/index.php/auth/logout']")public WebElement logout;

	public void usernameMeth(String username) {
		userName_txt.sendKeys(username);
	}
	public void passwordMeth(String password) {
		password_txt.sendKeys(password);
	}
	public void loginBtnMeth() {
		login_btn.click();
	}

	public void logoutMeth() throws InterruptedException {
		Thread.sleep(2000);
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(2000);
	}
}
