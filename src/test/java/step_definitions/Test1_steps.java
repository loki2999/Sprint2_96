package step_definitions;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.test_runner.Orangehrmpagefactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Test1_steps {
	private WebDriver driver;
	private Orangehrmpagefactory orange;
	XSSFWorkbook wb;
    XSSFSheet sh;


@Before
public void openBrowser() throws Exception{
	//launching web browser....
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	orange=new Orangehrmpagefactory(driver);
	driver.manage().window().maximize();
	
	//using pagefactory file as reference....
	orange=PageFactory.initElements(driver, Orangehrmpagefactory .class);
	
	//reading file from excel....
	FileInputStream fread=new FileInputStream("./exceldata/orangehrm_cucumber.xlsx");
	wb=new XSSFWorkbook(fread);
}


@Then("Alert email should not be empty")
public void alert_email_should_not_be_empty() {


}

@When("user entered email")
public void user_entered_email() {


}

@When("user  entered invalid  email and password")
public void user_entered_invalid_email_and_password() {



}


@Given("user is on welcome page")
public void user_is_on_welcome_page() {


}

@When("user click on search button and entered Computer in search box")
public void user_click_on_search_button_and_entered_Computer_in_search_box() {


}

@When("click on  search button")
public void click_on_search_button() {


}

@Then("user navigate to result page")
public void user_navigate_to_result_page() {


}
@When("user click on logout button")
public void user_click_on_logout_button() {


}

@Then("user will be logged out")
public void user_will_be_logged_out() {


}
}
