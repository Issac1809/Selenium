package YokogawaEuropeBV;
import org.openqa.selenium.WebDriver;

public class FunctionsForCatalog{
    public static void Functions(WebDriver driver) throws InterruptedException {

        String trnTitle = "POC - Catalog - 001";
//TODO RequesterPRCreate
        CatalogSimpleFlow.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", driver);
        CatalogSimpleFlow.Title(trnTitle, driver);
//        CatalogSimpleFlow.ShipToYokogawa(driver);
        CatalogSimpleFlow.Project("E143232Q00", driver);
        CatalogSimpleFlow.WBS("J11234H56", driver);
        CatalogSimpleFlow.Vendor("Alpha Limited", driver);
        CatalogSimpleFlow.RateContract("RC-00103 - New RC - Alpha 001", driver);
        CatalogSimpleFlow.ShippingAddress("15100 - CROSSBRIDGE ENERGY A/S", driver);
        CatalogSimpleFlow.ShippingMode("Road", driver);
        CatalogSimpleFlow.ExpectedPOIssue(driver);
        CatalogSimpleFlow.ExpectedDelivery(driver);
        CatalogSimpleFlow.InspectionRequired(driver);
        CatalogSimpleFlow.Checker("checker@cormsquare.com", driver);
//      CatalogSimpleFlow.TCAS(driver);
//      CatalogSimpleFlow.TCASNumber(63728, driver);
//      CatalogSimpleFlow.TCASFile(driver);
        CatalogSimpleFlow.AddLineRequisitionItems("Access Control System", "Cabinet with Smart Card Access", 150, driver);
        CatalogSimpleFlow.Notes("Requisition Notes and Attachments", driver);
        CatalogSimpleFlow.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", driver);
//TODO CheckerPRLogin
        CatalogSimpleFlow.CheckerLogin("checker@cormsquare.com", "Admin@123", driver);
//TODO CheckerPRApprove
        CatalogSimpleFlow.CheckerApprove(trnTitle, driver);
//TODO GenPactLeadPRLogin
        CatalogSimpleFlow.GenPactLeadLogin("genpactlead@cormsquare.com", "Admin@123", driver);
//TODO GenPactLeadPRAssign
        CatalogSimpleFlow.GenPactLeadAssign(trnTitle, "genpactbuyer@cormsquare.com", driver);
//TODO GenPactBuyerPRLogin
        CatalogSimpleFlow.GenPactBuyerLogin("genpactbuyer@cormsquare.com", "Admin@123", driver);
//TODO GenPactBuyerPORCreate
        CatalogSimpleFlow.GenPactBuyerPORCreate(trnTitle, driver);
        CatalogSimpleFlow.SpecialInstructions("Additional Terms and Conditions/Special Instructions - POR", driver);
        CatalogSimpleFlow.PORNotes("Purchase Order Notes and Attachments", driver);
        CatalogSimpleFlow.PORAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", driver);
    }
}
