package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeVideoLoginPageAssignment7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg0_1-djiLvlmqDLgE8lalAPfW0UxdlrP4jEPp5WD6zRcAAAAAQAAAABkZfXLcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=261-6369475-9235457&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	        Thread.sleep(2000);
	        
	        //To identify webelement we use locators
	        
	        driver.findElement(By.id("ap_email")).sendKeys("pratikshasawant7105gmail.com");//username textbox
	       // Thread.sleep(2000);
	        
	        driver.findElement(By.id("ap_password")).sendKeys("pratiksha11");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.className("a-button-input")).click();
		

	}

}
