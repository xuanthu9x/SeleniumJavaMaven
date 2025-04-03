package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        driver.findElement(By.name("password")).sendKeys("123456");

        // driver.findElement(By.linkText("Forgot Password?")).click();
        // driver.findElement(By.partialLinkText("Forgot")).click();

        //driver.findElement(By.tagName("button")).click();

        driver.findElement(By.className("btn-primary")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
