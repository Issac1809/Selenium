import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class NonCatalog {
    static void RequesterLoginPRCreate(String mailId, String pass, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);

        //Create Button
        NonCatalogDriver.findElement(By.className("btn")).click();Thread.sleep(1000);

        //Type - NonCatalog
        NonCatalogDriver.findElement(By.xpath("//tbody/tr[2]/td[1]/a[1]")).click();Thread.sleep(1000);
    }

    static void Title(String title, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("title")).sendKeys(title);Thread.sleep(1000);
    }

    static void ShipToYokogawa(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.className("type_checkbox")).click();Thread.sleep(1000);
    }

    static void Project(String Project, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-projectId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(Project);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void WBS(String wbs, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-wbsId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(wbs);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void Incoterm(String incoterm, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-incoterm-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(incoterm);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void LiquidatedDamages(String liquidateddamages, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-liquidatedamageid-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(liquidateddamages);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void PriceValidity(String pricevalidity, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-pricevalidityid-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(pricevalidity);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void ShippingAddress(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-shippingaddressId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void ShippingMode(String mode, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-shippingmodeid-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(mode);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }

    static void QuotationRequiredBy(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[2]")).click();Thread.sleep(1000);
        Select months = new Select(NonCatalogDriver.findElement(By.className("flatpickr-monthDropdown-months")));
        months.selectByVisibleText("December");Thread.sleep(1000);
        WebElement day = NonCatalogDriver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[5]"));
        day.click();
        Thread.sleep(1000);
    }

    static void ExpectedPOIssue(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//body[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/input[2]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[2]/div[1]/span[9]")).click();
        Thread.sleep(1000);
    }

    static void ExpectedDelivery(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[3]/input[2]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//body/div[6]/div[2]/div[1]/div[2]/div[1]/span[14]")).click();
        Thread.sleep(1000);
    }

    static void InspectionRequired(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("inspectrequired")).click();Thread.sleep(1000);
    }

    static void OITPCurrency(String currency, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-oiTpCurrencyId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(currency);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void OrderIntake(int orderamount, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("orderintakeid")).sendKeys(Integer.toString(orderamount));Thread.sleep(1000);
    }

    static void TargetAmount(int targetamount, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("targetpriceid")).sendKeys(Integer.toString(targetamount));Thread.sleep(1000);
    }

    static void Checker(String checkerid, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("select2-checkerId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(checkerid);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(1000);
    }

    static void TCAS(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("tcasApplicable")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q1")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q2")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q3")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q4")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q5")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q6")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q7")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("q8")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("tcasSubmit")).click();Thread.sleep(1000);
    }

    static void TCASNumber(int number, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("tcasNumber")).sendKeys(String.valueOf(number));Thread.sleep(1000);
    }

    static void TCASFile(WebDriver NonCatalogDriver) throws InterruptedException, IOException {
        WebElement file = NonCatalogDriver.findElement(By.id("btnFileUpload"));
        Thread.sleep(5000);
        file.click();

        Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
    }

    static void AddLineRequisitionItems(String category, String item, int quantity, String descriptionremarks, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("addLineRequisitionItems")).click();Thread.sleep(1000);
        //Category
        NonCatalogDriver.findElement(By.id("select2-categoryid-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(category);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Items
        NonCatalogDriver.findElement(By.id("select2-itemid-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(item);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Quantity
        NonCatalogDriver.findElement(By.id("quantity")).sendKeys(String.valueOf(quantity));Thread.sleep(1000);
        //Description/Remarks
        NonCatalogDriver.findElement(By.id("description")).sendKeys(descriptionremarks);Thread.sleep(1000);
        //Add Button
        NonCatalogDriver.findElement(By.id("saveRequisitionItem")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }

    static void Notes(String notes, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void Attachments(String file, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
        WebElement file1 = NonCatalogDriver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        NonCatalogDriver.findElement(By.id("saveAttachments")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(1000);

        //Create Draft Button
        NonCatalogDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(5000);
        //Send For Approval button
        NonCatalogDriver.findElement(By.id("btnSendApproval")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Login Avatar Button
        NonCatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void CheckerLogin(String mailId, String pass, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }

    static void CheckerApprove(String TRNTitle, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//span[contains(text(), '"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //Scroll
        WebElement button = NonCatalogDriver.findElement(By.xpath("//button[contains(text(), 'Approve')]"));
        button.sendKeys(Keys.DOWN); Thread.sleep(1000);
        button.click();Thread.sleep(1000);
        //Approve Button
        NonCatalogDriver.findElement(By.id("btnApprove")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/form/input")).sendKeys("Approved");Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click();Thread.sleep(1000);
        //Scrollup
        JavascriptExecutor scrollup = (JavascriptExecutor) NonCatalogDriver;
        scrollup.executeScript("window.scrollBy(0,-300)", "");
        Thread.sleep(1000);
        //Scrollup1
        JavascriptExecutor scrollup1 = (JavascriptExecutor) NonCatalogDriver;
        scrollup1.executeScript("window.scrollBy(0,-900)", "");Thread.sleep(1000);

        //Login Avatar Button
        NonCatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void GenPactLeadLogin(String mailId, String pass, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }

    static void GenPactLeadAssign(String TRNTitle, String genpactbuyer, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//span[contains(text(), '"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //Assign Buyer
        NonCatalogDriver.findElement(By.id("btnAssignUser")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("select2-bgUser-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(genpactbuyer);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//li[contains(text(),'genpactbuyer@cormsquare.com')]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("saveBuyerUser")).click();Thread.sleep(1000);

        //Login Avatar Button
        NonCatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void GenPactBuyerLogin(String mailId, String pass, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }

    static void GenPactBuyerRFQCreate(String TRNTitle, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//span[contains(text(), '"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //RFQ Create
        NonCatalogDriver.findElement(By.id("btnCreateRFQ")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor Requesterscroll = (JavascriptExecutor) NonCatalogDriver;
        Requesterscroll.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
    }

    static void SpecialInstructions(String instructions, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("specialInstructions")).sendKeys(instructions);Thread.sleep(1000);
    }

    static void RFQNotes(String notes, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void RFQAttachments(String file, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
        WebElement file1 = NonCatalogDriver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        NonCatalogDriver.findElement(By.id("savePrAttachments")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();Thread.sleep(1000);

        //Create RFQ Button
        NonCatalogDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
    }

    static void InviteVendor(String vendor, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("addRequestForQuotationVendors")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("select2-vendorId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(vendor);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("select2-vendorId-results")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("saveRequestForQuotationVendor")).click();Thread.sleep(1000);
        //EmailPop_up
        NonCatalogDriver.findElement(By.id("vendorSendMailBtnId")).click();Thread.sleep(1000);

        //Login Avatar Button
        NonCatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void VendorLogin(String mailId, String pass, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }

    static void VendorQuotationCreate(String TRNTitle, String incotermlocation, int refnumber, int hscode, String make, String model, String partnumber, String countryoforigin, int rate, int leadtime, String notes, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//span[contains(text(), '"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //Send Quote
        NonCatalogDriver.findElement(By.id("btnSendQuote")).click();Thread.sleep(1000);
        //Incoterm Location
        NonCatalogDriver.findElement(By.id("incotermLocation")).sendKeys(incotermlocation);Thread.sleep(1000);
        //Quotation Reference Number
        NonCatalogDriver.findElement(By.id("quotationReferenceNumber")).sendKeys(Integer.toString(refnumber));Thread.sleep(1000);
        //Choose Validity Date
        NonCatalogDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[5]/div[6]/div[1]/input[2]")).click();Thread.sleep(1000);
        Select months = new Select(NonCatalogDriver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = NonCatalogDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[32]"));
        day.click();
        Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
        //Liquidated Damages
        NonCatalogDriver.findElement(By.id("liquidatedComplyId")).click();Thread.sleep(1000);
        //RoHS Compliance
        NonCatalogDriver.findElement(By.id("rohsComplyId")).click();Thread.sleep(1000);
        //Warranty Requirements
        NonCatalogDriver.findElement(By.id("warrantyRequirementsComplyId")).click();Thread.sleep(1000);
        //HS Code
        NonCatalogDriver.findElement(By.id("hsCode-1")).sendKeys(Integer.toString(hscode));Thread.sleep(1000);
        //Make
        NonCatalogDriver.findElement(By.id("make-1")).sendKeys(make);Thread.sleep(1000);
        //Model
        NonCatalogDriver.findElement(By.id("model-1")).sendKeys(model);Thread.sleep(1000);
        //Part Number
        NonCatalogDriver.findElement(By.id("partNumber-1")).sendKeys(partnumber);Thread.sleep(1000);
        //Country Of Origin
        NonCatalogDriver.findElement(By.id("countryOfOrigin-1")).sendKeys(countryoforigin);Thread.sleep(1000);
        //Rate
        NonCatalogDriver.findElement(By.id("rate-1")).clear();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("rate-1")).sendKeys(Integer.toString(rate));Thread.sleep(1000);
        //Lead Time (Calendar days)
        NonCatalogDriver.findElement(By.id("leadTime-1")).sendKeys(Integer.toString(leadtime));Thread.sleep(1000);
        //Notes
        NonCatalogDriver.findElement(By.id("notes-1")).sendKeys(notes);Thread.sleep(1000);
        //Scroll1
        JavascriptExecutor scroll1 = (JavascriptExecutor) NonCatalogDriver;
        scroll1.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }

    static void TechnicalAttachments(String file, WebDriver NonCatalogDriver) throws InterruptedException {
        //Quotation Attachments (Technical/Commercial)
        NonCatalogDriver.findElement(By.id("attachFile")).click();Thread.sleep(1000);
        WebElement file2 = NonCatalogDriver.findElement(By.id("formFilePreupload"));
        file2.sendKeys(file);
        Thread.sleep(3000);
        //Attachment Type
        NonCatalogDriver.findElement(By.id("select2-attachmentTypeId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//li[contains(text(), 'Technical')]")).click();Thread.sleep(1000);

        //Save Button
        NonCatalogDriver.findElement(By.id("attachmentSaveId")).click();Thread.sleep(1000);
    }

    static void CommercialAttachments(String file, WebDriver NonCatalogDriver) throws InterruptedException {
        //Quotation Attachments (Technical/Commercial)
        NonCatalogDriver.findElement(By.id("attachFile")).click();Thread.sleep(1000);
        WebElement file2 = NonCatalogDriver.findElement(By.id("formFilePreupload"));
        file2.sendKeys(file);Thread.sleep(5000);
        //Attachment Type
        NonCatalogDriver.findElement(By.id("select2-attachmentTypeId-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//li[contains(text(), 'Commercial')]")).click();Thread.sleep(1000);
        //Save Button
        NonCatalogDriver.findElement(By.id("attachmentSaveId")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }

    static void AdditionalNotes(String notes, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("additionalNotes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void SpecialInstructionsQuote(String specialinstructions, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("terms")).sendKeys(specialinstructions);Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);

        //Create Button
        NonCatalogDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(), 'Yes')]")).click();Thread.sleep(1000);

        //Login Avatar Button
        NonCatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void GenPactBuyerRFQLogin(String mailId, String pass, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }

    static void ReadyForEvaluation(String TRNTitle, WebDriver NonCatalogDriver) throws InterruptedException {
        //RFQ TitleBar
        NonCatalogDriver.findElement(By.xpath("//body/aside[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]")).click();Thread.sleep(1000);
        //Ready For Evaluation Button
        NonCatalogDriver.findElement(By.xpath("//span[contains(text(),'"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        //Scroll1
        JavascriptExecutor scroll1 = (JavascriptExecutor) NonCatalogDriver;
        scroll1.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("btnReadyForEvalution")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);

        //Login Avatar Button
        NonCatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void RequesterLoginTECreate(String TRNTitle, String mailId, String pass, String assignbuyer, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        //RFQ TitleBar
        NonCatalogDriver.findElement(By.xpath("//body/aside[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//span[contains(text(),'"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        //Scroll1
        JavascriptExecutor scroll1 = (JavascriptExecutor) NonCatalogDriver;
        scroll1.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
        //Create TE Button
        NonCatalogDriver.findElement(By.id("btnCreateTE")).click();Thread.sleep(1000);
        //Scroll2
        JavascriptExecutor scroll2 = (JavascriptExecutor) NonCatalogDriver;
        scroll2.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
        //Evaluate Button
        NonCatalogDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("remarks-input")).sendKeys("Remarks");Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();Thread.sleep(3000);
        //Send For Approval Button
        NonCatalogDriver.findElement(By.id("btnSendApproval")).click();Thread.sleep(1000);
        //Assign Approver Button
        NonCatalogDriver.findElement(By.id("select2-approverUser-container")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.className("select2-search__field")).sendKeys(assignbuyer);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("select2-approverUser-results")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("saveApproverAssign")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        //Scroll3
        JavascriptExecutor scroll3 = (JavascriptExecutor) NonCatalogDriver;
        scroll3.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        //Scroll4
        JavascriptExecutor scroll4 = (JavascriptExecutor) NonCatalogDriver;
        scroll4.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(300);
        //Approve Button
        NonCatalogDriver.findElement(By.id("btnApprove")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).sendKeys("TE Created");Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();Thread.sleep(1000);

        //Login Avatar Button
        NonCatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void GenPactBuyerRFQLogin2(String mailId, String pass, WebDriver NonCatalogDriver) throws InterruptedException {
        //Login Page
        NonCatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }

    static void GenPactBuyerLoginCECreate(String TRNTitle, float frieght, float finacialloading, float customduty, WebDriver NonCatalogDriver) throws InterruptedException {
        //RFQ TitleBar
        NonCatalogDriver.findElement(By.xpath("//body/aside[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//span[contains(text(),'"+ TRNTitle+"')]")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        //Scroll1
        JavascriptExecutor scroll1 = (JavascriptExecutor) NonCatalogDriver;
        scroll1.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
        //Create CE Button
        NonCatalogDriver.findElement(By.id("btnCreateCE")).click();Thread.sleep(1000);
        //Scroll2
        JavascriptExecutor scroll2 = (JavascriptExecutor) NonCatalogDriver;
        scroll2.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
        //Frieght & Insurance Cost
        NonCatalogDriver.findElement(By.id("freight_1096")).sendKeys(Float.toString(frieght));Thread.sleep(1000);
        //Financial Loading
        NonCatalogDriver.findElement(By.id("financialLoading_1096")).sendKeys(Float.toString(finacialloading));Thread.sleep(1000);
        //Custom Duty
        NonCatalogDriver.findElement(By.id("customDuty_1096")).sendKeys(Float.toString(customduty));Thread.sleep(1000);
        //Scroll3
        JavascriptExecutor scroll3 = (JavascriptExecutor) NonCatalogDriver;
        scroll3.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("selectionStatus_1096")).click();Thread.sleep(1000);
        //Selection Status
        WebElement dropdownElement = NonCatalogDriver.findElement(By.id("selectionStatus_1096"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Yes");
        Thread.sleep(1000);
        //Submit Button
        NonCatalogDriver.findElement(By.id("btnSubmitCE")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.id("remarks-input")).sendKeys("Remarks");Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[2]")).click();Thread.sleep(1000);
        //Scroll4
        JavascriptExecutor scroll4 = (JavascriptExecutor) NonCatalogDriver;
        scroll4.executeScript("window.scrollBy(0,600)", "");
        Thread.sleep(1000);
    }

    static void GenPactBuyerPORCreate(WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.xpath("//a[contains(text(),'Create Por')]")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) NonCatalogDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
        //Justification If Number Of Quotations Are Less Than 3
        //1.Sole Supplier
        NonCatalogDriver.findElement(By.id("preselectedYes")).click();Thread.sleep(1000);
        //Pre Selected By Customer
        NonCatalogDriver.findElement(By.id("below5L")).click();Thread.sleep(1000);
        //Other Reasons
        NonCatalogDriver.findElement(By.id("justificationRemarks")).sendKeys("Not Applicable");Thread.sleep(1000);
        //Scroll1
        JavascriptExecutor scroll1 = (JavascriptExecutor) NonCatalogDriver;
        scroll1.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
    }

    static void PORSpecialInstructions(String instructions, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("specialInstructions")).sendKeys(instructions);Thread.sleep(1000);
    }

    static void PurchaseOrderNotesAndAttachments(String notes, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void PORAttachments(String file, WebDriver NonCatalogDriver) throws InterruptedException {
        NonCatalogDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
        WebElement file1 = NonCatalogDriver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        NonCatalogDriver.findElement(By.id("savePrAttachments")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();Thread.sleep(1000);

        //Create POR Button
        NonCatalogDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        NonCatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        NonCatalogDriver.close();
    }
}

