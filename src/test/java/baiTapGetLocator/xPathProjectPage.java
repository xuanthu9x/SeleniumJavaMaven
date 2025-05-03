package baiTapGetLocator;

public class xPathProjectPage {
    public static String menuProject = "//span[normalize-space()='Projects']";
    public static String buttonAddProject = "//a[normalize-space() = 'New Project' ]";
    public static String inputSearchProject = "//div[@id = 'projects_filter']//input[@type = 'search']";
    public static String iconSearchProject = "//div[@id = 'projects_filter']//span[contains(@class, 'fa-search')]";
    // New project form
    public static String inputProjectName = "//input[@id = 'name']";
    public static String dropdownCustomer = "//button[@data-id = 'clientid']";
    public static String inputSearchCustomer = "//button[@data-id = 'clientid']/following-sibling::div//input";
    public static String checkboxProgress = "//input[@id = 'progress_from_tasks']";
    public static String progressBar = "//input[@name = 'progress']/following-sibling::div[contains(@class, 'project_progress')]";
    public static String dropdownBillingType = "//button[@data-id = 'billing_type']";
    public static String dropdownStatus = "//button[@data-id = 'status']";
    public static String inputRatePerHour = "//input[@id= 'project_rate_per_hour']";
    public static String inputEstHour="//input[@id= 'estimated_hours']";
    public static String dropdownMember = "//button[contains(@data-id , 'project_members')]";
    public static String inputSearchMember = "//button[contains(@data-id , 'project_members')]/following-sibling::div//input[@type = 'search']";
    public static String buttonSelectAllMember = "//button[contains(@data-id , 'project_members')]/following-sibling::div//button[contains(@class, 'bs-select-all')]";
    public static String buttonDeselectAllMember = "//button[contains(@data-id , 'project_members')]/following-sibling::div//button[contains(@class, 'bs-deselect-all')]";
    public static String inputStartDate = "//input[@id= 'start_date']";
    public static String buttonPrevInCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[1]//div[@class = 'xdsoft_monthpicker']//button[@class = 'xdsoft_prev']";
    public static String buttonTodayInCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[1]//div[@class = 'xdsoft_monthpicker']//button[@class = 'xdsoft_today_button']";
    public static String buttonNextInCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[1]//div[@class = 'xdsoft_monthpicker']//button[@class = 'xdsoft_next']";
    public static String dropdownMonthStartDate = "//div[@id= 'four_english_extension_modal']/following-sibling::div[1]//div[@class = 'xdsoft_monthpicker']/div[contains(@class ,'xdsoft_month')]";
    public static String dropdownYearStartDate = "//div[@id= 'four_english_extension_modal']/following-sibling::div[1]//div[@class = 'xdsoft_monthpicker']/div[contains(@class ,'xdsoft_year')]";
    public static String inputDeadline = "//input[@id = 'deadline']";
    public static String iconCalendarDeadline = "//div[@app-field-wrapper= 'deadline']/div/div/i";
    public static String prevButtonDeadlineCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[2]//div[@class = 'xdsoft_monthpicker']//button[@class = 'xdsoft_prev']";
    public static String todayButtonDeadlineCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[2]//div[@class = 'xdsoft_monthpicker']//button[@class = 'xdsoft_today_button']";
    public static String nextButtonDeadlineCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[2]//div[@class = 'xdsoft_monthpicker']//button[@class = 'xdsoft_next']";
    public static String monthDropdownDeadlineCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[2]//div[@class = 'xdsoft_monthpicker']/div[contains(@class ,'xdsoft_month')]";
    public static String yearDropdownDeadlineCalendar = "//div[@id= 'four_english_extension_modal']/following-sibling::div[2]//div[@class = 'xdsoft_monthpicker']/div[contains(@class ,'xdsoft_year')]";
    public static String inputTag ="//label[@for = 'tags']/following-sibling::ul//input[@placeholder = 'Tag']";
    public static String inputDescription = "//textarea[@id= 'description']";
    public static String checkboxSendEmail = "//input[@id= 'send_created_email']";
    public static String buttonSave = "//button[@type= 'submit' and normalize-space() = 'Save']";
    public static String BlankProjectNameError = "//p[@id = 'name-error']";
    public static String BlankCustomerError= "//p[@id = 'clientid-error']";

}


