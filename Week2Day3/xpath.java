package Week2Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();	
		driver.manage().window().maximize();	
		driver.navigate().to("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div[1]")).click();
		Boolean selected = driver.findElement(By.xpath("//label[text()='Safari']/preceding-sibling::div[1]")).isSelected();
		System.out.println("Safari is selected"+selected);
		driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div[1]")).click();
		//WebElement element = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div[1]"));
		//if(element.isDisplayed())
		//{
			//element.click();
			//System.out.println(element.isSelected());
		//}
	}


}
