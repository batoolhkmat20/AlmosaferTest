package alsafer;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class parerts {
	String wep = "https://global.almosafer.com/en";
	WebDriver driver = new ChromeDriver();
	SoftAssert softassert = new SoftAssert();
	Random rand = new Random();
String [] arbiity= {"جده", "دبي"};
String [] engiity= {"Jeddah", "riyadh","dubai"};
int Randomarb=rand.nextInt(arbiity.length);
int Randomen=rand.nextInt(engiity.length);

public void loginweb() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// when loke aproplem wait 3s
	driver.manage().window().maximize();
	driver.get(wep);
	WebElement welo = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/button[1]"));
	welo.click();

	
	
}
}
 