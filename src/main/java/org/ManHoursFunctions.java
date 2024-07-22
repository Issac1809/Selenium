import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;

public class ManHoursFunctions {
    public static void ManHours() throws InterruptedException, IOException {

        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver MHDriver = new ChromeDriver(options);
        MHDriver.get("https://yef-test.cormsquare.com/Identity/Account/Login");
        MHDriver.manage().window().maximize();

        String TRNTitle = "MH - 01";

        //Requester PR Create
        ManHours.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", MHDriver);
        ManHours.Title(TRNTitle, MHDriver);
        ManHours.ShipToYokogawa(MHDriver);
        ManHours.Project("E143232Q00", MHDriver);
//        ManHours.WBS("WB3626", MHDriver);
        ManHours.ShippingAddress(MHDriver);
        ManHours.BillingType("Milestone", MHDriver);
        ManHours.Vendor("alpha limited", MHDriver);
        ManHours.Checker("checker@cormsquare.com", MHDriver);
        ManHours.FromDate(MHDriver);
        ManHours.ToDate(MHDriver);
        ManHours.ExpectedMobilization(MHDriver);
//        YEFManHours.TCAS(MHDriver);
//        YEFManHours.TCASNumber(63728, MHDriver);
//        YEFManHours.TCASFile(MHDriver);
        ManHours.AddLineRequisitionItems("Services", 20, 240.45f, "Description/Remarks", MHDriver);
        ManHours.Notes("Requisition Notes and Attachments", MHDriver);
        ManHours.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", MHDriver);

        //Checker PR Login
        ManHours.CheckerLogin("checker@cormsquare.com","Admin@123", MHDriver);
        //Checker PR Approve
        ManHours.CheckerApprove(TRNTitle, MHDriver);

        //GenPactLead PR Login
        ManHours.GenPactLeadLogin("genpactlead@cormsquare.com","Admin@123", MHDriver);
        //GenPactLead PR Assign
        ManHours.GenPactLeadAssign(TRNTitle, "genpactbuyer@cormsquare.com", MHDriver);

        //GenPactBuyer PR Login
        ManHours.GenPactBuyerLogin("genpactbuyer@cormsquare.com","Admin@123", MHDriver);
        //GenPactBuyer POR Create
        ManHours.GenPactBuyerPORCreate(TRNTitle, MHDriver);
        ManHours.SpecialInstructions("Additional Terms and Conditions/Special Instructions - POR", MHDriver);
        ManHours.PORNotes("Purchase Order Notes and Attachments", MHDriver);
        ManHours.PORAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", MHDriver);



    }
}
