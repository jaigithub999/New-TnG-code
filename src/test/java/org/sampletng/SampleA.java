package org.sampletng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleA {
	@Test
	private void tc1(String browserName) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jayaselvamjai\\Downloads\\chromedriver-win64");
	ChromeOptions op =new ChromeOptions();
	op.setBinary("C:\\Users\\jayaselvamjai\\Downloads\\chrome-win64\\chrome-win64");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://googlechromelabs.github.io/chrome-for-testing/#stable");
	
	}
	
	
	
	
}
