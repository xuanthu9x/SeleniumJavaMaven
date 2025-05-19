package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoHandleDropdown {
    WebDriver driver = new ChromeDriver();
    public void HandleStaticDropdown() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        //1 Kiểm tra dropdown có phải multi-select hay single select
        System.out.println("Is Old Style Select Menu multiple select: "+select.isMultiple());
        // 2 Lấy tổng số Option trong Select
        System.out.println("Số lượng options trong dropdown: "+select.getOptions().size());
        // 3. Select một giá trị trong dropdown sử dụng index
        select.selectByIndex(3);
        // 4. Lấy giá trị của dropdown hiển thị sau khi đã chọn thành công (giá trị đã chọn sẽ luôn hiển thị ở vị trí đầu tiên):
        System.out.println("Giá trị được select by index 3 is: "+select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        // 5. Select một giá trị trong dropdown sử dụng value
        select.selectByValue("red");
        System.out.println("Giá trị được select by value red is: "+select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        // Select một giá trị trong dropdown sử dụng visible text (thường sử dụng)
        select.selectByVisibleText("Green");
    }
    public void HandleDynamicDrodown() throws InterruptedException {
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        // chờ loader-container biến mất và dropdown hiện ra
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-container")));
        // Case 1 search result is not null and select the first element
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/following::input")).sendKeys("F");
        driver.findElement(By.xpath("//li[@class = 'active-result highlighted']")).click();
    }
    public static void main(String[] args) throws InterruptedException {
        DemoHandleDropdown auto = new DemoHandleDropdown();
        auto.driver.manage().window().maximize();
        auto.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //auto.HandleStaticDropdown();
        auto.HandleDynamicDrodown();

        Thread.sleep(3000);
        auto.driver.quit();
    }
}
