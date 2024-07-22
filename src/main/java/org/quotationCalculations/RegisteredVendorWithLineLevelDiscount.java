package quotationCalculations;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RegisteredVendorWithLineLevelDiscount {
    static String transactionTitle = "IUW Company PV TLTM";
    static double[] rateValues = {2000, 1344.544, 2800, 4500, 700.343, 120};
    static int[] discountValues = {290, 520, 480, 110, 270, 340};
    static int gstPercentage = 28;

    public static void RegisteredVendorQuotationSubmit() throws InterruptedException, IOException {

        String mailId = "yeaindia@cormsquare.com";
        String password = "Admin@123";

        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
//        options.setHeadless(true);
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

//TODO MethodNames
        provideUserInput(driver);
        rfqTransaction(driver);
        looping(driver);

        double rateValue = rate(driver);
        int quantityValue = (int) quantity(driver);
        double total = subTotal(rateValue, quantityValue);
        double discountValue = discount(driver);
        subTotalCalculation(driver, 5, total, discountValue, quantityValue);

        double amountCalculation = amount(driver, total, discountValue, quantityValue);
        double calculatedTotalGSTValue = totalGST(driver, gstPercentage, amountCalculation);
        total(driver, amountCalculation, calculatedTotalGSTValue);
    }

    public static void provideUserInput(WebDriver driver) throws InterruptedException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div/div[3]/form/div[2]/button")).click();
        Thread.sleep(1000);
    }

    public static void rfqTransaction(WebDriver driver) throws InterruptedException {
//TODO  SearchBar
        driver.findElement(By.id("txtRfq")).sendKeys(transactionTitle);
        Thread.sleep(1000);
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(1000);

//TODO  TransactionName
        driver.findElement(By.xpath("//*[contains(text(), '" + transactionTitle + "')]")).click();
        Thread.sleep(1000);

//TODO  SendQuote
        driver.findElement(By.id("btnSendQuote")).click();
        Thread.sleep(1000);

//TODO  ScrollDown
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
    }

    public static void looping(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("rfqVendorDetails"));
        int items = driver.findElement(By.id("rfqVendorItems-container")).findElements(By.tagName("tr")).toArray().length;
        if (items <= rateValues.length) {
            int i;
            for (i = 1; i <= items; i++) {
                driver.findElement(By.id("hsCode-" + i)).sendKeys("1234");
                driver.findElement(By.id("make-" + i)).sendKeys("NA");
                driver.findElement(By.id("model-" + i)).sendKeys("NA");
                driver.findElement(By.id("partNumber-" + i)).sendKeys("NA");
                driver.findElement(By.id("countryOfOrigin-" + i)).sendKeys("NA");
                String rates = String.valueOf(rateValues[i]);
                driver.findElement(By.id("rate-" + i)).sendKeys(rates);
                WebElement discount = driver.findElement(By.id("discount-" + i));
                discount.clear();
                discount.click();
                discount.sendKeys(Integer.toString(discountValues[i]));
//TODO MethodNames
                int quantityValue = (int) quantity(driver);
                double rateValue = rate(driver);
                double discountValue = discount(driver);
                double total = subTotal(rateValue, quantityValue);

                rateAfterDiscount(driver, rateValue, quantityValue);
                amountAfterDiscount(driver, total, discountValue, quantityValue);
            }
        }
    }

    public static double quantity(WebDriver driver) throws InterruptedException {
        int i = 1;
        String quantity = driver.findElement(By.id("quantity-" + i)).getText();
        int quantityValue = Integer.parseInt(quantity);
        System.out.println("Quantity: " + quantityValue);
        Thread.sleep(1000);
        return quantityValue;
    }

    public static double rate(WebDriver driver) throws InterruptedException {
        int i = 1;
        String rate = driver.findElement(By.id("rate-" + i)).getAttribute("value");
        double rateValue = Double.parseDouble(rate);
        System.out.println("Rate: " + rateValue);
        Thread.sleep(1000);
        return rateValue;
    }

    public static int discount(WebDriver driver) throws InterruptedException {
        int i = 1;
        String discount = driver.findElement(By.id("discount-" + i)).getAttribute("value");
        int discountValue = Integer.parseInt(discount);
        System.out.println("Discount: " + discountValue);
        Thread.sleep(1000);
        return discountValue;
    }

    public static void rateAfterDiscount(WebDriver driver, double rateValue, double discountValue) throws InterruptedException {
        int i = 1;
        String rateAfterDiscount = driver.findElement(By.id("rateAfterDiscount-" + i)).getText();
        rateAfterDiscount = rateAfterDiscount.replaceAll("[^\\d.]", "");
        double rateAfterDiscountValue = Double.parseDouble(rateAfterDiscount);
        System.out.println("Rate After Discount: " + rateAfterDiscountValue);
        Thread.sleep(1000);

        double rateAfterDiscountCalculation = rateValue - discountValue;
        System.out.println("Calculated Rate After Discount: " + rateAfterDiscountCalculation);
        Thread.sleep(1000);
    }
    public static double subTotal(double rateValue, int quantityValue) throws InterruptedException {
        ArrayList<Double> amountBeforeDiscountCalculationValue = new ArrayList<>();
        double amountBeforeDiscountCalculation = rateValue * quantityValue;
        amountBeforeDiscountCalculationValue.add(amountBeforeDiscountCalculation);

        double total = 0;
        for (Double amount : amountBeforeDiscountCalculationValue) {
            total += amount;
            System.out.println("Calculated Sub-Total Value:" + total);
            Thread.sleep(1000);
        }
        return total;
    }
    public static void amountAfterDiscount(WebDriver driver, double total, double discountValue, int quantityValue) throws InterruptedException {
        int i = 1;
        String amountAfterDiscount = driver.findElement(By.id("amount-" + i)).getText();
        amountAfterDiscount = amountAfterDiscount.replaceAll("[^\\d.]", "");
        double amountAfterDiscountValue = Double.parseDouble(amountAfterDiscount);
        System.out.println("Amount After Discount: " + amountAfterDiscountValue);
        Thread.sleep(1000);

            double amountAfterDiscountCalculation = total - (discountValue * quantityValue);
            System.out.println("Calculated Amount After Discount: " + amountAfterDiscountCalculation);
            Thread.sleep(1000);
            }
    public static void subTotalCalculation(WebDriver driver, int arrayLength, double total, double discountValue, int quantityValue) throws InterruptedException {
        int i = 1;
        String subTotal = driver.findElement(By.id("subtotalId")).getText();
        subTotal = subTotal.replaceAll("[^\\d.]", "");
        double subTotalValue = Double.parseDouble(subTotal);
        System.out.println("Sub Total: " + subTotalValue);
        Thread.sleep(1000);

        double subTotalCalculation = total - (discountValue * quantityValue);
        if (i <= arrayLength) {
            System.out.println("Calculated Sub Total: " + subTotalCalculation);
            Thread.sleep(1000);
            }
        }
    public static double amount(WebDriver driver, double total, double discountValue, int quantityValue) throws InterruptedException {
        String amount = driver.findElement(By.id("amountId")).getText();
        amount = amount.replaceAll("[^\\d.]", "");
        double totalAmount = Double.parseDouble(amount);
        System.out.println("Amount: " + totalAmount);
        Thread.sleep(1000);

        double amountCalculation = total - (discountValue * quantityValue);
        System.out.println("Calculated Amount: " + amountCalculation);
        Thread.sleep(1000);
        return amountCalculation;
    }
    public static double totalGST(WebDriver driver, int gstPercentage, double amountCalculation) throws InterruptedException {
        driver.findElement(By.id("gstId")).sendKeys(String.valueOf(gstPercentage));
        String totalGST = driver.findElement(By.id("totalGstId")).getText();
        totalGST = totalGST.replaceAll("[^\\d.]", "");
        double totalGSTValues = Double.parseDouble(totalGST);
        System.out.println("Total GST: " + totalGSTValues);
        Thread.sleep(1000);

        double calculatedTotalGSTValue = amountCalculation * gstPercentage / 100;
        System.out.println("Calculated Total GST: " + calculatedTotalGSTValue);
        Thread.sleep(1000);
        return calculatedTotalGSTValue;
    }
    public static void total(WebDriver driver, double amountCalculation, double calculatedTotalGSTValue) throws InterruptedException {
        String total = driver.findElement(By.id("totalId")).getText();
        total = total.replaceAll("[^\\d.]", "");
        double totalAmountValue = Double.parseDouble(total);
        System.out.println("Total: " + totalAmountValue);
        Thread.sleep(1000);

        double calculatedTotalAmountValue = amountCalculation + calculatedTotalGSTValue;
        System.out.println("Calculated Total: " + calculatedTotalAmountValue);
        Thread.sleep(1000);
        }
    }