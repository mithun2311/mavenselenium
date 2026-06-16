package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDRiver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args )
    {
        ChromeOptions options=new ChromeOptions();
        /*options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);*/
        
        driver.get("https://saucedemo.com");
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("user-name")).sendKeys("standard-user");
        driver.findElement(By.id("password")).sendKeys("secret-sauce");
        driver.findElement(By.id("login-button")).click();
        
        driver.quit();
    }
}
