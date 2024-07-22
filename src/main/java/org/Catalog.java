import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class Catalog {
    static void RequesterLoginPRCreate(String mailId, String pass, WebDriver CatalogDriver) throws InterruptedException {
        //Login Page
        CatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);

        //Create Button
        CatalogDriver.findElement(By.className("btn")).click();Thread.sleep(1000);

        //Type - Catalog
        CatalogDriver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();Thread.sleep(1000);
    }

    static void Title(String TRNTitle, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("title")).sendKeys(TRNTitle);Thread.sleep(1000);
    }

    static void ShipToYokogawa(WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.className("type_checkbox")).click();Thread.sleep(1000);
    }

    static void Project(String Project, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("select2-projectId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(Project);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }

    static void WBS(String wbs, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("select2-wbsId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(wbs);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
    static void Vendor(String vendorname, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("select2-vendorId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(vendorname);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
    static void RateContract(String ratecontract, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("select2-rateContractId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(ratecontract);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
    static void ShippingAddress(WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("select2-shippingaddressId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
    }
    static void ShippingMode(String mode, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("select2-shippingModeId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(mode);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) CatalogDriver;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }
    static void ExpectedPOIssue(WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.xpath("//*[@id=\"dates\"]/div[1]/input[2]")).click();
        Thread.sleep(1000);
        Select months = new Select(CatalogDriver.findElement(By.className("flatpickr-monthDropdown-months")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = CatalogDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[26]"));
        day.click();
        Thread.sleep(1000);
    }
    static void ExpectedDelivery(WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.xpath("//*[@id=\"dates\"]/div[2]/input[2]")).click();Thread.sleep(1000);
        Select months = new Select(CatalogDriver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = CatalogDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[32]"));
        day.click();
        Thread.sleep(1000);
    }
    static void InspectionRequired(WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("inspectRequired")).click();Thread.sleep(1000);
    }
    static void Checker(String checkerid, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("select2-checkerId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(checkerid);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) CatalogDriver;
        scroll.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(1000);
    }
    static void TCAS(WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("tcasApplicable")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q1")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q2")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q3")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q4")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q5")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q6")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q7")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("q8")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("tcasSubmit")).click();Thread.sleep(1000);
    }

    static void TCASNumber(int number, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("tcasNumber")).sendKeys(String.valueOf(number));Thread.sleep(1000);
    }

    static void TCASFile(WebDriver CatalogDriver) throws InterruptedException, IOException {
        WebElement file = CatalogDriver.findElement(By.id("btnFileUpload"));Thread.sleep(1000);
        file.click();
        Thread.sleep(5000);
//        file.sendKeys("C:\\Users\\Abhijith\\OneDrive - Cormorant Engineering India Pvt Ltd\\Desktop\\Attachments.jpg");
        Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
    }

    static void AddLineRequisitionItems(String category, String item, int quantity, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("addLineRequisitionItems")).click();Thread.sleep(1000);
        //Category
        CatalogDriver.findElement(By.id("select2-categoryId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(category);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Items
        CatalogDriver.findElement(By.id("select2-itemId-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(item);Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
        //Quantity
        CatalogDriver.findElement(By.id("quantity")).sendKeys(String.valueOf(quantity));Thread.sleep(1000);
        //Add Button
        CatalogDriver.findElement(By.id("saveRequisitionItem")).click();Thread.sleep(1000);
    }

    static void Notes(String notes, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void Attachments(String file, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
        WebElement file1 = CatalogDriver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        CatalogDriver.findElement(By.id("saveAttachments")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) CatalogDriver;
        scroll.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(1000);

        //Create Draft Button
        CatalogDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(5000);
        //Send For Approval button
        CatalogDriver.findElement(By.id("btnSendApproval")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        //Login Avatar Button
        CatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void CheckerLogin(String mailId, String pass, WebDriver CatalogDriver) throws InterruptedException {
        //Login Page
        CatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }

    static void CheckerApprove(String TRNTitle, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.xpath("//*[contains(text(),'"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //Scroll
        WebElement button = CatalogDriver.findElement(By.xpath("//button[contains(text(), 'Approve')]"));
        button.sendKeys(Keys.DOWN); Thread.sleep(1000);
        button.click();Thread.sleep(1000);
        //Approve Button
        CatalogDriver.findElement(By.id("btnApprove")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/form/input")).sendKeys("Approved");Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click();Thread.sleep(1000);

        //Login Avatar Button
        CatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void GenPactLeadLogin(String mailId, String pass, WebDriver CatalogDriver) throws InterruptedException {
        //Login Page
        CatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }
    static void GenPactLeadAssign(String TRNTitle, String genpactbuyer, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.xpath("//*[contains(text(),'"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //Assign Buyer
        CatalogDriver.findElement(By.id("btnAssignUser")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("select2-bgUser-container")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.className("select2-search__field")).sendKeys(genpactbuyer);Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//li[contains(text(),'genpactbuyer@cormsquare.com')]")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.id("saveBuyerUser")).click();Thread.sleep(1000);

        //Login Avatar Button
        CatalogDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void GenPactBuyerLogin(String mailId, String pass, WebDriver CatalogDriver) throws InterruptedException {
        //Login Page
        CatalogDriver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(1000);
        CatalogDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
    }
    static void GenPactBuyerPORCreate(String TRNTitle, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.xpath("//*[contains(text(),'"+ TRNTitle +"')]")).click();Thread.sleep(1000);
        //POR Create
        CatalogDriver.findElement(By.id("btnCreatePOR")).click();Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) CatalogDriver;
        scroll.executeScript("window.scrollBy(0,800)", "");
    }
    static void SpecialInstructions(String instructions, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("specialInstructions")).sendKeys(instructions);Thread.sleep(1000);
    }
    static void PORNotes(String notes, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
    }

    static void PORAttachments(String file, WebDriver CatalogDriver) throws InterruptedException {
        CatalogDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
        WebElement file1 = CatalogDriver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        CatalogDriver.findElement(By.id("savePORAttachments")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();Thread.sleep(1000);

        //Create POR Button
        CatalogDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        CatalogDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        CatalogDriver.close();
    }
}

