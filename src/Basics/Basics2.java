package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Basics2
{
    public static void main(String[] args) throws InterruptedException {

        //Program to find total counts of input tags

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
        List<WebElement>wblist = driver.findElements(By.tagName("input"));
        System.out.println("Total input tags are = " +wblist.size());

        //wblist.get(0).sendKeys("admin");
        //wblist.get(1).sendKeys("admin");
        //wblist.get(2).click();



    }
}
