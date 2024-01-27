package StepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object.Choose_plan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Choose_Plan
{
	WebDriver driver;
	Choose_plan open;
	
	@Given("user lanch the url of Broccoli")
	public void user_lanch_the_url_of_broccoli() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://broccoly.onrender.com/");
	}

	@Given("click the dite plan butoon")
	public void click_the_dite_plan_butoon() {
		open=new Choose_plan (driver);
		open.ditemeals();
	}

	@Given("click the plan ditels button")
	public void click_the_plan_ditels_button()
	 {
		open.planditels();
	}

	@Given("click the chose meals button")
	public void click_the_chose_meals_button() {
		 open.choosemeals();
	}

//	@When("user click the oder thisb plan button")
//	public void click_the_oder_thisb_plan_button() {
//		 open.oderpan();
//	}
	@Given("click the oder plan button")
	public void click_the_oder_plan_button() 
	{
		 open.oderpan();
	}
	@When("enter tha all inputs")
	public void enter_tha_all_inputs() {
		open.input();
	}

	@When("click tthe submit button")
	public void click_tthe_submit_button() {
		open.input();
	}

	@Then("I validate windowes")
	public void i_validate_windowes() {
		 driver.getCurrentUrl();
	}
}
