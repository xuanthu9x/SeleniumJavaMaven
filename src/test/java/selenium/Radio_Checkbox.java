package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Radio_Checkbox {
    WebDriver driver = new ChromeDriver();
    public void handleSigleCheckbox() throws InterruptedException {
        // 1 handle sigle checkbox
        //1.1 open site demoqa/checkbox
        driver.get("https://demoqa.com/checkbox");
        //1.2 Scroll to Home checkbox
        WebElement element = driver.findElement(By.xpath("//button[@title= 'Toggle']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        //1.3 Sổ những checkbox under Home
        driver.findElement(By.xpath("//button[@title= 'Toggle']")).click();
        //1.4 Sổ những checkbox under Desktop
        driver.findElement(By.xpath("//span[text() = 'Home']/following::ol[1]/li[1]//button")).click();
        //1.5 Tick checkbox Notes, Commend
        driver.findElement(By.xpath("//label[@for= 'tree-node-notes']")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-commands']")).click();
        // 1.6 Kiểm tra và in trạng thái select của checkboxes Notes, Commend
        boolean isCheckNotes = driver.findElement(By.xpath("//input[@id= 'tree-node-notes']")).isSelected();
        boolean isCheckCommand = driver.findElement(By.xpath("//input[@id= 'tree-node-commands']")).isSelected();
        System.out.println("Checkbox Notes is check: " + isCheckNotes);
        System.out.println("Checkbox Notes is check: " + isCheckCommand);
        // 1.7 Uncheck for checkbox Notes, kept check for checkbox Command
        driver.findElement(By.xpath("//label[@for= 'tree-node-notes']")).click();
        // 1.8 Update value của biến kiểm tra trạng thái checkbox Notes
        isCheckNotes = driver.findElement(By.xpath("//input[@id= 'tree-node-notes']")).isSelected();
        // In ra trạng thái cuối cùng của checkbox Notes, Command
        System.out.println("Checkbox Notes is check: " + isCheckNotes);
        System.out.println("Checkbox Notes is check: " + isCheckCommand);
    }
    public void LoginCRM(){
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.className("btn-primary")).click();
    }
    public void HandleMultipleCheckboxes() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id ='wrapper']/div[2]")).click();
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@id = 'dashboard-options']//div[@class = 'checkbox']"));
        //2.1 Check all checkbox
        for(int i = 1; i< menuList.size()+1; i++)
        {
            //driver.findElement(By.xpath("//div[@id = 'dashboard-options']//div[@class = 'checkbox']"+"["+ i +"]")).click();
            boolean isCheck = driver.findElement(By.xpath("//div[@id = 'dashboard-options']//div[@class = 'checkbox']["+i+"]/input[@type = 'checkbox']")).isSelected();
            if(isCheck == false)
            {
                driver.findElement(By.xpath("//div[@id = 'dashboard-options']//div[@class = 'checkbox']["+i+"]/input[@type = 'checkbox']")).click();
                Thread.sleep(1000);
            }
            System.out.println("Ischeck of checkbox: " + i + " "+isCheck);
        }
        //2.2 Uncheck multiple checkboxes ( not all)
        System.out.println("========================================");
        for(int i = 4; i< 7; i++)
        {
            //driver.findElement(By.xpath("//div[@id = 'dashboard-options']//div[@class = 'checkbox']"+"["+ i +"]")).click();
            boolean isCheck = driver.findElement(By.xpath("//div[@id = 'dashboard-options']//div[@class = 'checkbox']["+i+"]/input[@type = 'checkbox']")).isSelected();
            if(isCheck == true)
            {
                driver.findElement(By.xpath("//div[@id = 'dashboard-options']//div[@class = 'checkbox']["+i+"]/input[@type = 'checkbox']")).click();
                Thread.sleep(1000);
            }
            System.out.println("Ischeck of checkbox: " + i + " " + isCheck);
        }
    }
    public void HandleRadio() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Sales'][1]")).click();
        driver.findElement(By.xpath("//li[normalize-space() = 'Proposals']")).click();
        driver.findElement(By.xpath("//a[normalize-space() = 'New Proposal']")).click();

        WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Show quantity as:']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);

        boolean isSelectQty = driver.findElement(By.xpath("//input[@type = 'radio' and @id = '1']")).isSelected();
        boolean isSelectHour = driver.findElement(By.xpath("//input[@type = 'radio' and @id = '2']")).isSelected();
        boolean isSelectQtyHour = driver.findElement(By.xpath("//input[@type = 'radio' and @id = '3']")).isSelected();
        if(!isSelectHour) {
            driver.findElement(By.xpath("//input[@type = 'radio' and @id = '2']")).click();
            isSelectQty = driver.findElement(By.xpath("//input[@type = 'radio' and @id = '1']")).isSelected();
            isSelectHour = driver.findElement(By.xpath("//input[@type = 'radio' and @id = '2']")).isSelected();
            isSelectQtyHour = driver.findElement(By.xpath("//input[@type = 'radio' and @id = '3']")).isSelected();
            System.out.println("Option Qty is selected "+ isSelectQty);
            System.out.println("Option Hour is selected: "+ isSelectHour);
            System.out.println("Option Qty/Hour is selected: "+ isSelectQtyHour);
        }
        Thread.sleep(1000);
        System.out.println("========================================");
        if(isSelectQty==true)
        {
            String Qty = driver.findElement(By.xpath("//th[@class ='qty']")).getText();
            System.out.println(Qty);
           if(Qty.trim().equals("Qty"))
            {
                System.out.println("Option Qty is selected and Qty column title is shown correctly ");
            }else
                System.out.println("Option Qty is selected and Qty column title is shown wrong ");
        }else
        {
            driver.findElement(By.xpath("//input[@type = 'radio' and @id = '1']")).click();

            String Qty = driver.findElement(By.xpath("//th[@class ='qty']")).getText();
            if(Qty.trim().equals("Qty"))
            {
                System.out.println(Qty);
                System.out.println("Option Qty is selected and Qty column title is shown correctly ");
            }else
            {
                System.out.println(Qty);
                System.out.println("Option Qty is selected and Qty column title is shown wrong ");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Radio_Checkbox auto = new Radio_Checkbox();
        auto.driver.manage().window().maximize();
        auto.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1. Handle signle checkbox
        //auto.handleSigleCheckbox();
        // 2. Handle mutiple checkboxes
        /*auto.driver.get("https://crm.anhtester.com/admin/authentication");
        auto.LoginCRM();
        auto.HandleMultipleCheckboxes();*/
        //3 HandleRadio
        auto.driver.get("https://crm.anhtester.com/admin/authentication");
        auto.LoginCRM();
        auto.HandleRadio();
        Thread.sleep(3000);
        auto.driver.quit();
    }
}
