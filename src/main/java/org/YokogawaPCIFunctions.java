import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class YokogawaPCIFunctions {
    public static void YokogawaPCI() throws InterruptedException, IOException {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver datapci = new ChromeDriver(options);
        datapci.get("https://yef-test.cormsquare.com/Identity/Account/Login");
        datapci.manage().window().maximize();

        //Requester PR Create
        YokogawaPCI.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", datapci);
        YokogawaPCI.Title("Yokogawa - PCI - 01", datapci);
        YokogawaPCI.ShipToYokogawa(datapci);
        YokogawaPCI.Project("E213991B00", datapci);
        YokogawaPCI.WBS("J11PJTH34", datapci);
        YokogawaPCI.Checker("checker@cormsquare.com", datapci);
        YokogawaPCI.ShippingAddress(datapci);
        YokogawaPCI.ExpectedPOIssue(datapci);
        YokogawaPCI.ExpectedDelivery(datapci);
        YokogawaPCI.TCAS(datapci);
        YokogawaPCI.TCASNumber(63728, datapci);
        YokogawaPCI.TCASFile(datapci);
        YokogawaPCI.PCIFile("C:\\Users\\Abhijith\\Downloads\\ImportRequisitionYokogawaPOCPCIItems.xlsx", datapci);
        YokogawaPCI.Notes("Requisition Notes and Attachments", datapci);
        YokogawaPCI.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", datapci);

        //Checker PR Approve
        YokogawaPCI.CheckerLogin("checker@cormsquare.com","Admin@123", datapci);
        YokogawaPCI.CheckerApprove(datapci);

        //Requester POR Create
        YokogawaPCI.RequesterLogin("requester@cormsquare.com", "Admin@123", datapci);
        YokogawaPCI.RequesterCreatePOR(datapci);
        YokogawaPCI.Subtotal(2000, datapci);
        YokogawaPCI.StandardTF(100, datapci);
        YokogawaPCI.SSTPDiscount(10, datapci);
        YokogawaPCI.Instructions("Additional Terms and Conditions/Special Instructions - POR", datapci);
        YokogawaPCI.PORNotes("Purchase Order Notes and Attachments", datapci);
        YokogawaPCI.PORAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.jpg", datapci);

    }
}

