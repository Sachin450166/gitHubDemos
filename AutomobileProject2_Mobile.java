package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomobileProject2_Mobile {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("Webdriver.chorme.driver","C:\\Users\\saeea\\OneDrive\\Desktop\\Seleniumprojetcs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
	  WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://sampleapp.tricentis.com/101");
	 driver1.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/ul/li[1]/a")).click();
	 WebElement dropdown=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
	WebElement EnginePerformance=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"));
	EnginePerformance.sendKeys("270");
	WebElement DateofManufacture=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"));
	DateofManufacture.sendKeys("12/04/2022");
	WebElement dropdown1=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select"));
	Select NumberofSeats=new Select(dropdown1);
	NumberofSeats.selectByValue("5");
	WebElement dropdown2=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select"));
	Select FuelType=new Select(dropdown2);
	FuelType.selectByIndex(2);
	WebElement Price=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/input"));
	Price.sendKeys("50000");
	WebElement PlateNumber=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"));
	PlateNumber.sendKeys("MH12BZ002");
	WebElement AnnualMileage=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"));
	AnnualMileage.sendKeys("170");
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/button")).click();
	Thread.sleep(2000);
	WebElement FirstName=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"));
	FirstName.sendKeys("AutoTest");
	WebElement LastName=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"));
	LastName.sendKeys("Testing");
	WebElement DateofBirth=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"));
	DateofBirth.sendKeys("05/20/1999");
	WebElement gender=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
	gender.click();
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input")).sendKeys("maharashtra");
	WebElement dropdown3=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select"));
	Select Country=new Select(dropdown3);
	Country.selectByVisibleText("India");
	WebElement ZipCode=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"));
	ZipCode.sendKeys("412308");
	WebElement dropdown4=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select"));
	Select Occupation=new Select(dropdown4);
	Occupation.selectByValue("Farmer");
	WebElement Checkbox=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]"));
	Checkbox.click();
	driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]")).click();
	WebElement StartDate=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"));
	StartDate.sendKeys("04/10/2024");
	WebElement dropdown5=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select"));
	Select Insurance=new Select(dropdown5);
	Insurance.selectByIndex(3);
	WebElement dropdown6=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select"));
	Select MeritRating=new Select(dropdown6);
	MeritRating.selectByIndex(4);
	WebElement dropdown7=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select"));
	Select DamageInsurance=new Select(dropdown7);
	DamageInsurance.selectByValue("No Coverage");
	WebElement Products=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]"));
	Products.click();
	WebElement dropdown8=driver1.findElement(By.id("courtesycar"));
	Select Courtesy=new Select(dropdown8);
	Courtesy.selectByIndex(1);
	WebElement Next3=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[7]/button[2]"));
	Next3.click();
	
	WebElement Gold=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]"));
	Gold.click();
	WebElement SendQuote=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[5]/a"));
	SendQuote.click();
	WebElement Email=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"));
	Email.sendKeys("Sachin@gmail.com");
	WebElement Phone=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"));
	Phone.sendKeys("7028171699");
	WebElement UserName=driver1.findElement(By.id("username"));
	UserName.sendKeys("autotests");
	WebElement Password=driver1.findElement(By.id("password"));
	Password.sendKeys("Tests@1234");
	WebElement ConfirmPassword=driver1.findElement(By.id("confirmpassword"));
	ConfirmPassword.sendKeys("Tests@1234");
	WebElement Send=driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]"));
	Send.click();
	
	
	Thread.sleep(15000);
	WebElement OkButton=driver1.findElement(By.xpath("/html/body/div[4]/div[7]/div"));
	OkButton.click();

  }
}
