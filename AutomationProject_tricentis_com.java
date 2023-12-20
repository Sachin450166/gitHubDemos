package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationProject_tricentis_com {
  @Test
  public void f() throws InterruptedException {
	 System.setProperty("Webdriver.chorme.driver","C:\\Users\\saeea\\OneDrive\\Desktop\\Seleniumprojetcs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[1]/ul/li[2]/a")).click();
		WebElement Dropdown=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select"));
		Select s= new Select(Dropdown);
		s.selectByIndex(2);
		WebElement EngineKw=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"));
		EngineKw.sendKeys("100");
		WebElement DateofManufacture= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"));
		DateofManufacture.sendKeys("5/05/2002");
		WebElement NumberofSeats=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select"));
		NumberofSeats.sendKeys("123456");
		WebElement FuelType=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select"));
		FuelType.sendKeys("Petrol");

		WebElement Payloadkg=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/input"));
		Payloadkg.sendKeys("1000");
		WebElement TotalWeightKg=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"));
		TotalWeightKg.sendKeys("1200");
		WebElement listprice=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"));
		listprice.sendKeys("12000");
		WebElement platenumber=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/input"));
		platenumber.sendKeys("129711");
		WebElement AnnualMileage=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[10]/input"));
		AnnualMileage.sendKeys(" 10000");
		WebElement Next=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[11]/button"));
		Next.click();
		WebElement FirstName=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"));
		FirstName.sendKeys("Sachin");
		WebElement LastName=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"));
		LastName.sendKeys("Gaikwad");
		WebElement DateofBirth=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"));
		DateofBirth.sendKeys("12/12/2001");
		WebElement Gender=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
		Gender.click();
		WebElement StreetAddress=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input"));
		StreetAddress.sendKeys("pune");
		WebElement Country=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select"));
		Select s1=new Select(Country);
		s1.selectByVisibleText("India");
		WebElement ZipCode=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"));
		ZipCode.sendKeys("412308");
		WebElement City=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input"));
		City.sendKeys("Mumbai");
		WebElement Occupation=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select"));
		Select Occupations= new  Select(Occupation);
		Occupations.selectByIndex(3);
		WebElement Hobbies=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]"));
		Hobbies.click();
		WebElement Website=driver.findElement(By.id("website"));
		Website.sendKeys("https://mail.google.com/");
		WebElement Open=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[12]/div/button"));
		WebElement filepath=driver.findElement(By.xpath("//input[@type='file']"));
		filepath.sendKeys("C:\\Users\\saeea\\OneDrive\\Desktop\\Seleniumprojetcs\\Demo_Selenium\\bike.jpg");
		WebElement Next2=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]"));
		Next2.click();
		
		WebElement StartDate=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"));
		StartDate.sendKeys("07/10/2024");
		WebElement InsuranceSum =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select"));
		InsuranceSum.sendKeys("3000");
		WebElement DamageInsurance=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select"));
		Select DamageInsurance1= new Select(DamageInsurance);
		DamageInsurance1.selectByIndex(3);
		WebElement OptionalProducts=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]"));
		WebElement OptionalProducts2=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span"));
	    OptionalProducts.sendKeys("Euro Protection");
	    OptionalProducts.sendKeys("legal defence Insurance");
	    WebElement Next3=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/button[2]"));
	    Next3.click(); 
	    
	    
	    WebElement Gold=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]"));
		Gold.click();
		WebElement SendQuote=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[5]/a"));
		SendQuote.click();
		WebElement Email=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"));
		Email.sendKeys("abc1@gmail.com");
		WebElement Phone=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"));
		Phone.sendKeys("9945687101");
		WebElement UserName=driver.findElement(By.id("username"));
		UserName.sendKeys("trucktest");
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Tests@1234");
		WebElement ConfirmPassword=driver.findElement(By.id("confirmpassword"));
		ConfirmPassword.sendKeys("Tests@1234");
		WebElement Comments=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea"));	
		Comments.sendKeys("Send quote Automation");
		WebElement Send=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]"));
		Send.click();
		Thread.sleep(10000);
		WebElement OkButton=driver.findElement(By.xpath("/html/body/div[4]/div[7]/div"));
		OkButton.click();
		
		
  }
		

	  



	
	  
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
  }

