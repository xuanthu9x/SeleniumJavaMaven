package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocatorByAttribute {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("https://crm.anhtester.com/admin/authentication");
        //1 get locator by id
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        // 2 get locator by name
        driver.findElement(By.name("password")).sendKeys("123456");
        // 3. get locator by link text
        // driver.findElement(By.linkText("Forgot Password?")).click();
        // 4. get locator by partialLinkText
        // driver.findElement(By.partialLinkText("Forgot")).click();
        // 5. get locator by ClassName
        //driver.findElement(By.tagName("button")).click();

        driver.findElement(By.className("btn-primary")).click();

        Thread.sleep(3000);

        driver.quit();

    }
}


