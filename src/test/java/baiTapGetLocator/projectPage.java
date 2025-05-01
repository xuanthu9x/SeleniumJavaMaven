package baiTapGetLocator;

public class projectPage {
    String projectMenu = "//ul[@id = 'side-menu']/li[contains(@class, 'menu-item-projects')]";
    String buttonAddProject = "//a[normalize-space() = 'New Project' ]";
    // New project form
    String labelProjectName = "//label[@for = 'name']";
    String iconRequiredProjectName = "//label[@for = 'name']/small";
    String inputProjectName = "//input[@id = 'name']";
    String labelCustomerId = "//label[@for= 'clientid']";
    String iconRequiredCustomer = "//label[@for= 'clientid']/small";
    String dropdownCustomer = "//label[@for= 'clientid']/following-sibling::div";
    String arrowInCustomerDropdown = "//label[@for= 'clientid']/following-sibling::div/button/span";
    String searchCustomerInDropdown = "//label[@for= 'clientid']/following-sibling::div/div/div/input";
    String CustomerList = "//label[@for= 'clientid']/following-sibling::div/div/div[2]/ul";
    String messageUnderSearchCustomer = "//label[@for= 'clientid']/following-sibling::div/div/div[3]";
    String labelBillingType = "//label[@for= 'billing_type']";
    String iconRequiredBillingType = "//label[@for= 'billing_type']/small";
    String dropdownBillingType = "//label[@for= 'billing_type']/following-sibling::div[2]";
    String billingTypeOptions = "//label[@for= 'billing_type']/following-sibling::div[2]/select/option";
    String arrowInBillingTypeDropdown = "//label[@for= 'billing_type']/following-sibling::div[2]/button/span";
    String labelStatus = "//label[@for= 'status']";
    String dropdownStatus = "//label[@for= 'status']/following-sibling::div[2]";
    String StatusOptions = "//label[@for= 'status']/following-sibling::div[2]/div/div/ul/li";
    String lableRatePerHour = "//label[@for= 'project_rate_per_hour']";
    String inputRatePerHour = "//input[@id= 'project_rate_per_hour']";
    String labelEstHour="//label[@for= 'estimated_hours']";
    String inputEstHour="//input[@id= 'estimated_hours']";
    String labelMembers = "//label[@for= 'project_members[]']";
    String dropdownMember = "//label[@for= 'project_members[]']/following-sibling::div";
    String searchMemberInDropdown = "//label[@for= 'project_members[]']/following-sibling::div/div/div/input";
    String memberOption = "//label[@for= 'project_members[]']/following-sibling::div/div/div[3]/ul/li";
    String buttonSelectAllMember = "//label[@for= 'project_members[]']/following-sibling::div/div/div[2]/div/button[contains(@class, 'bs-select-all')]";
    String buttonDeselectAllMember = "//label[@for= 'project_members[]']/following-sibling::div/div/div[2]/div/button[contains(@class, 'bs-deselect-all')]";
    String labelStartDate = "//label[@for= 'start_date']";
    String inputStartDate = "//input[@id= 'start_date']";
    String iconCalendar = "//i[contains(@class,  'calendar-icon')]";
    String buttonPrevInCalendar = "//div[@class = 'xdsoft_monthpicker']/button[@class =  'xdsoft_prev']";
    String buttonTodayInCalendar = "//div[@class = 'xdsoft_monthpicker']/button[@class =  'xdsoft_today_button']";
    String buttonNextInCalendar = "//div[@class = 'xdsoft_monthpicker']/button[@class =  'xdsoft_next']";
    String dropdownMonth = "//div[contains(@class , 'xdsoft_label xdsoft_month')]";
    String textMonth = "//div[contains(@class , 'xdsoft_label xdsoft_month')]/span";
    String monthOptions = "//div[contains(@class , 'xdsoft_label xdsoft_month')]/div/div/div";
    String scrollbarMonth = "//div[contains(@class , 'xdsoft_label xdsoft_month')]/div/div[2]";
    String dropdownYear = "//div[@class = 'xdsoft_label xdsoft_year']";
    String textYear = "//div[@class = 'xdsoft_label xdsoft_year']/span";
    String yearOptions = "//div[@class = 'xdsoft_label xdsoft_year']/div/div/div";
    String scrollbarYear = "//div[@class = 'xdsoft_label xdsoft_year']/div/div[2]";
    String labelDeadline = "//label[@for = 'deadline']";
    String inputDeadline = "//input[@id = 'deadline']";
    String iconCalendarDeadline = "//div[@app-field-wrapper= 'deadline']/div/div/i";
    String prevButtonDeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/button[@class = 'xdsoft_prev']";
    String todayButtonDeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/button[@class = 'xdsoft_today_button']";
    String nextButtonDeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/button[@class = 'xdsoft_next']";
    String monthDropdownDeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_month']";
    String textMonth_DeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_month']/span";
    String monthOptions_DeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_month']/div/div/div";
    String scroolbar_Month_DeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_month']/div/div[2]";
    String yearDropdown_DeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_year']";
    String textYear_DeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_year']/span";
    String yearOptions_DeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_year']/div/div/div";
    String scrollbarYear_DeadlineCalendar = "//span[@id ='PING_IFRAME_FORM_DETECTION']/following::div/div/div/div[@class = 'xdsoft_label xdsoft_year']/div/div[2]";
    String labelTags = "//label[@for ='tags']";
    String iconTag = "//label[@for ='tags']/i";
    String tagList = "//label[@for ='tags']/following::ul/li";
    String labelDesciption = "//p[text() = 'Description']";
    String inputDescription = "//textarea[@id= 'description']";
    String labelSendEmail = "//label[@for= 'send_created_email']";
    String checkboxSendEmail = "//input[@id= 'send_created_email']";
    String buttonSave = "//button[@type= 'submit' and normalize-space() = 'Save']";
    String BlankProjectNameError = "//p[@id = 'name-error']";
    String BlankCustomerError= "//p[@id = 'clientid-error']";

