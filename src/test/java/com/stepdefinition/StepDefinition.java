package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("user is in demo automation testing site")
	public void user_is_in_demo_automation_testing_site() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raja\\eclipse-workspace\\DemoAutomation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}

	@When("user enter the details{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_details(String fname, String lname, String adrs, String mail, String phone, String pass,
			String cpass) throws InterruptedException {

		WebElement fstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fstname.sendKeys(fname);
		WebElement lstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lstname.sendKeys(lname);
		WebElement adr = driver
				.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		adr.sendKeys(adrs);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(mail);
		WebElement phoneno = driver.findElement(By.xpath("//input[@type='tel']"));
		phoneno.sendKeys(phone);
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		WebElement hobi = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		hobi.click();

		WebElement skl = driver.findElement(By.id("Skills"));
		Select dd = new Select(skl);
		dd.selectByValue("Android");

		WebElement cntry = driver.findElement(By.id("countries"));
		Select dd1 = new Select(cntry);
		dd1.selectByVisibleText("India");

		WebElement cntry1 = driver
				.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		cntry1.click();
		WebElement ind = driver.findElement(By.xpath("(//li[@class='select2-results__option'])[5]"));
		ind.click();
		WebElement year = driver.findElement(By.id("yearbox"));
		Select yr = new Select(year);
		yr.selectByValue("1996");
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select mnt = new Select(month);
		mnt.selectByValue("February");
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select d = new Select(day);
		d.selectByValue("25");
		WebElement fpassword = driver.findElement(By.id("firstpassword"));
		fpassword.sendKeys(pass);
		WebElement spassword = driver.findElement(By.id("secondpassword"));
		spassword.sendKeys(cpass);
		
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		Thread.sleep(5000);
		WebElement lang1 = driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]"));
		lang1.click();
		WebElement lang2 = driver.findElement(By.xpath("//label[text()='Languages']"));
		lang2.click();

	}

	@Then("Register successfully or not")
	public void register_successfully_or_not() {

	}

}
