package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;

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

        // Xpath tương đối 1 & 3 xác định bằng thuộc tính and sử dụng hàm contains()
        // - go to customer page, open a customer to view, view contact of the customer
            auto.driver.findElement(By.xpath("//ul/li[contains(@class,'menu-item-customers')]")).click();
            auto.driver.findElement(By.xpath("//tr/td[contains(@class,'sorting_1')]/a")).click();
            auto.driver.findElement(By.xpath("//ul/li[contains(@class,'customer_tab_profile')]/a")).click();
        // Xpath tương đối 1. sử dụng hàm text(), normalize-spact()
            auto.driver.findElement(By.xpath("//a[normalize-space() = 'Billing & Shipping']")).click();
        // Xpath tương đối 4. Starts-with
            List<WebElement> menuItems = auto.driver.findElements(By.xpath("//li[starts-with(@class, 'menu-item')]"));
            for(WebElement item: menuItems)
            {
                System.out.println(item.getText());
            }
        // Xpath tương đối 5 and/or
            // or
            System.out.println("=================");
            List<WebElement> subscriptions = auto.driver.findElements(By.xpath("//li[@class ='customer_tab_subscriptions' or @class = 'menu-item-subscriptions']"));
            for (WebElement item : subscriptions)
            {
                System.out.println(item.getText());
            }
            // and
            auto.driver.findElement(By.xpath("//ul[contains(@class, 'customer-tabs') and @role = 'tablist']"));
        Thread.sleep(3000);
        auto.driver.quit();

    }
}
