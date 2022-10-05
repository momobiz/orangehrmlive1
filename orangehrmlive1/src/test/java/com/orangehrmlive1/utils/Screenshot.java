package com.orangehrmlive1.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangehrmlive1.pages.BasePage;

public abstract class Screenshot extends BasePage{

	public Screenshot() {
		super();
		
	}
	public static void takeScreenshot(String fileName) throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("target/snapshots/"+fileName+".png"));
	}
	
	
	

}
