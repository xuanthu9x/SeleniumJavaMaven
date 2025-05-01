package baiTapGetLocator;

public class xPathCustomerPage {
    public static String menuCustomerPage = "//span[normalize-space()='Customers']";
    public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomer = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[contains(@href,'all_contacts')]";
    public static String headerCustomersPage = "//span[normalize-space() = 'Customers Summary']";
    public static String inputSearch = "//div[@id='clients_filter']//input[@type = 'search']";
    public static String iconSearch = "//div[@id='clients_filter']//span[contains(@class, 'fa-search')]";

    String labelTotalCustomers = "//span[normalize-space() = 'Total Customers']";
    String numberTotalCustomers = "//span[normalize-space() = 'Total Customers']/preceding-sibling::span";
    String labelActiveCustomers = "//span[normalize-space() = 'Active Customers']";
    String numberActiveCustomers = "//span[normalize-space() = 'Active Customers']/preceding-sibling::span";
    String labelInactiveCustomer = "//span[normalize-space()='Inactive Customers']";
    String numberInactiveCustomers = "//span[normalize-space()='Inactive Customers']/preceding-sibling::span";
    String labelActiveContacts = "//span[normalize-space()='Active Contacts']";
    String numberActiveContacts = "//span[normalize-space()='Active Contacts']/preceding-sibling::span";
    String labelInactiveContacts = "//span[normalize-space()='Inactive Contacts']";
    String numberInactiveContacts = "//span[normalize-space()='Inactive Contacts']/preceding-sibling::span";
    String labelContactsLoggedInToday = "//span[normalize-space()='Contacts Logged In Today']";
    String numberContractsLoggedInToday = "/span[normalize-space()='Inactive Contacts']/preceding-sibling::span";


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
    public static String dropdwonDefaultLanguage = "//button[@data-id ='default_language']";
    public static String inputAddress = "//textarea[@id= 'address']";
    public static String inputCity = "//input[@id= 'city']";
    public static String inputState = "//input[@id= 'state']";
    public static String inputZipCode = "//input[@id= 'zip']";
    public static String dropdownCountry = "//button[@data-id ='country']";
    public static String inputSearchCountry = "//button[@data-id ='country']/following-sibling::div//input[@type = 'search']";
    public static String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact'])]";
    public static String buttonOnlySave = "//button[contains(@class, 'only-save')]";

}
