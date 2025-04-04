package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{
    public static void main(String[] args) throws InterruptedException
    {

        //Program to find total counts of input tags
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lifepartner.in/");

        WebElement wb = driver.findElement(By.id("sel3"));   //Find web Element
        Select select = new Select(wb);                      //Create select object
        //select.selectByIndex(1);
        //select.selectByVisibleText("Groom");
        select.selectByValue("2");     //Take it from elements

        WebElement wb1 = driver.findElement(By.id("sel1"));
        Select sel = new Select(wb1);
        sel.selectByIndex(4);

        WebElement wb2 = driver.findElement(By.id("sel1"));
        Select sel1 = new Select(wb2);
        sel.selectByIndex(1);

        WebElement wb3 = driver.findElement(By.id("sel2"));
        Select sel2 = new Select(wb3);
        sel.selectByIndex(2);

        WebElement wb4 = driver.findElement(By.id("sel5"));
        Select sel3 = new Select(wb4);
        sel.selectByIndex(2);

        driver.findElement(By.className("search-btn")).click();



    }
}
