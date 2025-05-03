package baiTapWebElement_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import baiTapGetLocator.xPathProjectPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProject {
    WebDriver driver = new ChromeDriver();

    public void login(String email, String password) {
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
    }

    public void addNewProject(String projectName) throws InterruptedException {
        // click on Project menu
        driver.findElement(By.xpath(xPathProjectPage.menuProject)).click();
        //Click Add New project button
        driver.findElement(By.xpath(xPathProjectPage.buttonAddProject)).click();
        driver.findElement(By.xpath(xPathProjectPage.inputProjectName)).sendKeys(projectName);
        driver.findElement(By.xpath(xPathProjectPage.dropdownCustomer)).click();
        // Xử lý search and select customer
        String searchtext = "Company 2404";
        WebElement input = driver.findElement(By.xpath(xPathProjectPage.inputSearchCustomer));
        for (char c : searchtext.toCharArray()) {
            input.sendKeys(String.valueOf(c));
            Thread.sleep(100);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Company 2404']")));

        driver.findElement(By.xpath("//span[normalize-space()='Company 2404']")).click();
        driver.findElement(By.xpath(xPathProjectPage.dropdownBillingType)).click();
        driver.findElement(By.xpath("//span[contains(normalize-space(),'Task Hours')]")).click();
        driver.findElement(By.xpath(xPathProjectPage.dropdownStatus)).click();
        driver.findElement(By.xpath("//span[normalize-space()='Not Started']")).click();
        // driver.findElement(By.xpath(xPathProjectPage.inputRatePerHour)).sendKeys("2");
        driver.findElement(By.xpath(xPathProjectPage.inputEstHour)).sendKeys("80");
        driver.findElement(By.xpath(xPathProjectPage.dropdownMember)).click();
        driver.findElement(By.xpath("//span[normalize-space()='Admin Example']")).click();
        // select date for Start date
        driver.findElement(By.xpath(xPathProjectPage.inputStartDate)).click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        // Chờ calendar VISIBLE
        WebElement calendarVisible = wait1.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'xdsoft_datetimepicker') and not(contains(@style,'display: none'))]")
        ));
        // Sau đó tìm ngày 3/5/2025 trong calendar đang hiển thị
        WebElement day = calendarVisible.findElement(By.xpath(".//td[@data-year='2025' and @data-month='4' and @data-date='14']"));
        day.click();

        // Xử lý select deadline date
        driver.findElement(By.xpath(xPathProjectPage.iconCalendarDeadline)).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        // Chờ calendar VISIBLE
        WebElement calendarDeadlineVisible2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'xdsoft_datetimepicker') and not(contains(@style,'display: none'))]")
        ));
        // Click to open month dropdown
        WebElement monthDropdown = calendarDeadlineVisible2.findElement(By.xpath(".//div[@class = 'xdsoft_label xdsoft_month']"));
        monthDropdown.click();
        // Kiểm tra và chờ month dropdown hiển thị
        String xPathcalendarDeadlineVisible2 = "//div[contains(@class,'xdsoft_datetimepicker') and not(contains(@style,'display: none'))]";
        String xPathMonthList = xPathcalendarDeadlineVisible2 + "//div[@class = 'xdsoft_select xdsoft_monthselect xdsoft_scroller_box' and not(contains(@style,'display: none'))]";
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement monthDropdownVisible2 = wait3.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xPathMonthList)
        ));
        // Select July on month dropdown
        String xPathJuly = xPathMonthList + "//div[@class = 'xdsoft_option ' and @data-value = '6']";
        WebElement month = monthDropdownVisible2.findElement(By.xpath(".//div[text() = 'July']"));
        month.click();
        // Select date of deadline 14/07/2025
        WebElement deadline = calendarDeadlineVisible2.findElement(By.xpath(".//td[@data-year='2025' and @data-month='6' and @data-date='14']"));
        deadline.click();

        // Xử lý điền description
        // Switch vào iframe của TinyMCE
        WebElement iframe = driver.findElement(By.id("description_ifr"));
        driver.switchTo().frame(iframe);

        // Nhập nội dung
        WebElement editorBody = driver.findElement(By.cssSelector("body#tinymce"));
        editorBody.clear();
        editorBody.sendKeys("Đây là nội dung tự động nhập vào từ Selenium!");

        // Quay về nội dung chính
        driver.switchTo().defaultContent();
        // Click Save button
        driver.findElement(By.xpath(xPathProjectPage.buttonSave)).click();
    }

    public void CheckNewProject (String projectName){
        driver.get("https://crm.anhtester.com/admin/projects");
        driver.findElement(By.xpath(xPathProjectPage.inputSearchProject)).sendKeys(projectName);
        WebElement project = driver.findElement(By.xpath("//a[normalize-space() = '"+projectName+"']"));
        if(project.isDisplayed()){
            System.out.println("Project "+ projectName + " is created successfully");
        }else{
            System.out.println("Project "+ projectName + " has not created");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddProject auto = new AddProject();
        auto.driver.manage().window().maximize();
        auto.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        auto.driver.get("https://crm.anhtester.com/admin/authentication");
        auto.login("admin@example.com", "123456");
        auto.addNewProject("Project 0305_2");
        auto.CheckNewProject("Project 0305_2");
        Thread.sleep(5000);
        auto.driver.quit();
    }
}
