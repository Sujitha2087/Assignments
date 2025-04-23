package Week2Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathradiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();	
		driver.manage().window().maximize();	
		driver.navigate().to("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div[1]")).click();
		Boolean selected = driver.findElement(By.xpath("//label[text()='Safari']/preceding-sibling::div[1]")).isSelected());
		System.out.println("Safari is selected"+selected);
		WebElement element = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div[1]"));
		if(element.isEnabled())
		{
			element.click();
			Thread.sleep(3000);
			System.out.println(element.isSelected());
		}
	
	}

}
