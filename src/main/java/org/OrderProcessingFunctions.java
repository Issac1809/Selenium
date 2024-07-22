import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderProcessingFunctions {

    public static void OrderProcessing() throws InterruptedException {
        // TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webOSDriver.chrome.OSDriver", "C:\\Chrome\\chromeOSDriver-win64\\chromeOSDriver-win64\\chromeOSDriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver OSDriver = new ChromeDriver(options);
        OSDriver.get("https://yef-test.cormsquare.com/Identity/Account/Login");
        OSDriver.manage().window().maximize();

        String Title = "";
        String VendorEmail = "alpha123@cormsquare.com";
        String BuyerEmail = "genpactbuyer@cormsquare.com";
        String RequesterLogin = "requester@cormsquare.com";
        String Password = "Admin@123";

        OrderProcessing.buyerPo(Title, OSDriver);
        OrderProcessing.buyerLogout1(OSDriver);
        OrderProcessing.vendorLogin1(VendorEmail, Password, OSDriver);
        OrderProcessing.vendorPoDetails1(Title, OSDriver);
        OrderProcessing.vendorCreateOSpage("10", "5", "5", OSDriver);
        OrderProcessing.vendorOsnotes("OS Notes", OSDriver);
        OrderProcessing.vendorSubmitButton(OSDriver);
        OrderProcessing.vendorLogout1(OSDriver);
        OrderProcessing.buyerLogin1(BuyerEmail, Password, OSDriver);
        OrderProcessing.buyerPoDetails1(OSDriver);
        OrderProcessing.buyerOsApprove(OSDriver);
        OrderProcessing.buyerLogout2(OSDriver);
        OrderProcessing.vendorLogin2(VendorEmail, Password, OSDriver);
        OrderProcessing.vendorOsDetails1(OSDriver);
        OrderProcessing.vendorLogout2(OSDriver);
        OrderProcessing.requesterLogin(RequesterLogin, Password, OSDriver);
        OrderProcessing.requesterOsDetails(OSDriver);
        OrderProcessing.requesterAssignInspection(RequesterLogin, OSDriver);
        OrderProcessing.requesterCreateInspection(OSDriver);
        OrderProcessing.requesterInspectionNotes("Inspection Notes", "C:\\Users\\Abhijith\\Attachments.xlsx", OSDriver);
        OrderProcessing.requesterlogout(OSDriver);
        OrderProcessing.vendorLogin3(VendorEmail, Password, OSDriver);
        OrderProcessing.vendorOsDetails2(OSDriver);
        OrderProcessing.vendorCreateDnDate(OSDriver);
        OrderProcessing.vendorDnPackages(OSDriver);
        OrderProcessing.buyerDnCreate(OSDriver);
        OrderProcessing.vendorLogout3(OSDriver);
        OrderProcessing.buyerLogin2(BuyerEmail, Password, OSDriver);
        OrderProcessing.buyerDnDetails(OSDriver);
        OrderProcessing.woCreatePage(OSDriver);
        OrderProcessing.buyerLogout3(OSDriver);
        OrderProcessing.vendorLogin4(VendorEmail, Password, OSDriver);
        OrderProcessing.vendorWoDetails(OSDriver);
        OrderProcessing.vendorInvoicePage(OSDriver);
        OrderProcessing.vendorInvoiceCreate("Purchase", "INV-3223", "Invoice Notes", "PO-", OSDriver);
        OrderProcessing.vendorLogout4(OSDriver);
        OrderProcessing.buyerLogin3(BuyerEmail, Password, OSDriver);
        OrderProcessing.buyerInvoiceDetails(OSDriver);
    }
}