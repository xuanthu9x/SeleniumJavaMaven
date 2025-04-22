package baiTapGetLocator;

public class xPathLoginPage {
    String titleLogin = "//h1[normalize-space() = 'Login']";
    String logoLogin = "//a[contains(@class , 'logo')]";
    String labelEmail = "//label[@for = 'email']";
    String inputEmail = "//input[@id = 'email']";
    String labelPassword = "//label[@for ='password']";
    String inputPassword = "//input[@id ='password']";
    String checkboxRemember = "//input[@id = 'remember']";
    String lableRemember = "//label[@for = 'remember']";
    String buttonLogin = "//button[@type = 'submit']";
    String linkForgotPw = "//a[normalize-space() = 'Forgot Password?']";
    String validateWrongEmailPw = "//div[contains(@class, 'alert-danger') and normalize-space() = 'Invalid email or password']";
    String validateBlankPassword = "//div[contains(@class, 'alert-danger') and normalize-space() = 'The Password field is required.']";
    String validateBlankEmail = "//div[contains(@class, 'alert-danger') and normalize-space() = 'The Email Address field is required.']";
}
