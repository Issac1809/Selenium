package requisition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CatalogPRFunctions {
    public static void Catalog() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver CatalogDriver = new ChromeDriver(options);
        CatalogDriver.get("https://yef-test.cormsquare.com/Identity/Account/Login");
        CatalogDriver.manage().window().maximize();

        String TRNTitle = "Catalog - 09";

        //Requester PR Create
        Catalog.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", CatalogDriver);
        Catalog.Title(TRNTitle, CatalogDriver);
        Catalog.ShipToYokogawa(CatalogDriver);
        Catalog.Project("E143232Q00", CatalogDriver);
        Catalog.WBS("WB3626", CatalogDriver);
        Catalog.Vendor("Alpha Limited", CatalogDriver);
        Catalog.RateContract("Alpha Rate Contract", CatalogDriver);
        Catalog.ShippingAddress(CatalogDriver);
        Catalog.ShippingMode("Air", CatalogDriver);
        Catalog.ExpectedPOIssue(CatalogDriver);
        Catalog.ExpectedDelivery(CatalogDriver);
        Catalog.InspectionRequired(CatalogDriver);
        Catalog.Checker("checker@cormsquare.com", CatalogDriver);
//        Catalog.TCAS(CatalogDriver);
//        Catalog.TCASNumber(63728, CatalogDriver);
//        Catalog.TCASFile(CatalogDriver);
        Catalog.AddLineRequisitionItems("Access Control System", "Cabinet with Smart Card Access", 150, CatalogDriver);
        Catalog.Notes("Requisition Notes and Attachments", CatalogDriver);
        Catalog.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", CatalogDriver);
    }
}
