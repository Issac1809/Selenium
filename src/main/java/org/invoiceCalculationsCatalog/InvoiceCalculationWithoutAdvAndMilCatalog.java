package invoiceCalculationsCatalog;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static invoiceCalculationsCatalog.CurrencyExchangeRate.looping;


public class InvoiceCalculationWithoutAdvAndMilCatalog {

    static String poNumber = "5K0023PO02369";
    static String invoiceType = "Purchase Order";
    static String invoiceNumber = "INV-PO-2181";
    static String invCode = "";
    static int USD = 2;
    static int EUR = 3;
    static int INR = 4;

    public void invoiceCalculationsCreate() throws InterruptedException {

        String mailId = "usa2@cormsquare.com";
        String password = "Admin@123";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://yea-test.cormsquare.com/Identity/Account/Login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

//TODO  LoginPage
        driver.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        driver.findElement(By.id("Input_Password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);

        invoiceCreate(driver);
        invoiceTypes(driver);
        invoiceNumber(driver);
        invoiceDate(driver);
        invoicePONumber(driver);
        invCode = currencyCode(driver);
        exchangeRate();
        invoiceItems(driver, currencyCode(driver));
    }
    public static void invoiceCreate(WebDriver driver) throws InterruptedException {
//TODO NavigationBar
        driver.findElement(By.xpath("//*[contains(text(), 'Invoices')]")).click();

//TODO CreateInvoiceButton
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
    }
    public static void invoiceTypes(WebDriver driver) {
//TODO InvoiceTypes
        driver.findElement(By.id("select2-typeId-container")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys(invoiceType);
        driver.findElement(By.xpath("//li[contains(text(), 'Purchase Order')]")).click();
    }
    public static void invoiceNumber(WebDriver driver) throws InterruptedException {
//TODO InvoiceNumber
        driver.findElement(By.id("invoiceNumber")).sendKeys(invoiceNumber);
        Thread.sleep(2000);
    }
    public static void invoiceDate(WebDriver driver) throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[1]/div[2]/div/div[1]/div[3]/input[2]")).click();
//        Thread.sleep(2000);
//TODO PresentDate
//        List<WebElement> currentDate = driver.findElements(By.className("dayContainer"));
//        for (WebElement date : currentDate) {
//            String ariaCurrent = date.getAttribute("aria-current");
//            if (ariaCurrent != null && ariaCurrent.equals("date")) {
//                date.click();
//                break;
//            }
//        }
//TODO ScrollDown
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
    }
    public void invoicePONumber(WebDriver driver) throws InterruptedException {
//TODO PurchaseOrder
        driver.findElement(By.id("select2-poId-container")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys(poNumber);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]")).click();
        Thread.sleep(2000);
    }
    public String currencyCode(WebDriver driver){
//TODO CurrencyCode
        String currencyCode = driver.findElement(By.id("currencyCode")).getText();
        System.out.println(currencyCode);
        return currencyCode;
    }
    public void exchangeRate() throws InterruptedException {
//TODO CurrencyExchangeRate
        CurrencyExchangeRate currencyExchangeClass = new CurrencyExchangeRate();
        currencyExchangeClass.findCurrency();
    }
    public static void invoiceItems(WebDriver driver, String currencyCode) throws InterruptedException {
//TODO ScrollDown
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,700)", "");Thread.sleep(2000);

        double exchangeRateValue = looping(driver, invCode);

        WebElement sgdEquivalent = driver.findElement(By.xpath("//h4[contains(text(), 'SGD Equivalent for GST Purpose')]"));
//TODO WithSGDEquivalentCalculation
        if(sgdEquivalent.isEnabled()){
//TODO VendorSubTotal
            String vendorInvoiceSubTotal = driver.findElement(By.id(currencyCode + "subtotal")).getText();
            vendorInvoiceSubTotal = vendorInvoiceSubTotal.replaceAll("[^\\d.]", "");
            double getSubTotalValue = Double.parseDouble(vendorInvoiceSubTotal);
            System.out.println("Vendor Sub-Total: " + getSubTotalValue);
//TODO SGDEquivalentSubTotalCalculation
            System.out.println("NA" + exchangeRateValue);
            double equivalentCalculation = exchangeRateValue * getSubTotalValue;
            System.out.println(equivalentCalculation);
            driver.findElement(By.id("SGDsubtotalInput")).sendKeys(String.valueOf(equivalentCalculation));
            System.out.println("Calculated Vendor Sub-Total: " + equivalentCalculation);
//TODO CurrencyExchangeRate
            String currencyExchangeRateValue = driver.findElement(By.id("currencyExchangeRateId")).getAttribute("value");
            System.out.println("Currency Exchange Rate: " + currencyExchangeRateValue);
//TODO CurrencyExchangeRateCalculation
            double currencyExchangeRateValueCalculation = getSubTotalValue / equivalentCalculation;
            System.out.println("Calculated Currency Exchange Rate: " + currencyExchangeRateValueCalculation);
//TODO VendorTotalGST
            String vendorInvoiceTotalGST = driver.findElement(By.id(exchangeRateValue + "totalGST")).getText();
            vendorInvoiceTotalGST = vendorInvoiceTotalGST.replaceAll("[^\\d.]", "");
            double getTotalGSTValue = Double.parseDouble(vendorInvoiceTotalGST);
            System.out.println("Vendor Total GST: " + getTotalGSTValue);
//TODO VendorTotalGSTCalculation
            double currencyExchangeTotalGSTCalculation = getSubTotalValue * getTotalGSTValue;
            System.out.println("Calculated Vendor Total GST Calculation: " + currencyExchangeTotalGSTCalculation);
//TODO VendorGSTPercentage
            int gstPercentageVendor = Integer.parseInt(driver.findElement(By.id("SGDgstId")).getText());
            System.out.println("Vendor GST Percentage: " + gstPercentageVendor);
//TODO SGDEquivalentGSTPercentage
            int gstPercentage = Integer.parseInt(driver.findElement(By.id(currencyCode + "gstId")).getText());
            System.out.println("SGD Equivalent GST Percentage: " + gstPercentage);
//TODO SGDEquivalentTotalGSTCalculation
            double currencyExchangeTotalGSTPercentageCalculation = getTotalGSTValue * gstPercentage;
            System.out.println("Calculated SGD Equivalent Total GST: " + currencyExchangeTotalGSTPercentageCalculation);
//TODO SGDEquivalentTotalGSTCalculation
            double SGDEquivalentTotalGSTCalculation = currencyExchangeRateValueCalculation * currencyExchangeTotalGSTCalculation;
            if (currencyCode.equals("USD")) {
                System.out.println("USD: " + SGDEquivalentTotalGSTCalculation);
            }
            if (currencyCode.equals("EUR")) {
                System.out.println("EUR: " + SGDEquivalentTotalGSTCalculation);
            }
            if (currencyCode.equals("INR")) {
                System.out.println("INR: " + SGDEquivalentTotalGSTCalculation);
            }
            System.out.println("Calculated SGD Equivalent Total GST: " + SGDEquivalentTotalGSTCalculation);
        }
//TODO WithoutSGDEquivalentCalculation
        else{
            WebElement sgdEquivalent1 = driver.findElement(By.xpath("//h4[contains(text(), 'SGD Equivalent for GST Purpose')]"));
            String vendorInvoiceSubTotal1 = sgdEquivalent1.getText();
            vendorInvoiceSubTotal1 = vendorInvoiceSubTotal1.replaceAll("[^\\d.]", "");
            double getSubTotalValue1 = Double.parseDouble(vendorInvoiceSubTotal1);

        }
    }
}
