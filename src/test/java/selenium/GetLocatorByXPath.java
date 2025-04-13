package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetLocatorByXPath {
    public WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
        GetLocatorByXPath auto = new GetLocatorByXPath();
        auto.driver.manage().window().maximize();
        auto.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        auto.driver.get("https://crm.anhtester.com/admin/authentication");
        // Xpath tuyệt đối - login
        auto.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        auto.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/form/div[2]/input")).sendKeys("123456");
        auto.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/form/div[4]/button")).click();

        // Xpath tương đối - go to customer page, open a customer to view, view contact of the customer
        auto.driver.findElement(By.xpath("//ul/li[contains(@class,'menu-item-customers')]")).click();
        auto.driver.findElement(By.xpath("//tr/td[contains(@class,'sorting_1')]/a")).click();
        auto.driver.findElement(By.xpath("//ul/li[contains(@class,'customer_tab_contacts')]/a")).click();
        Thread.sleep(3000);
        auto.driver.quit();

    }
}
