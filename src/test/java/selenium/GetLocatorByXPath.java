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
        for (WebElement item : menuItems) {
            System.out.println(item.getText());
        }
        // Xpath tương đối 5 and/or
        // or
        System.out.println("=================");
        List<WebElement> subscriptions = auto.driver.findElements(By.xpath("//li[@class ='customer_tab_subscriptions' or @class = 'menu-item-subscriptions']"));
        for (WebElement item : subscriptions) {
            System.out.println("Xpath tương đối 5 and/or: item " + item.getText());
        }
        // and
        auto.driver.findElement(By.xpath("//ul[contains(@class, 'customer-tabs') and @role = 'tablist']"));
        // Xpath tương đối 6 Tổ tiên Ancestor
        String titleBillingAdress = auto.driver.findElement(By.xpath("//a[normalize-space() = 'Same as Customer Info']/ancestor::h4")).getText();
        System.out.println("Xpath tương đối 6 Tổ tiên Ancestor: " + titleBillingAdress);
        // Xpath tương đối 7 Con cháu Descendant
        String labelStreet = auto.driver.findElement(By.xpath("//div[@app-field-wrapper= 'billing_street']/descendant::label")).getText();
        System.out.println("Xpath tương đối 7 Con cháu Descendant: " + labelStreet);
        //Xpath tương đối 8 Following
        auto.driver.findElement(By.xpath("//h4[contains(normalize-space() , 'Billing Address')]/following::textarea")).sendKeys("Dang Van Bi");
        //Xpath tương đối, 8 Preceding
        String lableCity = auto.driver.findElement(By.xpath("//div[@app-field-wrapper = 'billing_state']/preceding::label[1]")).getText();
        System.out.println("Xpath tương đối, 8 Preceding: " + lableCity);
        //Xpath tương đối, 9 following-sibling
        auto.driver.findElement(By.xpath("//label[@for = 'billing_city']/following-sibling::input")).sendKeys("Ho Chi Minh");
        //Xpath tương đối, 9 preceding-sibling
        String lableState = auto.driver.findElement(By.xpath("//input[@id = 'billing_state']/preceding-sibling::label")).getText();
        System.out.println("Xpath tương đối, 9 preceding-sibling: lableState= " + lableState);
        //Xpath tương dối 10, parent
        String titleBillingAdress2 = auto.driver.findElement(By.xpath("//a[contains(normalize-space() , 'Same as Customer Info') ]/parent::h4")).getText();
        System.out.println("Xpath tương dối 10, parent:titleBillingAdress2= " + titleBillingAdress2);
        Thread.sleep(3000);
        auto.driver.quit();

    }
}
