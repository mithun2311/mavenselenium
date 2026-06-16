package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        
        driver.get("https://saucedemo.com");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(4000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(4000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(4000);
        
        driver.quit();
    }
}
