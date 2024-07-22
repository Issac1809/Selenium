import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class YokogawaHardwareFunctions {
    public static void YokogawaHardware() throws InterruptedException, IOException {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver datahw = new ChromeDriver(options);
        datahw.get("https://yef-test.cormsquare.com/Identity/Account/Login");
        datahw.manage().window().maximize();

        //Requester PR Create
        YokogawaHardware.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", datahw);
        YokogawaHardware.Title("Yokogawa - HW - 01", datahw);
        YokogawaHardware.ShipToYokogawa(datahw);
        YokogawaHardware.Project("E213991B00", datahw);
        YokogawaHardware.WBS("J11PJTH34", datahw);
        YokogawaHardware.Checker("checker@cormsquare.com", datahw);
        YokogawaHardware.ShippingAddress(datahw);
        YokogawaHardware.ExpectedPOIssue(datahw);
        YokogawaHardware.ExpectedDelivery(datahw);
        YokogawaHardware.TCAS(datahw);
        YokogawaHardware.TCASNumber(63728, datahw);
        YokogawaHardware.TCASFile(datahw);
        YokogawaHardware.HWFile("C:\\Users\\Abhijith\\Downloads\\ImportRequisitionYokogawaPOCHWItems.xlsx", datahw);
        YokogawaHardware.Notes("Requisition Notes and Attachments", datahw);
        YokogawaHardware.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", datahw);

        //Checker PR Approve
        YokogawaHardware.CheckerLogin("checker@cormsquare.com","Admin@123", datahw);
        YokogawaHardware.CheckerApprove(datahw);

        //Requester POR Create
        YokogawaHardware.RequesterLogin("requester@cormsquare.com", "Admin@123", datahw);
        YokogawaHardware.RequesterCreatePOR(datahw);
        YokogawaHardware.Subtotal(2000, datahw);
        YokogawaHardware.StandardTF(100, datahw);
        YokogawaHardware.SSTPDiscount(10, datahw);
        YokogawaHardware.Instructions("Additional Terms and Conditions/Special Instructions - POR", datahw);
        YokogawaHardware.PORNotes("Purchase Order Notes and Attachments", datahw);
        YokogawaHardware.PORAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.jpg", datahw);

    }
}
