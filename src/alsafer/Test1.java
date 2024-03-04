package alsafer;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 extends parerts {
	@BeforeTest
	public void sutup() {
		loginweb();
	}

	@Test(enabled = false)
	public void tedtlangouge() {

		String autallang = driver.findElement(By.tagName("htlm")).getAttribute("lang");
		String apeted = "en";
		softassert.assertEquals(autallang, apeted);
	}

	@Test(enabled = false)
	public void hrane() {
		String epeted = "+966554400000";
		WebElement nuber = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]"));

		String aual = nuber.getText();
		softassert.assertEquals(aual, epeted);

	}

	@Test(enabled = false)
	public void ontatnuber() {
		String epeted = "SAR";
		WebElement oo = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));

		String aual = oo.getText();
		softassert.assertEquals(aual, epeted);

	}

	@Test(enabled = false)
	public void logo() {
		WebElement logoo = driver.findElement(By.xpath("//div[@class='sc-fihHvN eYrDjb']"));
		boolean isdisplay = logoo.isDisplayed();
		boolean epeted = true;
		softassert.assertEquals(isdisplay, epeted);

	}

	@Test(enabled = false)
	public void hotelseletd() {
		WebElement hotels = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		String auathalhotel = hotels.getAttribute("aria-selected");
		String apetedhotel = "false";
		softassert.assertEquals(auathalhotel, apetedhotel);

	}

	@Test(enabled = false)
	public void date() {
		WebElement aualdepaturedate = driver
				.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-kqlzXE blwiEW'] span[class='sc-cPuPxo LiroG']"));
		WebElement aualreturndate = driver
				.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-OxbzP edzUwL'] span[class='sc-cPuPxo LiroG']"));
		int aualdepathurdatealue = Integer.parseInt(aualdepaturedate.getText());
		int aualreturnalue = Integer.parseInt(aualreturndate.getText());
		LocalDate today = LocalDate.now();
		int epeteddebaturedate = today.plusDays(1).getDayOfMonth();
		int epeteddatereturn = today.plusDays(2).getDayOfMonth();
		Assert.assertEquals(aualdepathurdatealue, epeteddebaturedate);
		Assert.assertEquals(aualreturnalue, epeteddatereturn);
		String dayofweek = driver
				.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-kqlzXE blwiEW'] span[class='sc-hvvHee cuAEQj']"))
				.getText().toUpperCase();
		Assert.assertEquals(dayofweek, today.plusDays(1).getDayOfWeek().toString());
		System.out.println();
	}

	@Test(enabled = false)
	public void lnag() {

		String[] Url = { "https://www.almosafer.com/ar", "https://www.almosafer.com/en" };
		int randoInde = rand.nextInt(Url.length);
		driver.get(Url[randoInde]);
		String autallang = driver.findElement(By.tagName("htlm")).getAttribute("lang");

		if (driver.getCurrentUrl().contains("ar")) {
			Assert.assertEquals(autallang, "ar");

		} else {
			Assert.assertEquals(autallang, "en");

		}
		

	}
	@Test(enabled =false )
	public void lnagandhotel() throws InterruptedException  {
		String[] Url = { "https://www.almosafer.com/ar", "https://www.almosafer.com/en" };
String autallang = driver.findElement(By.tagName("htlm")).getAttribute("lang");
		int randoInde = rand.nextInt(Url.length);
		driver.get(Url[randoInde]);
		WebElement hotelTap = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));

		hotelTap.click();
		WebElement sear=driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
if (driver.getCurrentUrl().contains("ar")) {
			Assert.assertEquals(autallang, "ar");
sear.sendKeys(arbiity[Randomarb]);
//Thread.sleep(2000);
WebElement listity=driver.findElement(By.className("phbroq-2"));		
List <WebElement >list=listity.findElements(By.tagName("li"));
list.get(1).click();
		} else {
			Assert.assertEquals(autallang, "en");
			sear.sendKeys(engiity[Randomen]);
			WebElement listity=driver.findElement(By.className("phbroq-2"));
			List<WebElement> list=listity.findElements(By.tagName("li"));
			list.get(1).click();
		}
	WebElement seletor =driver.findElement(By.className("tln3e3-1"));	
