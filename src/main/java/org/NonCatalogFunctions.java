import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NonCatalogFunctions {
    public static void NonCatalog() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver NonCatalogDriver = new ChromeDriver(options);
        NonCatalogDriver.get("https://yef-test.cormsquare.com/Identity/Account/Login");
        NonCatalogDriver.manage().window().maximize();

        String TRNTitle = "NonCatalog - 01";

        //Requester PR Create
        NonCatalog.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", NonCatalogDriver);
        NonCatalog.Title(TRNTitle, NonCatalogDriver);
        NonCatalog.ShipToYokogawa(NonCatalogDriver);
        NonCatalog.Project("E143232Q00", NonCatalogDriver);
        NonCatalog.WBS("WB3626", NonCatalogDriver);
        NonCatalog.Incoterm("EXW - Ex Works", NonCatalogDriver);
        NonCatalog.LiquidatedDamages("Not Applicable", NonCatalogDriver);
        NonCatalog.PriceValidity("6 Months", NonCatalogDriver);
        NonCatalog.ShippingAddress(NonCatalogDriver);
        NonCatalog.ShippingMode("Road", NonCatalogDriver);
        NonCatalog.QuotationRequiredBy(NonCatalogDriver);
        NonCatalog.ExpectedPOIssue(NonCatalogDriver);
        NonCatalog.ExpectedDelivery(NonCatalogDriver);
        NonCatalog.InspectionRequired(NonCatalogDriver);
        NonCatalog.OITPCurrency("EUR", NonCatalogDriver);
        NonCatalog.OrderIntake(9999, NonCatalogDriver);
        NonCatalog.TargetAmount(12500, NonCatalogDriver);
        NonCatalog.Checker("checker@cormsquare.com", NonCatalogDriver);
//        YEFNonCatalog.TCAS(datacatalog);
//        YEFNonCatalog.TCASNumber(63728, datacatalog);
//        YEFNonCatalog.TCASFile(datacatalog);
        NonCatalog.AddLineRequisitionItems("Analyzer Accessories", "Reagent Kit Free Chlorine Analyzer-DPD", 10, "Description/Remarks", NonCatalogDriver);
        NonCatalog.Notes("Requisition Notes and Attachments", NonCatalogDriver);
        NonCatalog.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", NonCatalogDriver);

        //Checker PR Login
        NonCatalog.CheckerLogin("checker@cormsquare.com","Admin@123", NonCatalogDriver);
        //Checker PR Approve
        NonCatalog.CheckerApprove(TRNTitle, NonCatalogDriver);

        //GenPactLead PR Login
        NonCatalog.GenPactLeadLogin("genpactlead@cormsquare.com","Admin@123", NonCatalogDriver);
        //GenPactLead PR Assign
        NonCatalog.GenPactLeadAssign(TRNTitle,"genpactbuyer@cormsquare.com", NonCatalogDriver);

        //GenPactBuyer PR Login
        NonCatalog.GenPactBuyerLogin("genpactbuyer@cormsquare.com","Admin@123", NonCatalogDriver);
        //GenPactBuyer RFQ Create
        NonCatalog.GenPactBuyerRFQCreate(TRNTitle, NonCatalogDriver);
        NonCatalog.SpecialInstructions("Additional Terms and Conditions/Special Instructions - RFQ", NonCatalogDriver);
        NonCatalog.RFQNotes("Request For Quotation Notes", NonCatalogDriver);
        NonCatalog.RFQAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", NonCatalogDriver);

        //Invite Registered Vendor
        NonCatalog.InviteVendor("alpha limited", NonCatalogDriver);

        //Vendor Login
        NonCatalog.VendorLogin("alpha123@cormsquare.com","Admin@123", NonCatalogDriver);
        //Vendor Quotation Create
        NonCatalog.VendorQuotationCreate(TRNTitle,"Nedherlands", 87928, 1234, "Make", "Model", "Part Number", "Europe", 200, 10, "Notes", NonCatalogDriver);
        //Quotation Technical Documents
        NonCatalog.TechnicalAttachments("C:\\Users\\Abhijith\\Downloads\\Technical Documents.xlsx", NonCatalogDriver);
        //Quotation Commercial Documents
        NonCatalog.CommercialAttachments("C:\\Users\\Abhijith\\Downloads\\Commercial Documents.xlsx", NonCatalogDriver);
        //Addtional Notes
        NonCatalog.AdditionalNotes("Additional Notes - Quotation", NonCatalogDriver);
        //Additional Terms and Conditions/Special Instructions
        NonCatalog.SpecialInstructionsQuote("Additional Terms and Conditions/Special Instructions - Quotation", NonCatalogDriver);

        //GenPact Buyer RFQ Login
        NonCatalog.GenPactBuyerRFQLogin("genpactbuyer@cormsquare.com","Admin@123", NonCatalogDriver);
        NonCatalog.ReadyForEvaluation(TRNTitle, NonCatalogDriver);

        //Requester TE Create
        NonCatalog.RequesterLoginTECreate(TRNTitle, "requester@cormsquare.com", "Admin@123", "requester@cormsquare.com", NonCatalogDriver);
        NonCatalog.GenPactBuyerRFQLogin2("genpactbuyer@cormsquare.com","Admin@123", NonCatalogDriver);

        //GenPact Buyer CE Create
        NonCatalog.GenPactBuyerLoginCECreate(TRNTitle, 240.67f, 210.56f, 1500.23f, NonCatalogDriver);

        //GenPact Buyer POR Create
        NonCatalog.GenPactBuyerPORCreate(NonCatalogDriver);
        NonCatalog.PORSpecialInstructions("Additional Terms and Conditions/Special Instructions - POR", NonCatalogDriver);
        NonCatalog.PurchaseOrderNotesAndAttachments("Purchase Order Notes and Attachments", NonCatalogDriver);
        NonCatalog.PORAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", NonCatalogDriver);

    }
}