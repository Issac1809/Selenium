package invoiceCalculationsCatalog;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static invoiceCalculationsCatalog.InvoiceCalculationWithoutAdvAndMilCatalog.invCode;

public class CurrencyExchangeRate {

    public String findCurrency() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://yea-test.cormsquare.com/Identity/Account/Login");
        driver.manage().window().maximize();

//TODO Login Page
        driver.findElement(By.id("Input_Email")).sendKeys("admin@cormsquare.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Input_Password")).sendKeys("Admin@123");
        Thread.sleep(1000);
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);

//TODO Scroll
        WebElement button = driver.findElement(By.xpath("//*[contains(text(), 'Settings')]"));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
        Thread.sleep(2000);

//TODO CurrencyExchangeRate
        driver.findElement(By.xpath("//*[contains(text(), 'Currency Exchange Rate')]")).click();
        Thread.sleep(1000);
//TODO EntriesDropDown
        WebElement dropdown = driver.findElement(By.name("tableCurrencyExchangeRate_length"));
        Select number = new Select(dropdown);
        number.selectByIndex(3);

//TODO SearchBoxCurrencyCode
        String invoiceCurrencyCode = invCode;
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@type,'search')]")).click();
        driver.findElement(By.xpath("//input[contains(@type,'search')]")).sendKeys(invoiceCurrencyCode);

        looping(driver, invCode);
        return invoiceCurrencyCode;
    }

    public static double looping(WebDriver driver, String invoiceCurrencyCode) {
        List<WebElement> currencyExchangeTable = driver.findElements(By.xpath("//table[@id='tableCurrencyExchangeRate']"));
        double exchangeRate = 0;
        for (WebElement tableRows : currencyExchangeTable) {
            List<WebElement> rows = tableRows.findElements(By.tagName("tr"));
            for (WebElement tableColumns : rows) {
                List<WebElement> columns = tableColumns.findElements(By.tagName("td"));
                for (int i = 0; i < columns.size(); i++) {
                    String fromCode = "";
                    String toCode = "";
                    if (i == 1) {
                        fromCode = columns.get(i).getText();
                    }
                    if (i == 2) {
                        toCode = columns.get(i).getText();
                    }
                    if (fromCode.equals(invoiceCurrencyCode) && toCode.equals("SGD")) {
                        for (i = 0; i <= columns.size(); i++) {
                            if (i == 3) {
                                exchangeRate = Double.parseDouble(columns.get(i).getText());
                                System.out.println("Exchange Rate act: " + exchangeRate);
                            }
                        }
                    }
                }
            }
        }
        return exchangeRate;
    }
}

