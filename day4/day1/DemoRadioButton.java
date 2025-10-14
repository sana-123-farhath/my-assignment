package week3.day1;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeOptions options = new ChromeOptions();
options.addArguments("--guest");

ChromeDriver driver = new ChromeDriver(options);
driver.get("https://www.leafground.com/radio.xhtml");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

WebElement chromeSelect = driver.findElement(By.xpath("//label[text()='Chrome']"));
chromeSelect.click();

chromeSelect.click();
boolean isSelected = chromeSelect.isSelected();
System.out.println("Chrome button is Enabled:"+isSelected);

List <WebElement> radioButtons = driver.findElements(By.name("j_idt87:console2"));
for(int i=0;i<radioButtons.size();i++) {
	
	WebElement radio = radioButtons.get(i);
	boolean selected = radio.isSelected();
	System.out.println("Option  Selected :"+i);
	System.out.println(selected);
}

WebElement ageGroup = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div[contains(@class,'ui-radiobutton ui-widget')]"));
WebElement ageGroupDiv = ageGroup.findElement(By.tagName("div"));

if (!ageGroupDiv.getDomAttribute("class").contains("ui-state-active")) {
	ageGroup.click();
    System.out.println("21-40 Years age group was not selected. Now selected.");
} else {
    System.out.println("21-40 Years age group is already selected.");
}

	}

}
