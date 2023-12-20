package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomobileProject1_MobileTricentis {
  @Test
  public void f() throws InterruptedException 
	    {
	  System.setProperty("Webdriver.chorme.driver","C:\\Users\\saeea\\OneDrive\\Desktop\\Seleniumprojetcs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	  		 driver.manage().window().maximize();
	  		 driver.get("https://sampleapp.tricentis.com/101");
	  	 driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/ul/li[1]/a")).click();
	  	 WebElement dropdown=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select"));
	  		Select s=new Select(dropdown);
	  		s.selectByIndex(2);
	  	WebElement EnginePerformance=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"));
	  	EnginePerformance.sendKeys("250");
	  	WebElement DateofManufacture=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"));
	  	DateofManufacture.sendKeys("7/10/2023");
	  	WebElement dropdown1=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select"));
	  	Select NumberofSeats=new Select(dropdown1);
	  	NumberofSeats.selectByValue("1");
	  	WebElement dropdown2=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select"));
	  	Select FuelType=new Select(dropdown2);
	  	FuelType.selectByValue("Petrol");
	  	WebElement Price=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/input"));
	  	Price.sendKeys("10000");
	  	WebElement PlateNumber=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"));
	  	PlateNumber.sendKeys("MH12BD001");
	  	WebElement AnnualMileage=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"));
	  	AnnualMileage.sendKeys("100");
	  	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/button")).click();
	  	//Thread.sleep(2000);
	  	WebElement FirstName=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"));
	  	FirstName.sendKeys("Test");
	  	WebElement LastName=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"));
	  	LastName.sendKeys("Testing");
	  	WebElement DateofBirth=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"));
	  	DateofBirth.sendKeys("04/03/2005");
	  	WebElement gender=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]"));
	  	gender.click();
	  	WebElement dropdown3=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select"));
	  	Select Country=new Select(dropdown3);
	  	Country.selectByValue("India");
	  	WebElement ZipCode=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"));
	  	ZipCode.sendKeys("412308");
	  	WebElement dropdown4=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select"));
	  	Select Occupation=new Select(dropdown4);
	  	Occupation.selectByValue("Employee");
	  	WebElement Checkbox=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]"));
	  	Checkbox.click();
	  	 //for open button to upload image or document	  
	  	  WebElement uploadpic=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[12]/div/button"));
	  	  //to access file explorer
	  	  WebElement filepath =driver.findElement(By.xpath("//input[@type='file']"));
	  	  //for image path into the pc
	  	  filepath.sendKeys("C:\\Users\\saeea\\OneDrive\\Desktop\\Seleniumprojetcs\\Demo_Selenium\\bike.jpg");
	  	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]")).click();
	  	WebElement StartDate=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"));
	  	StartDate.sendKeys("02/4/2025");
	  	WebElement dropdown5=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select"));
	  	Select Insurance=new Select(dropdown5);
	  	Insurance.selectByIndex(2);
	  	WebElement dropdown6=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select"));
	  	Select MeritRating=new Select(dropdown6);
	  	MeritRating.selectByIndex(1);
	  	WebElement dropdown7=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select"));
	  	Select DamageInsurance=new Select(dropdown7);
	  	DamageInsurance.selectByValue("Partial Coverage");
	  	WebElement Products=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]"));
	  	Products.click();
	  	WebElement dropdown8=driver.findElement(By.id("courtesycar"));
	  	Select Courtesy=new Select(dropdown8);
	  	Courtesy.selectByIndex(2);
	  	WebElement Next3=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[7]/button[2]"));
	  	Next3.click();
	  	
	  	WebElement Silver=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]"));
	  	Silver.click();
	  	WebElement SendQuote=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[5]/a"));
	  	SendQuote.click();
	  	WebElement Email=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"));
	  	Email.sendKeys("abc@gmail.com");
	  	WebElement Phone=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"));
	  	Phone.sendKeys("9045687101");
	  	WebElement UserName=driver.findElement(By.id("username"));
	  	UserName.sendKeys("tests");
	  	WebElement Password=driver.findElement(By.id("password"));
	  	Password.sendKeys("Tests@123");
	  	WebElement ConfirmPassword=driver.findElement(By.id("confirmpassword"));
	  	ConfirmPassword.sendKeys("Tests@123");
	  	WebElement Comments=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea"));
	  	Comments.sendKeys("Automation Mobile Insurance Domain");
	  	WebElement Send=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]"));
	  	Send.click();
	  	Thread.sleep(15000);
	  	WebElement OkButton=driver.findElement(By.xpath("/html/body/div[4]/div[7]/div"));
	  	OkButton.click();
	  	
	  	
	    }			
	  	  

  }

