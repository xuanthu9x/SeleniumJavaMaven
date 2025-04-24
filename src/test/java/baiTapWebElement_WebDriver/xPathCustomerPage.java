package baiTapWebElement_WebDriver;

public class xPathCustomerPage {
    String iconHideMenu = "//div[contains(@class, 'hide-menu')]";
    String inputSearch = "//input[@id= 'search_input']";
    String iconSearch = "//div[@id= 'top_search_button']/button/i";
    String iconQuickCreate = "//div[@id= 'top_search']/following-sibling::ul/li/a";
    String buttonAddNewCustomer = "//div[@class = '_buttons']/a[1]";
    String buttonImportCustomer = "//div[@class = '_buttons']/a[2]";
    String buttonContacts = "//div[@class = '_buttons']/a[3]";
    String titleCustomersSummary = "//span[normalize-space() = 'Customers Summary']";
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

    String dropdownPaging = "//select[@name = 'clients_length']";
    String optionPaging10 = "//select[@name = 'clients_length']/option[@value = '10']";
    String optionPaging25 = "//select[@name = 'clients_length']/option[@value = '25']";
    String optionPaging50 = "//select[@name = 'clients_length']/option[@value = '50']";
    String optionPaging100 = "//select[@name = 'clients_length']/option[@value = '100']";
    String optionPagingAll = "//select[@name = 'clients_length']/option[@value = '-1']";
    String buttonExport = "//span[normalize-space() = 'Export']/parent::button";
    String buttonBulkActions = "//span[normalize-space() = 'Bulk Actions']/parent::button";
    String buttonReload = "//button[@data-original-title = 'Reload']";

    String columnTitleCheckbox = "//div[contains(@class , 'mass_select_all_wrap')]/parent::th";
    String columnTitleCustomerId = "//th[@id='th-number']";
    String columnTitleCompany = "//th[@id='th-company']";
    String columnTitlePrimaryEmanil = "//th[@id='th-primary-contact']";
    String columnTitlePhone = "//th[@id='th-phone']";
    String columnTitleActive = "//th[@id = 'th-active']";
    String columnTitleGroups = "//th[@id = 'th-groups']";
    String columnTitleDateCreated = "//th[@id = 'th-date-created']";

    String checkboxRow1 = "//input[@value = '796']/parent::div";
    String customersRow1= "//tbody/tr/td[2]";
    String primaryContactRow1= "//tbody/tr/td[4]";
    String phoneRow1= "//tbody/tr/td[6]";
    String ToggleRow1= "//tbody/tr/td[7]/div[@class = 'onoffswitch']";
    String GroupsValueRow1= "//tbody/tr/td[8]";
    String DateCreatedRow1= "//tbody/tr/td[9]";

    String numberCustomerEachPage = "//div[@id='clients_info']";
    String buttonPrevios = "//li[@id='clients_previous']";
    String buttonNext = "//li[@id='clients_next']";
    String page1 = "//li[@class='paginate_button ']/a[@data-dt-idx = '1']";
    String page2 = "//li[@class='paginate_button ']/a[@data-dt-idx = '2']";
    String page3 = "//li[@class='paginate_button ']/a[@data-dt-idx = '3']";
    String page4 = "//li[@class='paginate_button ']/a[@data-dt-idx = '4']";
    String page5 = "//li[@class='paginate_button ']/a[@data-dt-idx = '5']";
    String centerPages = "//li[@class='paginate_button ']/a[@data-dt-idx = '6']";
    String lastedBoxPage = "//li[@class='paginate_button ']/a[@data-dt-idx = '7']";
    String dropdownAllPage = "//select[@id = 'dt-page-jump-clients']";

    String pagelist = "//select[@id = 'dt-page-jump-clients']/option";

    // Form New Customer - Customer Detail
    String labelCompany = "//label[@for = 'company']";
    String signalRequiredCompanyField = "//div[@app-field-wrapper = 'company']/label//small[@class = 'req text-danger']";
    String inputCompany = "//input[@id = 'company']";
    String labelVatNumber = "//label[@for='vat']";
    String inputVatNumber = "//input[@id = 'vat']";
    String labelPhoneNumber = "//label[@for='phonenumber']";
    String inputPhoneNumber = "//input[@id = 'phonenumber']";
    String labelWebsite = "//label[@for='website']";
    String inputWebsite = "//input[@id = 'website']";
    String labelGroups = "//label[@for='groups_in[]']";
    String dropdownGroups = "//div[@class='filter-option-inner']";
    String arrowInDropdown = "//div[@class = 'filter-option']/following::span";
    String popupSelectGroup = "//div[contains(@class , 'input-group-select')]/div/div/div";
    String searchGroupInPopup = "//div[contains(@class , 'input-group-select')]/div/div/div/input";
    String buttonSelectAll = "//button[contains(@class , 'bs-select-all')]";
    String buttonDeselectAll = "//button[contains(@class , 'bs-deselect-all')]";
    String optionListOfGroups = "//div[contains(@class , 'input-group-select')]/div/div/div/div[3]/ul/li";
    String labelCurrency = "//label[@for = 'default_currency']";
    String iconNote_Tooltip = "//i[@data-toggle= 'tooltip' and contains(@data-title, 'If the customer use other currency')]";
    String dropdownCurrency = "//div[@app-field-wrapper= 'default_currency']/div";
    String arrowInCurrencyDropdown = "//div[@app-field-wrapper= 'default_currency']/div/button/span";
    String selectCurrencyPopup = "//div[@app-field-wrapper= 'default_currency']/div/div";
    String searchCurrencyInPopup = "//div[@app-field-wrapper= 'default_currency']/div/div/div/input";
    String currencyOptionList = "//div[@app-field-wrapper= 'default_currency']/div/div/div/input";
    String labelDefaultLanguage = "//label[@for = 'default_language']";
    String defaultLanguageDropdown = "//label[@for = 'default_language']/following-sibling::div";
    String arrowInLanguageDropdown = "//label[@for = 'default_language']/following-sibling::div/button/span";
    String languageOptionList = "//label[@for = 'default_language']/following-sibling::div/div/div/ul/li";
    String labelAddress = "//label[@for = 'address']";
    String inputAddress = "//textarea[@id= 'address']";
    String labelCity = "//label[@for = 'city']";
    String inputCity = "//input[@id= 'city']";
    String labelState = "//label[@for = 'state']";
    String inputState = "//input[@id= 'state']";
    String labelZipCode = "//label[@for = 'zip']";
    String inputZipCode = "//input[@id= 'zip']";
    String labelCountry = "//label[@for = 'country']";
    String dropdownCountry = "//label[@for = 'country']/following-sibling::div";
    String arrowInCountryDropdown = "//label[@for = 'country']/following-sibling::div/button/span";
    String selectCountryPopup = "//label[@for = 'country']/following-sibling::div/div";
    String searchCountryInPopup = "//label[@for = 'country']/following-sibling::div/div/div/input";
    String countryOptionList = "//label[@for = 'country']/following-sibling::div/div/div[2]/ul/li";
    String buttonSaveAndCreateContact = "//button[contains(@class, 'save-and-add-contact')]";
    String buttonOnlySave = "//button[contains(@class, 'only-save')]";








}
