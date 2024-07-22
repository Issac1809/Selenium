package YokogawaEuropeBV;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class CatalogSimpleFlow {
    public static void RequesterLoginPRCreate(String mailId, String password, WebDriver driver) throws InterruptedException {
//TODO LoginPage
        driver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(2000);
        driver.findElement(By.id("Input_Password")).sendKeys(password);Thread.sleep(2000);
        driver.findElement(By.id("login-submit")).click();Thread.sleep(5000);
//TODO CreateButton
        driver.findElement(By.xpath("//i[@class= 'bi-plus']")).click();Thread.sleep(2000);
//TODO Type - Catalog
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();Thread.sleep(2000);
    }
    public static void Title(String trnTitle, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("title")).sendKeys(trnTitle);Thread.sleep(2000);
    }
//    public static void ShipToYokogawa(WebDriver driver) throws InterruptedException {
//        driver.findElement(By.className("type_checkbox")).click(); Thread.sleep(2000);
//    }
    public static void Project(String project, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-projectId-container")).click(); Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(project);Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(), '" + project + "')]")).click();Thread.sleep(2000);
    }
    public static void WBS(String wbs, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-wbsId-container")).click(); Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(wbs); Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(), '" + wbs + "')]")).click();Thread.sleep(2000);
    }
    public static void Vendor(String vendorName, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-vendorId-container")).click();Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(vendorName);Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(), '" + vendorName + "')]")).click();Thread.sleep(2000);
    }
    public static void RateContract(String rateContract, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-rateContractId-container")).click();Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(rateContract);Thread.sleep(2000);
        driver.findElement(By.className("select2-results__option")).click(); Thread.sleep(2000);
    }
    public static void ShippingAddress(String address, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-shippingaddressId-container")).click();Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(address);Thread.sleep(2000);
        driver.findElement(By.className("select2-results__option")).click(); Thread.sleep(2000);
    }
    public static void ShippingMode(String mode, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-shippingModeId-container")).click(); Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(mode); Thread.sleep(2000);
        driver.findElement(By.className("select2-results__option")).click(); Thread.sleep(2000);
//TODO Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,300)", "");Thread.sleep(2000);
         
    }
    public static void ExpectedPOIssue(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dates\"]/div[1]/input[2]")).click();Thread.sleep(2000);
        Select months = new Select(driver.findElement(By.className("flatpickr-monthDropdown-months")));Thread.sleep(2000);
        months.selectByVisibleText("December");Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[26]"));Thread.sleep(2000);
        day.click();Thread.sleep(2000);
    }
    public static void ExpectedDelivery(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dates\"]/div[2]/input[2]")).click(); Thread.sleep(2000);
        Select months = new Select(driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")));Thread.sleep(2000);
        months.selectByVisibleText("December");Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[32]"));Thread.sleep(2000);
        day.click();
    }
    public static void InspectionRequired(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("inspectRequired")).click(); Thread.sleep(2000);
    }
    public static void Checker(String checkerId, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("select2-checkerId-container")).click(); Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(checkerId);Thread.sleep(2000);
        driver.findElement(By.className("select2-results__option")).click(); Thread.sleep(2000);
//TODO Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,700)", "");Thread.sleep(2000);
    }
//    public static void TCAS(WebDriver driver) throws InterruptedException {
//        driver.findElement(By.id("tcasApplicable")).click(); 
//        driver.findElement(By.id("q1")).click(); 
//        driver.findElement(By.id("q2")).click(); 
//        driver.findElement(By.id("q3")).click(); 
//        driver.findElement(By.id("q4")).click(); 
//        driver.findElement(By.id("q5")).click(); 
//        driver.findElement(By.id("q6")).click(); 
//        driver.findElement(By.id("q7")).click(); 
//        driver.findElement(By.id("q8")).click(); 
//        driver.findElement(By.id("tcasSubmit")).click(); 
//    }
//    public static void TCASNumber(int number, WebDriver driver) throws InterruptedException {
//        driver.findElement(By.id("tcasNumber")).sendKeys(String.valueOf(number)); 
//    }
//    public static void TCASFile(WebDriver driver) throws InterruptedException, IOException {
//        WebElement file = driver.findElement(By.id("btnFileUpload")); 
//        file.click();
//        Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
//    }
    public static void AddLineRequisitionItems(String category, String item, int quantity, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("addLineRequisitionItems")).click(); Thread.sleep(2000);
//TODO Category
        driver.findElement(By.id("select2-categoryId-container")).click(); Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(category); Thread.sleep(2000);
        driver.findElement(By.className("select2-results__option")).click(); Thread.sleep(2000);
