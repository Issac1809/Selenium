package porCalculationsNonCatalog;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class PORCalculationWithoutAdvAndMilNonCatalog {

    static String transactionTitle = "POC Non-Catalog - 331";
    static int rfqItemLength;
    public static void PORCalculationsCreate() throws InterruptedException {

        String mailId = "buyer@cormsquare.com";
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

        rfqTransaction(driver);
        looping(driver);
    }
    public static void rfqTransaction(WebDriver driver) throws InterruptedException {

//TODO NavigationBar
        driver.findElement(By.xpath("//*[contains(text(), 'Request For Quotations')]")).click();

//TODO  SearchBar
        WebElement TRN = driver.findElement(By.id("txtSearchRequestForQuotation"));
        TRN.sendKeys(transactionTitle);
        TRN.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

//TODO  TransactionName
        driver.findElement(By.xpath("//*[contains(text(), '" + transactionTitle + "')]")).click();
        Thread.sleep(1000);

        List<WebElement> rfqItems = driver.findElement(By.id("items-container")).findElements(By.tagName("tr"));
        int rfqItemLength = rfqItems.toArray().length;
        System.out.println("Number of RFQ Items: " + rfqItemLength);

//TODO ScrollDown
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,1500)", "");

//TODO  CreatePOR
        driver.findElement(By.xpath("//*[contains(text(), ' Create POR')]")).click();
        Thread.sleep(1000);

//TODO ScrollDown
        JavascriptExecutor scrollDown1 = (JavascriptExecutor) driver;
        scrollDown1.executeScript("window.scrollBy(0,2500)", "");
        Thread.sleep(2000);
    }
    public static void looping(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("rfqVendorDetails"));
        List<WebElement> porItems = driver.findElement(By.id("itemsContainer")).findElements(By.tagName("tr"));
        int porItemsLength = porItems.toArray().length;
        if (rfqItemLength <= porItemsLength){
            for (int i = 1; i <= porItemsLength; i++){
                driver.findElement(By.id("quantity-" + i)).getText();
                driver.findElement(By.id("rate-" + i)).getText();
                driver.findElement(By.id("amount-" + i)).getText();
//TODO MethodNames
                double rateValue = rate(driver);
                int quantityValue = quantity(driver);
                subTotal(driver);
                taxCode(driver);
                totalGST(driver);
                double calculatedSubTotal = calculatedSubTotal(rateValue, quantityValue);
                int gstPercentage = gst(driver);
                calculatedTotalGST(calculatedSubTotal, gstPercentage);
                total(driver);
                double gstCalculation = calculatedTotalGST(calculatedSubTotal, gstPercentage);
                calculatedTotal(calculatedSubTotal, gstCalculation);
            }
        }
    }
    public static double rate(WebDriver driver) throws InterruptedException {
        int i = 1;
        String rate = driver.findElement(By.id("rate-" + i)).getText();
        double rateValue = Double.parseDouble(rate);
        System.out.println("Rate: " + rateValue);
        Thread.sleep(1000);
        return rateValue;
    }
    public static int quantity(WebDriver driver) throws InterruptedException {
        int i = 1;
        String quantity = driver.findElement(By.id("quantity-" + i)).getAttribute("value");
        int quantityValue = Integer.parseInt(quantity);
        System.out.println("Quantity: " + quantityValue);
        Thread.sleep(1000);
        return quantityValue;
    }
    public static void subTotal(WebDriver driver){
        String subTotal = driver.findElement(By.id("subtotalId")).getText();
        subTotal = subTotal.replaceAll("[^\\d.]", "");
        double subTotalValue = Double.parseDouble(subTotal);

        System.out.println("Sub-Total: " + subTotalValue);
    }
    public static double calculatedSubTotal(double rateValue, int quantityValue) {
        double calculatedsubtotal = rateValue * quantityValue;
        System.out.println("Calculated Sub-Total: " + calculatedsubtotal);
        return calculatedsubtotal;
    }
    public static void taxCode(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-taxCodeId-container")).click();
        Thread.sleep(2000);
        WebElement results = driver.findElement(By.id("select2-taxCodeId-results"));
        results.findElement(By.xpath("//li[contains(text(), 'PF-7% Foreign currency standard rate purchase')]")).click();
    }
    public static int gst(WebDriver driver){
        String gstValue = driver.findElement(By.id("gstId")).getAttribute("value");
        int gstPercentage = Integer.parseInt(gstValue);
        System.out.println("GST: " + gstPercentage);
        return gstPercentage;
    }
    public static void totalGST(WebDriver driver){
        String gst = driver.findElement(By.id("totalGstId")).getText();
        gst = gst.replaceAll("[^\\d.]", "");
        double totalGST = Double.parseDouble(gst);
        System.out.println("Total GST: " + totalGST);
    }
    public static double calculatedTotalGST(double calculatedSubTotal, int gstPercentage){
        double gstCalculation = calculatedSubTotal * gstPercentage / 100;
        System.out.println("Calculated Total GST: " + gstCalculation);
        return gstCalculation;
    }
    public static void total(WebDriver driver){
        String total = driver.findElement(By.id("totalId")).getText();
        total = total.replaceAll("[^\\d.]", "");
        double totalValue = Double.parseDouble(total);
        System.out.println("Total: " + totalValue);
    }
    public static void calculatedTotal(double calculatedSubTotal, double gstCalculation){
        System.out.println(calculatedSubTotal);
        System.out.println(gstCalculation);
        double calculatedTotal = calculatedSubTotal + gstCalculation;
        System.out.println("Calculated Total: " + calculatedTotal);
    }
}
