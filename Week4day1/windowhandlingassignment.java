package Week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class windowhandlingassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		//WebElement element = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//STEP NO 5 : Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//STEP NO 6 : click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		//STEP NO 7 : click the CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		//set the address and store it in list of array
		Set <String> winadd= driver.getWindowHandles();
		List <String> winlist = new ArrayList <String> (winadd);
		System.out.println(winlist);
		//switch to the child window
		driver.switchTo().window(winlist.get(1));
		System.out.println(driver.getTitle());
		//fetch the first resulting contact
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(winlist.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//Click on the second icon in the parent page.
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set <String> winadd1= driver.getWindowHandles();
		List <String> winlist1 = new ArrayList <String> (winadd1);
		driver.switchTo().window(winlist1.get(1));
		System.out.println(driver.getTitle());
		//fetch the second resulting contact
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		driver.switchTo().window(winlist.get(0));
		System.out.println(driver.getTitle());
		//click on Merge button in parent page
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept the alert by clicking on ok
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//print the page title
		System.out.println(driver.getTitle());
		driver.close();		
	}

}
