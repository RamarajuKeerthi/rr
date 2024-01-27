package Page_Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Vamsi.Javasciptcxecuter;

public class Choose_plan 
{
	WebDriver driver;
	
	@FindBy(xpath ="(//*[@class='nav-link text-dark listitems'])[1]")
	WebElement ditemeals;
	@FindBy(xpath ="(//button[@class='w-100 dietbutton'])[2]")
	WebElement planditels;
	@FindBy(linkText  ="Plan details")
	WebElement planditels1;
	@FindBy(xpath ="(//*[@class='vegchoose w-100'])[1]")
	WebElement choosemeala;
	@FindBy(xpath   = "(//*[@class='w-100 dietbutton'])[2]")
	WebElement oderthisplan;
	@FindBy(xpath ="(//*[@class='col-lg-2 col-md-2 col-sm-12'])[1]")
	WebElement name;
	@FindBy(xpath ="(//*[@class='form-control'])[1]")
	WebElement fname;
	@FindBy(xpath ="(//*[@class='form-control'])[2]")
	WebElement lname;
	@FindBy(xpath ="(//*[@class='form-control'])[3]")
	WebElement emaill;
	@FindBy(xpath ="(//*[@class='form-control'])[4]")
	WebElement password;
	@FindBy(xpath ="//*[@class='orderbtn']")
	WebElement submit;
	public   Choose_plan(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ditemeals() 
	{
		//ditemeals.click();
		
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement r=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("planditels()")));
		 r.click();
		
	}
	public void planditels() 
	{
		//planditels.click();
		//Javasciptcxecuter.jse(driver, planditels1);
		JavascriptExecutor s = (JavascriptExecutor)driver;
        s.executeScript("arguments[0].click();", planditels);
	}
	public void choosemeals()
	{
		choosemeala.click();
	}
	public void oderpan() 
	{
		oderthisplan.click();
	}
	public void i() 
	{
	  Select r = new Select(name);	
	   r.selectByVisibleText("Mr");
	  fname.sendKeys("ram");
	  lname.sendKeys("raj");
	  emaill.sendKeys("rr@gmail.com");
	  password.sendKeys("rr");
	}
	public void input() 
	{
		submit.submit();
		driver.getTitle();
	}
}
