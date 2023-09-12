package collabera;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class AmazonCart {

    WebDriver driver = new ChromeDriver();


    @Test
    public void AmazonCart(){

        driver.get("http://google.com");
        WebElement search = driver.findElement(By.xpath("//div//textarea[@id='APjFqb']"));
        search.sendKeys("amazon");
        search.sendKeys(Keys.ENTER);

        List<WebElement> searchResult = driver.findElements(By.xpath("//div[@id='rcnt']//div"));

        for(WebElement element: searchResult){
            System.out.println(String.valueOf(element.getText()));
            element.click();
        }
        
        
    }

}