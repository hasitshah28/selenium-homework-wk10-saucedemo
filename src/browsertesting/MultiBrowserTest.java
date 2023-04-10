package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-4 - Project Name: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class MultiBrowserTest {

        static String browser = "Firefox";
        static String baseUrl = "https://www.saucedemo.com/";
        static WebDriver driver;

        public static void main (String[]args){

            if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();

            } else {
                System.out.println("Wrong Browser name");
            }

            // Open URL into Browser
            driver.get(baseUrl);

            //Print the title of the page
            String title = driver.getTitle();
            System.out.println(title);

            //Print the current URl
            System.out.println(" Current URL : " + driver.getCurrentUrl());

            //Print page source
            System.out.println("Page Source : " + driver.getPageSource());

            //Enter the email into email field
            WebElement emailField = driver.findElement(By.id("user-name"));
            emailField.sendKeys("hasliv2002");

            //Enter the password into password field
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("has123");

            //Close the Browser
            driver.close();

        }
    }

