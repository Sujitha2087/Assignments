package Week2Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnclass {
	public static void main(String[] args) {
		//A WebDriver implementation that controls a Chrome browser running on the local machine.
		//declaration
		EdgeDriver driver=new EdgeDriver();
		// initialize
		//step 1--> the browser is opened	
		driver.manage().window().maximize();
		//STEP NO 3 : Load my url
		//driver.get(null);
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		//STEP NO 4 : How to locate a webelement
		//Mechanism used to locate elements within a document
		//Use this method to simulate typing into an element
		WebElement element = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//STEP NO 5 : Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//STEP NO 6 : click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		//STEP NO 7 : click the CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//STEP NO 8 : get the title of the page
		//Get the title of the current page.
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TargetTestleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sujitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Suji");
		driver.findElement(By.xpath("//input[contains(@name,'departmentName')]")).sendKeys("Software");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Clas xpath assignments work");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sujithaj@gmail.com");
		WebElement selectDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options = new Select(selectDropDown);
		options.selectByVisibleText("Alaska");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Clas xpath assignments work");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//STEP NO 9: TO close the browser Window
		//driver.close();
}

}
