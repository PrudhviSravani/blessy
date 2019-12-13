package org.example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Prudhvi\\RobotExample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement txtPara = driver.findElement(By.xpath("(//p[contains(text(),'Greens')])[1]"));
        Actions a = new Actions(driver);
        a.doubleClick(txtPara).perform();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_UP);
        r.keyPress(KeyEvent.VK_SHIFT);
	    r.keyPress(KeyEvent.VK_UP);
	    r.keyRelease(KeyEvent.VK_SHIFT);
	    r.keyRelease(KeyEvent.VK_UP);
	    a.contextClick(txtPara).perform();
	    for (int i = 1; i <=3; i++) {
	        r.keyPress(KeyEvent.VK_DOWN);
	        r.keyRelease(KeyEvent.VK_DOWN);
	        
	    }
	    
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	        

	    	
			
		}


	}
		
