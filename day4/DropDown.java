package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 {
	{
		ChromeOptions options = new ChromeOptions();
		 ChromeDriver driver = new ChromeDriver(options);
		        driver.get("http://leaftaps.com/opentaps/");		       
		        driver.manage().window().maximize();		     
		        driver.findElement(By.id("username")).sendKeys("demosalesmanager");		        
		        driver.findElement(By.id("password")).sendKeys("crmsfa");		       
		        driver.findElement(By.className("decorativeSubmit")).click();		      
		        driver.findElement(By.linkText("CRM/SFA")).click();	       
		        driver.findElement(By.linkText("Leads")).click();		      
		        driver.findElement(By.linkText("Create Lead")).click();	       
		        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sana");
		        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("F");	
		        
		        WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		        Select sourceSelect = new Select(sourceDropdown);
		        sourceSelect.selectByIndex(2); 
		        
		        WebElement marketingDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		        Select marketingSelect = new Select(marketingDropdown);
		        marketingSelect.selectByVisibleText("Automobile"); 
		        
		        WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		        Select ownershipSelect = new Select(ownershipDropdown);
		        ownershipSelect.selectByValue("OWN_CCORP"); 
		        
		        driver.findElement(By.name("submitButton")).click();
		        
		        System.out.println("Page Title: " + driver.getTitle());
		        driver.quit();
		    }
		}
	}

}
