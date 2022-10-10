package com.orangehrmlive1.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyWebDriverListener implements WebDriverEventListener{

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("beforeAlertAccept");
		
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		System.out.println("afterAlertAccept");
		
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("afterAlertDismiss");
		
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("beforeNavigateTo");
		
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("afterNavigateTo");
		
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("beforeNavigateBack");
		
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("afterNavigateBack");
	
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("beforeNavigateForward");
		
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("afterNavigateForward");
		
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("beforeNavigateRefresh");
		
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("afterNavigateRefresh");
		
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("beforeFindBy");
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
	System.out.println("afterFindBy");
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("beforeClickOn");
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("afterClickOn");
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("beforeChangeValueOf");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("afterChangeValueOf");
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("beforeScript");
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println("afterScript");
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		
		System.out.println("beforeSwitchToWindow");
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("afterSwitchToWindow");
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("onException");
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		System.out.println("beforeGetScreenshotAs");
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		System.out.println("afterGetScreenshotAs");
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("beforeGetText");
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		
		System.out.println("afterGetText");
	}
}
