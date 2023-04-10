package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //Launch the Chrome Browser

        WebDriver driver = new ChromeDriver();

        // Open URL into Browser
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URl
        System.out.println( " Current URL : " + driver.getCurrentUrl());

        //Print page source
        System.out.println("Page Source : " + driver.getPageSource());

        //Enter the email into email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("hasliv2002");

        //Enter the password into password field
        WebElement passwordField = driver. findElement(By.name("password"));
        passwordField.sendKeys("has123");

        //Close the Browser
        driver.close();

    }
}



