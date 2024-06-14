/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selenium_lear;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
/**
 *
 * @author Hashara
 */
public class Selenium_Lear {

  public static void main(String[] args) {
        // Set the path to geckodriver
    System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\msedgedriver.exe");
//        
        // Initialize the FirefoxDriver
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");
        
//        // Open a website to test
//        
//        
//        // Close the driver
//        driver.quit();
    }
}
