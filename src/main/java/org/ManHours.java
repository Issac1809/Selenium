import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class ManHours {

    static void RequesterLoginPRCreate(String mailId, String pass, WebDriver MHDriver) throws InterruptedException {
        //Login Page
        MHDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        MHDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        MHDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);

        //Create Button
        MHDriver.findElement(By.xpath("//button[@data-bs-target='#createPRModal']")).click();Thread.sleep(1000);

        //Type - MH
        MHDriver.findElement(By.xpath("//tbody/tr[3]/td[1]/a[1]")).click();Thread.sleep(1000);
    }
    static void Title(String TRNTitle, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("title")).sendKeys(TRNTitle);Thread.sleep(1000);
    }
    static void ShipToYokogawa(WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.className("type_checkbox")).click();Thread.sleep(1000);
    }
    static void Project(String Project, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("select2-projectId-container")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-search__field")).sendKeys(Project);Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
//    static void WBS(String wbs, WebDriver MHDriver) throws InterruptedException {
//        MHDriver.findElement(By.id("select2-wbsId-container")).click();Thread.sleep(1000);
//        MHDriver.findElement(By.className("select2-search__field")).sendKeys(wbs);Thread.sleep(1000);
//        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
//    }
    static void ShippingAddress(WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("select2-shippingaddressId-container")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
    static void BillingType(String billingtype, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("select2-billingTypeId-container")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-search__field")).sendKeys(billingtype);Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
    static void Vendor(String vendorname, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("select2-vendorId-container")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-search__field")).sendKeys(vendorname);Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
    static void Checker(String checkerid, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("select2-checkerId-container")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-search__field")).sendKeys(checkerid);Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) MHDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }
    static void FromDate(WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[2]")).click();Thread.sleep(1000);
        Select months = new Select(MHDriver.findElement(By.className("flatpickr-monthDropdown-months")));
        months.selectByVisibleText("December");Thread.sleep(1000);
        WebElement day = MHDriver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[5]"));
        day.click();
        Thread.sleep(1000);
    }
    static void ToDate(WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.xpath("//body[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/input[2]")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[2]/div[1]/span[9]")).click();
        Thread.sleep(1000);
    }
    static void ExpectedMobilization(WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[3]/input[2]")).click();Thread.sleep(1000);
        Select months = new Select(MHDriver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/select[1]")));
        months.selectByVisibleText("October");Thread.sleep(1000);
        WebElement day = MHDriver.findElement(By.xpath("//body/div[6]/div[2]/div[1]/div[2]/div[1]/span[20]"));
        day.click();

        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) MHDriver;
        scroll.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
    }
    static void TCAS(WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("tcasApplicable")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q1")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q2")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q3")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q4")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q5")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q6")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q7")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("q8")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("tcasSubmit")).click();Thread.sleep(1000);
        Thread.sleep(1000);
    }
    static void TCASNumber(int number, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("tcasNumber")).sendKeys(String.valueOf(number));Thread.sleep(1000);
    }
    static void TCASFile(WebDriver MHDriver) throws InterruptedException, IOException {
        WebElement file = MHDriver.findElement(By.id("btnFileUpload"));
        Thread.sleep(5000);
        file.click();

        Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
        Thread.sleep(1000);
    }
    static void AddLineRequisitionItems(String category, int quantity, float rate, String remarks, WebDriver MHDriver) throws InterruptedException {
        WebElement button = MHDriver.findElement(By.id("addLineRequisitionItems"));Thread.sleep(1000);
        button.click();

        String[] items = {"Engineering Services", "DCS Engineering", "SIS Engineering", "Panel Engineering"};
        for(int i=0; i<items.length; i++)
        {
        //Category
        MHDriver.findElement(By.id("select2-categoryId-container")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-search__field")).sendKeys(category);Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Items
        MHDriver.findElement(By.id("select2-itemId-container")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-search__field")).sendKeys(items[i]);Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Man Hours Quantity
        MHDriver.findElement(By.id("quantityId")).sendKeys(Integer.toString(quantity));Thread.sleep(1000);
        //Rate
        MHDriver.findElement(By.id("rateId")).sendKeys(Float.toString(rate));Thread.sleep(1000);
        //Description/Remarks
        MHDriver.findElement(By.id("description")).sendKeys(remarks);Thread.sleep(1000);
        //Add Button
        MHDriver.findElement(By.id("saveRequisitionItem")).click();Thread.sleep(1000);

        if(i < items.length - 1)
        {
            button.click();
        }
        }
    }

    static void Notes(String notes, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void Attachments(String file, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
        WebElement file1 = MHDriver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        MHDriver.findElement(By.id("saveAttachments")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) MHDriver;
        scroll.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(1000);

        //Create Draft Button
        MHDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Send For Approval button
        MHDriver.findElement(By.id("btnSendApproval")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Login Avatar Button
        MHDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void CheckerLogin(String mailId, String pass, WebDriver MHDriver) throws InterruptedException {
        //Login Page
        MHDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        MHDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        MHDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }
    static void CheckerApprove(String TRNTitle, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.xpath("//span[contains(text(), '"+ TRNTitle + "')]")).click();Thread.sleep(1000);
        //Scroll
        WebElement button = MHDriver.findElement(By.xpath("//button[contains(text(), 'Approve')]"));
        button.sendKeys(Keys.DOWN); Thread.sleep(1000);
        button.click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/form/input")).sendKeys("Approved");Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click();Thread.sleep(1000);

        //Login Avatar Button
        MHDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }
    static void GenPactLeadLogin(String mailId, String pass, WebDriver MHDriver) throws InterruptedException {
        //Login Page
        MHDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        MHDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        MHDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }
    static void GenPactLeadAssign(String TRNTitle, String genpactbuyer, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.xpath("//span[contains(text(), '"+ TRNTitle + "')]")).click();Thread.sleep(1000);
        //Assign Buyer
        MHDriver.findElement(By.id("btnAssignUser")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//*[@id=\"assignUserContainer\"]/div[2]/span/span[1]/span")).click();Thread.sleep(1000);
        MHDriver.findElement(By.className("select2-search__field")).sendKeys(genpactbuyer);Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//li[contains(text(),'genpactbuyer@cormsquare.com')]")).click();Thread.sleep(1000);
        MHDriver.findElement(By.id("saveBuyerUser")).click();Thread.sleep(1000);

        //Login Avatar Button
        MHDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void GenPactBuyerLogin(String mailId, String pass, WebDriver MHDriver) throws InterruptedException {
        //Login Page
        MHDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        MHDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        MHDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }
    static void GenPactBuyerPORCreate(String TRNTitle, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.xpath("//span[contains(text(), '"+ TRNTitle + "')]")).click();Thread.sleep(1000);
        //POR Create
        MHDriver.findElement(By.id("btnCreatePOR")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) MHDriver;
        scroll.executeScript("window.scrollBy(0,800)", "");
        Thread.sleep(1000);
    }
    static void SpecialInstructions(String instructions, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("specialInstructions")).sendKeys(instructions);Thread.sleep(1000);
        JavascriptExecutor scroll = (JavascriptExecutor) MHDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }
    static void PORNotes(String notes, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void PORAttachments(String file, WebDriver MHDriver) throws InterruptedException {
        MHDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
        WebElement file1 = MHDriver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        MHDriver.findElement(By.id("savePrAttachments")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();Thread.sleep(1000);

        //Create POR Button
        MHDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        MHDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        MHDriver.close();
    }
}