    public static class xPathCustomerPage {
        // Locator Customer page
        public static String menuCustomer = "//span[normalize-space()='Customers' and @class = 'menu-text' ]";
        public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
        public static String buttonImportCustomer = "///a[normalize-space()='Import Customers']";
        public static String buttonContacts = "//a[normalize-space()='Contacts' and contains(@href,'all_contacts')]";
        public static String headerCustomersPage = "//span[normalize-space() = 'Customers Summary']";

        public static String inputSearch ="//div[@id = 'clients_filter']//input[@type = 'search']";
        public static String iconSearch = "//div[@id = 'clients_filter']//span[contains(@class, 'fa-search')]";
        public static String labelTotalCustomers = "//span[normalize-space() = 'Total Customers']";
        public static String numberTotalCustomers = "//span[normalize-space() = 'Total Customers']/preceding-sibling::span";
        public static String labelActiveCustomers = "//span[normalize-space() = 'Active Customers']";
        public static String numberActiveCustomers = "//span[normalize-space() = 'Active Customers']/preceding-sibling::span";
        public static String labelInactiveCustomer = "//span[normalize-space()='Inactive Customers']";
        public static String numberInactiveCustomers = "//span[normalize-space()='Inactive Customers']/preceding-sibling::span";
        public static String labelActiveContacts = "//span[normalize-space()='Active Contacts']";
        public static String numberActiveContacts = "//span[normalize-space()='Active Contacts']/preceding-sibling::span";
        public static String labelInactiveContacts = "//span[normalize-space()='Inactive Contacts']";
        public static String numberInactiveContacts = "//span[normalize-space()='Inactive Contacts']/preceding-sibling::span";
        public static String labelContactsLoggedInToday = "//span[normalize-space()='Contacts Logged In Today']";
        public static String numberContractsLoggedInToday = "/span[normalize-space()='Inactive Contacts']/preceding-sibling::span";

        public static String columnTitleCheckbox = "//div[contains(@class , 'mass_select_all_wrap')]/parent::th";
        public static String columnTitleCustomerId = "//th[@id='th-number']";
        public static String columnTitleCompany = "//th[@id='th-company']";
        public static String columnTitlePrimaryEmanil = "//th[@id='th-primary-contact']";
        public static String columnTitlePhone = "//th[@id='th-phone']";
        public static String columnTitleActive = "//th[@id = 'th-active']";
        public static String columnTitleGroups = "//th[@id = 'th-groups']";
        public static String columnTitleDateCreated = "//th[@id = 'th-date-created']";

        // Form New Customer - Customer Detail

        public static String inputCompany = "//input[@id = 'company']";
        public static String inputVatNumber = "//input[@id = 'vat']";
        public static String inputPhoneNumber = "//input[@id = 'phonenumber']";
        public static String inputWebsite = "//input[@id = 'website']";
        public static String dropdownGroups = "//button[contains(@data-id, 'groups_in')]";
        public static String inputSearchGroup = "//button[contains(@data-id, 'groups_in')]/following-sibling::div//input[@type = 'search']";
        public static String buttonSelectAll = "//button[contains(@class , 'bs-select-all')]";
        public static String buttonDeselectAll = "//button[contains(@class , 'bs-deselect-all')]";
        public static String dropdownCurrency = "//button[@data-id ='default_currency']";
        public static String inputSearchCurrency = "//button[@data-id ='default_currency']/following-sibling::div//input[@type = 'search']";
        public static String dropdownDefaultLanguage = "//button[@data-id ='default_language']";
        public static String inputAddress = "//textarea[@id= 'address']";
        public static String inputCity = "//input[@id= 'city']";
        public static String inputState = "//input[@id= 'state']";
        public static String inputZipCode = "//input[@id= 'zip']";
        public static String dropdownCountry = "//button[@data-id ='country']";
        public static String inputSearchCountry = "//button[@data-id ='country']/following-sibling::div//input[@type = 'search']";
        public static String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact']";
        public static String buttonOnlySave = "//button[normalize-space()='Save and create contact']/following-sibling::button[normalize-space()='Save']";

    }
}


