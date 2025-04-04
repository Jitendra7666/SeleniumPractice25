package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProg
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.get("https://www.instagram.com/");

        System.out.println(driver.getTitle());   // Prints title
        System.out.println(driver.getCurrentUrl());  // Prints current URL
        driver.navigate().back();  //Navigate to back URL
        driver.navigate().forward();  // Navigate to forward URL.

        Thread.sleep(4000);     //Waiting time for 4 Seconds
        driver.navigate().refresh();      // Refresh the current URL

    }
}
