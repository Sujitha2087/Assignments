package Week2Day5Practical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Type of Bags");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys", Keys.ARROW_DOWN,Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//div[@class='sg-col-inner']//span"));
		System.out.println("Search Results" +element.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//WebElement element2 = driver.findElement(By.id("s-result-sort-select"));
		//Select options = new Select(element2);
		//options.selectByVisibleText("Newest Arrivals");
		String text = driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']//span")).getText();
		System.out.println("Bag detail" +text);
		String title = driver.getTitle();
		System.out.println(title);	
		
	}
	

}
