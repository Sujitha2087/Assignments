package Week2Day5Practical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX Salem Reliance Mall Salem']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Tomorrow\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='GANGERS'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='09:00 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Book'])[5]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='24']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String text = driver.findElement(By.xpath("//div[@class=\"seat-number\"]/p")).getText();
		System.out.println("Seat number" +text);
		String text2 = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Grand Total" +text2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		String title = driver.getTitle();
		System.out.println(title);	
		
		
	}
}
