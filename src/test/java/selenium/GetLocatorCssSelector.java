package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetLocatorCssSelector {
    // Get locator Login page by CSS selector
    // Cách 1 CSS tag và ID (css=tag#id)
    public static String inputEmail = "input#email";
    public static String inputPassword = "input#password";
    // Cách 2 Tag and Class (css=tag.class)
    public static String headerLoginPage = "h1.tw-text-2xl.tw-text-neutral-800.text-center.tw-font-semibold.tw-mb-5";
    // Cách 3 Tag and Attribute //css=tag[attribute=value]
    public static String labelEmail = "label[for = 'email']";
    // Cách 4 Tag, Class, and Attribute
    //css=tag.class[attribute=value]
    public  static  String labelPassword = "label.control-label[for = 'password']";
    // Cách 5 Sub-String Matches
    //5.1 Starts With (^)
    public static String labelRememberPw = "label[for^='remember']";
    // Cách 5.2  Ends With ($)
    //css=tag[attribute$=ký tự kết thúc của chuỗi]
    public static String checkboxRememberPw = "input[type$='box']";
    // Cách 5.3 Contains (*)
    //css=tag[attribute*='ký tự bất kỳ của chuỗi']
    public  static String buttonLogin = "button[class*='btn-primary']";
    // Cách  6.1 Direct Child
    //parentLocator > childLocator
    public static String hyperlinkForgotPw= "div.form-group>a";
    // Cách 6.2 Sub-child
    //parentLocator childLocator (định vị của thẻ con ngay dưới 1 bậc hoặc thẻ con của con)
    public static String menuCustomer = "#side-menu li.menu-item-customers a";
    //Cách 6.3 nth-child
    //parentLocator child:nth-of-type(?)
    /*parentLocator: định vị của thẻ cha
    child: thẻ con
    ? là số thứ tự của thẻ con(khi so các thẻ con cùng cha với nhau) */
    public static String menuProject = "#side-menu li:nth-of-type(8)";
    //parentLocator child:last-child
    public static String menuReport = "#side-menu li[class^='menu-item']:last-child";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.cssSelector(inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.cssSelector(inputPassword)).sendKeys("123456");
        driver.findElement(By.cssSelector(buttonLogin)).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