Select selectone=new Select(seletor);
selectone.selectByIndex(1);
	}
	@Test(enabled = false)
	public void switchToHotelTab() {

		WebElement HotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
		HotelTab.click();
//id("uncontrolled-tab-example-tab-hotels")
		if (driver.getCurrentUrl().contains("ar")) {
			WebElement searchCityInput = driver
					.findElement(By.cssSelector("input[placeholder='البحث عن فنادق أو وجهات']"));

			searchCityInput.sendKeys(arbiity[Randomarb]);
		} else {
			WebElement SearchCityInput = driver
					.findElement(By.cssSelector("input[placeholder='Search for hotels or places']"));

			SearchCityInput.sendKeys(engiity[Randomen]);
		}
		WebElement theList = driver.findElement(By.className("UzzIN"));

		System.out.println(theList.findElements(By.tagName("li")).size());

		theList.findElements(By.tagName("li")).get(1).click();

		// hard assert
		// if this test case failed i will not go to the following test cases

		org.testng.Assert.assertEquals(false, true);
	}
	@Test(enabled = true)
	public void HotelTabSwitch() throws InterruptedException {
		Thread.sleep(1000);
		Random rand = new Random();
		String[] arabicCities = { "دبي", "جدة" };
		String[] englishCities = { "dubai", "jeddah", "riyadh", "amman", "muscat" };

		int RandomArabicCity = rand.nextInt(arabicCities.length);
		int RandomEnglishCity = rand.nextInt(englishCities.length);

		String[] myWebSites = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };

		int randomNumber = rand.nextInt(myWebSites.length);
		driver.get(myWebSites[randomNumber]);
		WebElement HotelTab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		HotelTab.click();

		Thread.sleep(3000);

		if (driver.getCurrentUrl().contains("ar")) {
			WebElement SearchAboutHotelTab = driver
					.findElement(By.xpath("//input[@placeholder='البحث عن فنادق أو وجهات']"));

			SearchAboutHotelTab.sendKeys(arabicCities[RandomArabicCity] + Keys.ENTER);

			driver.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']")).click();
			Thread.sleep(10000);
			WebElement mySelectElement = driver
					.findElement(By.xpath("//select[@data-testid='HotelSearchBox__ReservationSelect_Select']"));
			Select selector = new Select(mySelectElement);
			selector.selectByIndex(rand.nextInt(2));
			String resultsFound = driver
					.findElement(By.xpath("//span[@data-testid='HotelSearchResult__resultsFoundCount']")).getText();
			Assert.assertEquals(resultsFound.contains("وجدنا"), true);

			driver.findElement(By.xpath("//button[contains(text(),'الأقل سعراً')]")).click();
			Thread.sleep(2000);

		} else {
			WebElement SearchAboutHotelTab = driver
					.findElement(By.xpath("//input[@placeholder='Search for hotels or places']"));

			SearchAboutHotelTab.sendKeys(englishCities[RandomEnglishCity] + Keys.ENTER);
			driver.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']")).click();

			Thread.sleep(10000);
			WebElement mySelectElement = driver
					.findElement(By.xpath("//select[@data-testid='HotelSearchBox__ReservationSelect_Select']"));
			Select selector = new Select(mySelectElement);
			selector.selectByIndex(rand.nextInt(2));

			String resultsFound = driver
					.findElement(By.xpath("//span[@data-testid='HotelSearchResult__resultsFoundCount']")).getText();
			Assert.assertEquals(resultsFound.contains("found"), true);
			driver.findElement(By.xpath("//button[normalize-space()='Lowest price']")).click();
			Thread.sleep(2000);

		}

		WebElement rightSection = driver.findElement(By.xpath("//div[@class='sc-htpNat KtFsv col-9']"));
		List<WebElement> Prices = rightSection.findElements(By.className("Price__Value"));

		int LowestPrice = 0;
		int HighestPrice = 0;

		for (int i = 0; i < Prices.size(); i++) {

			LowestPrice = Integer.parseInt(Prices.get(0).getText());
			HighestPrice = Integer.parseInt(Prices.get(Prices.size() - 1).getText());

			Assert.assertEquals(LowestPrice < HighestPrice, true);

		}
		System.out.println(LowestPrice + " this is the lowest price ");
		System.out.println(HighestPrice + " this is the highest price ");

	}

	@AfterTest
	public void end() {

		softassert.assertAll();
	}
}
