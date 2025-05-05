package Week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='allcircle circleone']/following-sibling::label")).click();
		String title1 = driver.getTitle();
		System.out.println("Parent window title" +title1);
		Set <String> winadd= driver.getWindowHandles();
		List <String> winlist = new ArrayList <String> (winadd);
		String childadd=winlist.get(1);
		driver.switchTo().window(childadd);
		String wintitle= driver.getTitle();
		System.out.println("Child windowtitle" +wintitle);
		driver.switchTo().window(winlist.get(0));
		driver.close();	
		//driver.switchTo().window(winlist.get(1));
		System.out.println("The Parent Window got closed");
	}
		}
