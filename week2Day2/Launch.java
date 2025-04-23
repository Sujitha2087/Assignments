package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch {
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
		WebElement element2 = driver.findElement(By.id("createLeadForm_companyName"));
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayakumaran");
		WebElement selectDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options = new Select(selectDropDown);
		options.selectByIndex(4);
		WebElement selectDropDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select options1 = new Select(selectDropDown2);
		options1.selectByVisibleText("Automobile");
		WebElement selectDropDown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options2 = new Select(selectDropDown3);
		options2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//STEP NO 9: TO close the browser Window
		//driver.close();
}
}
