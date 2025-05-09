package Marathonweek4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tatacliq.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Brands']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Watches & Accessories']"))).perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Casio']"))).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//sorting to new arrivals and select category MEN
		driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']")).click();
		driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		Thread.sleep(5000);
		//print all the watch price
		List <WebElement> totallist = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		System.out.println("size" +totallist.size());
		for (int i = 0; i < totallist.size(); i++) {
			System.out.println(totallist.get(i).getText());
		}
		//print the price of the watch
		String price = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")).getText();
		System.out.println("Price of first watch " +price);
	// opened the first watch details in new window
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		Set <String> winadd= driver.getWindowHandles();
		List <String> winlist = new ArrayList <String> (winadd);
		//System.out.println(winlist);
		driver.switchTo().window(winlist.get(1));
		//System.out.println(driver.getTitle());
		String price1 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String cost=price1.substring(5);
		System.out.println("Price of first watch in next window " +price1);
		if (price.contains(cost)){
			System.out.println("Both the page price is equal");	
		}
		else
		{
			System.out.println("Both the page price is not equal");	
		}
		act.scrollToElement(driver.findElement(By.xpath("//span[text()='ADD TO BAG']"))).perform();
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("The count of the Bag cart" +count);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		File source =driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/resultingpage.png");
		FileUtils.copyFile(source, target);	
		driver.close();
		driver.switchTo().window(winlist.get(0));
		driver.close();
		
	}
}

