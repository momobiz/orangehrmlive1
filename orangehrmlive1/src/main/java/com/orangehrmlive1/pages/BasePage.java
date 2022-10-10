package com.orangehrmlive1.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrmlive1.utils.MyWebDriverListener;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;



public abstract class BasePage {
	
	public static WebDriver driver;
	public static Logger logger=Logger.getLogger(BasePage.class.getName());
	public WebDriverWait wait=new WebDriverWait(driver, 10);
	public Actions actions;
	public JavascriptExecutor js;
	public Select select;
	public static Properties props=new Properties();
	public static ATUTestRecorder record;
	public static Scenario scenario;
	public static MyWebDriverListener myWebDriverListener;
    public static EventFiringWebDriver e_driver;
	
	
	
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		// When we use different browsers
		//driver=WebDriverManager.getInstance(props.getProperty("browser")).create();
		
		// **********Adding webDriver Listener **********************
//		e_driver=new EventFiringWebDriver(driver);
//		myWebDriverListener=new MyWebDriverListener();
//		e_driver.register(myWebDriverListener);
//		driver=e_driver;
		
		props=readConfigFile();
		driver.get(props.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	public void fillInput(WebElement element, String str) {
		element.clear();
		element.sendKeys(str);
	}
	public void clickOn(WebElement element) {
		element.click();
	}
	public boolean isDispayed(WebElement element) {
		try {
		    wait.until(ExpectedConditions.visibilityOf(element));
			
		} catch (Exception e) {
			logger.log(Level.WARNING,e.getLocalizedMessage());
			return false;
			
		}
		return true;
	
	}
	public void moveToWebElement(WebElement element) {
		actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	public void scrollDown(int pixelNumber) {
		js=(JavascriptExecutor) driver;
		js.executeScript("scroll(0,"+pixelNumber+")");
	}
	
	public void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);
		
	}
	
	public void selectOption(WebElement selectWebElement, String optionName) {
		select=new Select(selectWebElement);
		select.selectByValue(optionName);
	}
	private static Properties readConfigFile() {
		File file=new File("src/test/java/com.orangehrmlive1.data/config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			props.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return props;
		
	}
	
	public static void closeWindow() {
		driver.quit();
	}
	
	public static void startVideoRecording(String str) throws ATUTestRecorderException {
		record=new ATUTestRecorder("target/videos", str, false);
		record.start();
	}
	public static void stopVideoRecording() throws ATUTestRecorderException {
		record.stop();
	}

	
	

}
