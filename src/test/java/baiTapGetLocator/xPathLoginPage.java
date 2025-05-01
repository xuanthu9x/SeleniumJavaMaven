package baiTapGetLocator;

public class xPathLoginPage {
    public String url = "https://crm.anhtester.com/admin/authentication";
    public static String headerLoginPage = "//h1[normalize-space() = 'Login']";
    public static String logoLogin = "//a[contains(@class , 'logo')]";
    public static String labelEmail = "//label[@for = 'email']";
    public static String inputEmail = "//input[@id = 'email']";
    public static String labelPassword = "//label[@for ='password']";
    public static String inputPassword = "//input[@id ='password']";
    public static String checkboxRemember = "//input[@id = 'remember']";
    public static String labelRemember = "//label[@for = 'remember']";
    public static String buttonLogin = "//button[@type = 'submit']";
    public static String linkForgotPw = "//a[normalize-space() = 'Forgot Password?']";
    public static String validateWrongEmailPw = "//div[contains(@class, 'alert-danger') and normalize-space() = 'Invalid email or password']";
    public static String validateRequiredPassword = "//div[contains(@class, 'alert-danger') and normalize-space() = 'The Password field is required.']";
    public static String validateRequiredEmail = "//div[contains(@class, 'alert-danger') and normalize-space() = 'The Email Address field is required.']";
}
