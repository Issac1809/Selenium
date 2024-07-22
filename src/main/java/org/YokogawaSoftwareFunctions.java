import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class YokogawaSoftwareFunctions {
    public static void YokogawaSoftware() throws InterruptedException, IOException {

        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver datasw = new ChromeDriver(options);
        datasw.get("https://yef-test.cormsquare.com/Identity/Account/Login");
        datasw.manage().window().maximize();

        //Requester PR Create
        YokogawaSoftware.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", datasw);
        YokogawaSoftware.Title("Yokogawa - SW - 01", datasw);
        YokogawaSoftware.ShipToYokogawa(datasw);
        YokogawaSoftware.Project("E213991B00", datasw);
        YokogawaSoftware.WBS("J11PJTH34", datasw);
        YokogawaSoftware.Checker("checker@cormsquare.com", datasw);
        YokogawaSoftware.ShippingAddress(datasw);
        YokogawaSoftware.ExpectedPOIssue(datasw);
        YokogawaSoftware.ExpectedDelivery(datasw);
        YokogawaSoftware.TCAS(datasw);
        YokogawaSoftware.TCASNumber(63728, datasw);
        YokogawaSoftware.TCASFile(datasw);
        YokogawaSoftware.SWFile("C:\\Users\\Abhijith\\Downloads\\ImportRequisitionYokogawaPOCSWItems.xlsx", datasw);
        YokogawaSoftware.Notes("Requisition Notes and Attachments", datasw);
        YokogawaSoftware.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", datasw);

        //Checker PR Approve
        YokogawaSoftware.CheckerLogin("checker@cormsquare.com","Admin@123", datasw);
        YokogawaSoftware.CheckerApprove(datasw);

        //Requester POR Create
        YokogawaSoftware.RequesterLogin("requester@cormsquare.com", "Admin@123", datasw);
        YokogawaSoftware.RequesterCreatePOR(datasw);
        YokogawaSoftware.Subtotal(2000, datasw);
        YokogawaSoftware.StandardTF(100, datasw);
        YokogawaSoftware.SSTPDiscount(10, datasw);
        YokogawaSoftware.Instructions("Additional Terms and Conditions/Special Instructions - POR", datasw);
        YokogawaSoftware.PORNotes("Purchase Order Notes and Attachments", datasw);
        YokogawaSoftware.PORAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.jpg", datasw);

    }
}




