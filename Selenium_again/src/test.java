import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:/Users/rajesh/Downloads/geckodriver-v0.16.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	}

}
