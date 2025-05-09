package Marathonweek4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.sukgu.Shadow;

public class shadowassign {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		Shadow sh = new Shadow(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://dev186929.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		sh.setImplicitWait(20);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		sh.setImplicitWait(20);
	    WebElement elementByXPath = sh.findElementByXPath("//iframe[@id='gsft_main']");
	    driver.switchTo().frame(elementByXPath);
	    //Click on the mobile inside the frame
	    driver.findElement(By.xpath("//a[@aria-label='Mobiles. Cell phones to meet your business needs.']")).click();
	    driver.findElement(By.xpath("//a[@id='item_link_73b1bafa9752cd1021983d1e6253afb5']")).click();
	    //Filled the req details as given
	    driver.findElement(By.xpath("//label[text()='Yes']")).click();
	    driver.findElement(By.xpath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("99");
	    driver.findElement(By.xpath("//select[@id='IO:ff1f478e9747011021983d1e6253af68']")).click();
	    driver.findElement(By.xpath("//select[@id='IO:ff1f478e9747011021983d1e6253af68']/option[3]")).click(); 
	    driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
	    driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
	    //Order placed
	    driver.findElement(By.xpath("//button[text()='Order Now']")).click();
	    String ordername1 = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']/b")).getText();
	    System.out.println("Ordernumber" +ordername1);
	    String title1 = driver.getTitle();
	    System.out.println("Ordernumber in page title" +title1);
	    String title2=title1.substring(15);

	    //Verifying the order number is placed is correct
	    if(ordername1.contains(title2))
	    {
	    	System.out.println("The order has placed sucessfully");
	    }
	    else
	    {
	    	System.out.println("The order has not placed.");
	    }
	    //snapchat of the order placed
	    File source =driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/orderpage.png");
		FileUtils.copyFile(source, target);
	}

}
