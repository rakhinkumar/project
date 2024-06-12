package projectrakhi;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orangehrmrak {
	WebDriver driver ;
	@BeforeTest 
	public  void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakhi N Kumar\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");		
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://localhost/orangehrm/orangehrm-5.6.1/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Rakhi@1992");
	driver.findElement(By.name("password")).sendKeys("Rakhi@1234");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click(); 
	}
	
	@Test 
	public void addEmployeeTest() {
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
	driver.findElement(By.name("firstName")).sendKeys("RAKHI");
	driver.findElement(By.name("middleName")).sendKeys("N");	
	driver.findElement(By.name("lastName")).sendKeys("KUMAR");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1239");
	//WebElement photoField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/div/img"));
	//photoField.sendKeys("C:\\Users\\Rakhi N Kumar\\OneDrive\\Desktop\\sm.jpg (2).jpg");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	}
	
		@AfterTest 
		public void terminateBrowser() {
	}
	}


	