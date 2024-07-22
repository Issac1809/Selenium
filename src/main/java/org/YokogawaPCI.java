import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class YokogawaPCI {

    static void RequesterLoginPRCreate(String mailId, String pass, WebDriver datapci) throws InterruptedException {
        //Login Page
        datapci.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datapci.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datapci.findElement(By.id("login-submit")).click();

        //Create Button
        datapci.findElement(By.className("btn")).click();
        Thread.sleep(1000);

        //Type - Yokogawa HW/SW
        datapci.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]")).click();
    }

    static void Title(String title, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("title")).sendKeys(title);
        Thread.sleep(1000);
    }

    static void ShipToYokogawa(WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.className("type_checkbox")).click();
        Thread.sleep(1000);
    }

    static void Project(String Project, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("select2-projectId-container")).click();
        Thread.sleep(1000);
        datapci.findElement(By.className("select2-search__field")).sendKeys(Project);
        Thread.sleep(1000);
        datapci.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void WBS(String wbs, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("select2-wbsId-container")).click();
        Thread.sleep(1000);
        datapci.findElement(By.className("select2-search__field")).sendKeys(wbs);
        Thread.sleep(1000);
        datapci.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void Checker(String checkerid, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("select2-checkerId-container")).click();
        Thread.sleep(1000);
        datapci.findElement(By.className("select2-search__field")).sendKeys(checkerid);
        Thread.sleep(1000);
        datapci.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) datapci;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }

    static void ShippingAddress(WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("select2-shippingaddressId-container")).click();
        Thread.sleep(1000);
        datapci.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void ExpectedPOIssue(WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[2]")).click();
        Thread.sleep(1000);
        Select months = new Select(datapci.findElement(By.className("flatpickr-monthDropdown-months")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = datapci.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[26]"));
        day.click();
    }

    static void ExpectedDelivery(WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.xpath("//*[@id=\"dates\"]/div[2]/input[2]")).click();
        Thread.sleep(1000);
        Select months = new Select(datapci.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = datapci.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[32]"));
        day.click();
    }

    static void TCAS(WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("tcasApplicable")).click();
        datapci.findElement(By.id("q1")).click();
        datapci.findElement(By.id("q2")).click();
        datapci.findElement(By.id("q3")).click();
        datapci.findElement(By.id("q4")).click();
        datapci.findElement(By.id("q5")).click();
        datapci.findElement(By.id("q6")).click();
        datapci.findElement(By.id("q7")).click();
        datapci.findElement(By.id("q8")).click();
        datapci.findElement(By.id("tcasSubmit")).click();
        Thread.sleep(1000);
    }

    static void TCASNumber(int number, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("tcasNumber")).sendKeys(String.valueOf(number));
        Thread.sleep(1000);
//      datapci.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    static void TCASFile(WebDriver datapci) throws InterruptedException, IOException {
        WebElement file = datapci.findElement(By.id("btnFileUpload"));
        Thread.sleep(5000);
        file.click();

        Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
    }

    static void PCIFile(String pcifile, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("pcItemsId")).click();
        JavascriptExecutor scroll3 = (JavascriptExecutor) datapci;
        scroll3.executeScript("window.scrollBy(0,400)", "");
        datapci.findElement(By.id("iPICItem")).click();
        Thread.sleep(1000);
        WebElement file = datapci.findElement(By.id("formFilePCI"));
        Thread.sleep(2000);
        file.sendKeys(pcifile);
        datapci.findElement(By.id("btnPCIUpload")).click();
        Thread.sleep(40000);
        JavascriptExecutor scroll4 = (JavascriptExecutor) datapci;
        scroll4.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }

    static void Notes(String notes, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("notes")).sendKeys(notes);
        Thread.sleep(1000);
    }

    static void Attachments(String file, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("attachDocs")).click();
        Thread.sleep(1000);
        WebElement file1 = datapci.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        datapci.findElement(By.id("saveAttachments")).click();
        Thread.sleep(1000);
        datapci.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        JavascriptExecutor scroll4 = (JavascriptExecutor) datapci;
        scroll4.executeScript("window.scrollBy(0,200)", "");

        //Create Draft Button
        datapci.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Send For Approval button
        datapci.findElement(By.id("btnSendApproval")).click();Thread.sleep(1000);
        datapci.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Login Avatar Button
        datapci.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        datapci.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void CheckerLogin(String mailId, String pass, WebDriver datapci) throws InterruptedException {
        //Login Page
        datapci.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datapci.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datapci.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);
    }

    static void CheckerApprove(WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.xpath("//*[@id=\"listContainer\"]/tr[1]/td[6]/a")).click();
        Thread.sleep(1000);
        JavascriptExecutor checkerscroll = (JavascriptExecutor) datapci;
        checkerscroll.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
        JavascriptExecutor checkerscroll1 = (JavascriptExecutor) datapci;
        checkerscroll1.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
        datapci.findElement(By.id("btnApprove")).click();Thread.sleep(1000);
        datapci.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/form/input")).sendKeys("Approved");Thread.sleep(1000);
        datapci.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click();Thread.sleep(1000);

        //Login Avatar Button
        datapci.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        datapci.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void RequesterLogin(String mailId, String pass, WebDriver datapci) throws InterruptedException {

        //Login Page
        datapci.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datapci.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datapci.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);
    }

    static void RequesterCreatePOR(WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();
        Thread.sleep(1000);
        datapci.findElement(By.id("btnCreatePOR")).click();
        Thread.sleep(1000);
        JavascriptExecutor Requesterscroll = (JavascriptExecutor) datapci;
        Requesterscroll.executeScript("window.scrollBy(0,800)", "");
    }

    static void Subtotal(int amount, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("subTotal")).sendKeys(Integer.toString(amount));
        Thread.sleep(1000);
    }

    static void StandardTF(int standardtf, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("standardTF")).sendKeys(Integer.toString(standardtf));
        Thread.sleep(1000);
    }

    static void SSTPDiscount(int sstpdiscount, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("sstpDiscount")).sendKeys(Integer.toString(sstpdiscount));
        Thread.sleep(1000);
        JavascriptExecutor Requesterscroll1 = (JavascriptExecutor) datapci;
        Requesterscroll1.executeScript("window.scrollBy(0,500)", "");
    }

    static void Instructions(String specialinstructions, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("specialInstructions")).sendKeys(specialinstructions);
        Thread.sleep(1000);
    }

    static void PORNotes(String notes, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("notes")).sendKeys(notes);
        Thread.sleep(1000);
    }

    static void PORAttachments(String file, WebDriver datapci) throws InterruptedException {
        datapci.findElement(By.id("attachDocs")).click();
        Thread.sleep(1000);
        WebElement file1 = datapci.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        datapci.findElement(By.id("savePrAttachments")).click();
        Thread.sleep(1000);
        datapci.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        //Create POR Button
        datapci.findElement(By.id("btnCreate")).click();
        Thread.sleep(1000);
        datapci.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
    }
}
