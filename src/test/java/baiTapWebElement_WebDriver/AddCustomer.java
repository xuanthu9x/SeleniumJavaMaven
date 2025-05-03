package baiTapWebElement_WebDriver;

import baiTapGetLocator.xPathCustomerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddCustomer {
    WebDriver driver = new ChromeDriver();

    public void Login(String email, String password){
       driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
       driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
       driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
    }

    public void AddCustomer(String companyName) {
        // Click Customers menu
        driver.findElement(By.xpath("//span[@class ='menu-text' and normalize-space() = 'Customers']")).click();

        // Click add new customer button
        driver.findElement(By.xpath(xPathCustomerPage.buttonAddNewCustomer)).click();

        // Input add new customer form
        driver.findElement(By.xpath(xPathCustomerPage.inputCompany)).sendKeys(companyName);
        driver.findElement(By.xpath(xPathCustomerPage.inputVatNumber)).sendKeys("123");
        driver.findElement(By.xpath(xPathCustomerPage.inputPhoneNumber)).sendKeys("0123456789");
        driver.findElement(By.xpath(xPathCustomerPage.inputWebsite)).sendKeys("https://crm.anhtester.com/admin/clients/client");
        driver.findElement(By.xpath(xPathCustomerPage.dropdownGroups)).click();
        driver.findElement(By.xpath(xPathCustomerPage.inputSearchGroup)).sendKeys("Testing");
        driver.findElement(By.xpath("//span[text()= 'Testing']")).click();
        driver.findElement(By.xpath(xPathCustomerPage.dropdownCurrency)).click();
        driver.findElement(By.xpath("//span[text()= 'USD']")).click();
        driver.findElement(By.xpath(xPathCustomerPage.dropdwonDefaultLanguage)).click();
        driver.findElement(By.xpath("//span[normalize-space() = 'Vietnamese']")).click();
        driver.findElement(By.xpath(xPathCustomerPage.inputAddress)).sendKeys("Thủ Đức, HCM");
        driver.findElement(By.xpath(xPathCustomerPage.inputCity)).sendKeys("Hồ Chí Minh");
        driver.findElement(By.xpath(xPathCustomerPage.dropdownCountry)).click();
        driver.findElement(By.xpath("//span[normalize-space() = 'Vietnam']")).click();
        // Click button Save and create contact
        driver.findElement(By.xpath(xPathCustomerPage.buttonOnlySave)).click();

    }

    public void VerifyComparyIsAddSuccess(String companyName)
    {
        // Click Customers menu
        driver.findElement(By.xpath("//span[@class ='menu-text' and normalize-space() = 'Customers']")).click();

        driver.findElement(By.xpath("//div[@id= 'clients_filter']/label/div/input")).sendKeys(companyName);
        boolean created = driver.findElement(By.xpath("//a[normalize-space() = '"+ companyName+"']")).isDisplayed();
        if (created == true)
        {
            System.out.println("Company " +companyName +" is created successfully");
        }else{
            System.out.println("Company"+companyName +" is not created");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddCustomer auto = new AddCustomer();
        auto.driver.manage().window().maximize();
        auto.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        auto.driver.get("https://crm.anhtester.com/admin/authentication");
        auto.Login("admin@example.com","123456");
        auto.AddCustomer("Company 0105_2");
        auto.VerifyComparyIsAddSuccess("Company 0105_2");

        Thread.sleep(3000);
        auto.driver.quit();
    }
}
