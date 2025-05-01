package baiTapGetLocator;

import baiTapWebElement_WebDriver.AddCustomer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddProject {
    WebDriver driver = new ChromeDriver();
    projectPage xpath1 = new projectPage();

    public void login(String email, String password){
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
    }
    public void addNewProject(String projectName, String customerName) throws InterruptedException {
        // click on Project menu
        driver.findElement(By.xpath(xpath1.projectMenu)).click();
        //Click Add New project button
        driver.findElement(By.xpath(xpath1.buttonAddProject)).click();
        driver.findElement(By.xpath(xpath1.inputProjectName)).sendKeys(projectName);
        driver.findElement(By.xpath(xpath1.dropdownCustomer)).click();
        driver.findElement(By.xpath(xpath1.searchCustomerInDropdown)).sendKeys("2404");
        driver.wait(5000);
        driver.findElement(By.xpath("//span[text() ='"+customerName+"']/parent::a")).click();
        /*driver.findElement(By.xpath(xpath1.dropdownBillingType)).click();
        driver.findElement(By.xpath("//span[text() = 'Task Hours']/parent::a")).click();
        driver.findElement(By.xpath(xpath1.dropdownStatus)).click();
        driver.findElement(By.xpath("//span[text() = 'Not Started']/parent::a")).click();
        driver.findElement(By.xpath(xpath1.inputRatePerHour)).sendKeys("2");
        driver.findElement(By.xpath(xpath1.inputEstHour)).sendKeys("80");
        driver.findElement(By.xpath(xpath1.dropdownMember)).click();
        driver.findElement(By.xpath("//span[text() = 'Admin Example']/parent::a")).click();
        driver.findElement(By.xpath(xpath1.iconCalendar)).click();
        driver.findElement(By.xpath(xpath1.buttonTodayInCalendar)).click();
        driver.findElement(By.xpath(xpath1.iconCalendarDeadline)).click();
        driver.findElement(By.xpath("/html/body/div[20]/div[1]/div[2]/table/tbody/tr[4]/td[3]/div")).click();
        driver.findElement(By.xpath(xpath1.inputDescription)).sendKeys("This is description");*/
    }

    public static void main(String[] args) throws InterruptedException {
        AddProject auto = new AddProject();
        auto.driver.manage().window().maximize();
        auto.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        auto.driver.get("https://crm.anhtester.com/admin/authentication");
        auto.login("admin@example.com","123456");
        auto.addNewProject("Project 2404", "Company 2404");
        Thread.sleep(3000);
        auto.driver.quit();
    }
}
