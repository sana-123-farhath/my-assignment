package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		  
		        driver.get("http://leaftaps.com/opentaps/");
       
	      driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");

		    
		        driver.findElement(By.className("decorativeSubmit")).click();

		       
		        driver.findElement(By.linkText("CRM/SFA")).click();

		 
		        driver.findElement(By.linkText("Leads")).click();

		      
		        driver.findElement(By.linkText("Create Lead")).click();

		       
		        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("John");
		        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Doe");
		        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Johnny");

		        driver.findElement(By.name("departmentName")).sendKeys("QA");
		        driver.findElement(By.name("description")).sendKeys("This is a test lead creation.");
		        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("john@testleaf.com");

		        Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		        state.selectByVisibleText("New York");

		        driver.findElement(By.className("smallSubmit")).click();

		        driver.findElement(By.linkText("Edit")).click();

		        driver.findElement(By.id("updateLeadForm_description")).clear();

		        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note added after editing.");

		        driver.findElement(By.xpath("//input[@value='Update']")).click();

		        System.out.println("Page Title after Update: " + driver.getTitle());

		        driver.quit();
	}

}