//TODO Items
        driver.findElement(By.id("select2-itemId-container")).click(); Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(item); Thread.sleep(2000);
        driver.findElement(By.className("select2-results__option")).click(); Thread.sleep(2000);
//TODO Quantity
        driver.findElement(By.id("quantity")).sendKeys(String.valueOf(quantity)); Thread.sleep(2000);
//TODO AddButton
        driver.findElement(By.id("saveRequisitionItem")).click(); Thread.sleep(2000);
    }
    public static void Notes(String notes, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("notes")).sendKeys(notes); Thread.sleep(2000);
    }
    public static void Attachments(String file, WebDriver driver) throws InterruptedException {
//        driver.findElement(By.id("attachDocs")).click();
//        WebElement file1 = driver.findElement(By.id("formFilePreupload"));
//        file1.sendKeys(file);
//        driver.findElement(By.id("saveAttachments")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
//TODO Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,200)", "");Thread.sleep(2000);
         
//TODO CreateDraftButton
        driver.findElement(By.id("btnCreate")).click(); Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
//TODO SendForApprovalButton
        driver.findElement(By.id("btnSendApproval")).click(); Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click(); Thread.sleep(2000);
//TODO LoginAvatarButton
        driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click(); Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@onclick='user_logout()']")).click(); Thread.sleep(2000);
    }
    public static void CheckerLogin(String mailId, String pass, WebDriver driver) throws InterruptedException {
//TODO LoginPage
        driver.findElement(By.id("Input_Email")).sendKeys(mailId); Thread.sleep(2000);
        driver.findElement(By.id("Input_Password")).sendKeys(pass); Thread.sleep(2000);
        driver.findElement(By.id("login-submit")).click(); Thread.sleep(2000);
    }
    public static void CheckerApprove(String trnTitle, WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'"+ trnTitle +"')]")).click();Thread.sleep(2000);
//TODO Scroll
        WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Approve')]"));
        button.sendKeys(Keys.DOWN);  
        button.click(); Thread.sleep(2000);
//TODO ApproveButton
        driver.findElement(By.id("btnApprove")).click(); Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/form/input")).sendKeys("Approved"); Thread.sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click(); Thread.sleep(2000);
//TODO LoginAvatarButton
        driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click(); Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@onclick='user_logout()']")).click(); Thread.sleep(2000);
    }
    public static void GenPactLeadLogin(String mailId, String pass, WebDriver driver) throws InterruptedException {
//TODO LoginPage
        driver.findElement(By.id("Input_Email")).sendKeys(mailId); Thread.sleep(2000);
        driver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(2000);
        driver.findElement(By.id("login-submit")).click();Thread.sleep(2000);
    }
    public static void GenPactLeadAssign(String trnTitle, String genpactBuyer, WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'"+ trnTitle +"')]")).click();Thread.sleep(2000);
//TODO AssignBuyer
        driver.findElement(By.id("btnAssignUser")).click();Thread.sleep(2000);
        driver.findElement(By.id("select2-bgUser-container")).click();Thread.sleep(2000);
        driver.findElement(By.className("select2-search__field")).sendKeys(genpactBuyer);Thread.sleep(2000);
        driver.findElement(By.xpath("//li[contains(text(),'genpactbuyer@cormsquare.com')]")).click();Thread.sleep(2000);
        driver.findElement(By.id("saveBuyerUser")).click();Thread.sleep(2000);
//TODO LoginAvatarButton
        driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(2000);
    }
    public static void GenPactBuyerLogin(String mailId, String pass, WebDriver driver) throws InterruptedException {
//TODO LoginPage
        driver.findElement(By.id("Input_Email")).sendKeys(mailId);Thread.sleep(2000);
        driver.findElement(By.id("Input_Password")).sendKeys(pass);Thread.sleep(2000);
        driver.findElement(By.id("login-submit")).click();Thread.sleep(2000);
    }
    public static void GenPactBuyerPORCreate(String trnTitle, WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'"+ trnTitle +"')]")).click();Thread.sleep(2000);
//TODO PORCreate
        driver.findElement(By.id("btnCreatePOR")).click();Thread.sleep(2000);
//TODO Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,800)", "");Thread.sleep(2000);
    }
    public static void SpecialInstructions(String instructions, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("specialInstructions")).sendKeys(instructions);Thread.sleep(2000);
    }
    public static void PORNotes(String notes, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(2000);
    }
    public static void PORAttachments(String file, WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("attachDocs")).click();Thread.sleep(2000);
        WebElement file1 = driver.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);Thread.sleep(2000);
        driver.findElement(By.id("savePORAttachments")).click();Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();Thread.sleep(2000);
//TODO CreatePORButton
        driver.findElement(By.id("btnCreate")).click();Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        driver.close();Thread.sleep(2000);
    }
}
