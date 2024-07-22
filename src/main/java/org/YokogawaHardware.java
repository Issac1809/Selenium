import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class YokogawaHardware {

    static void RequesterLoginPRCreate(String mailId, String pass, WebDriver datahw) throws InterruptedException {
        //Login Page
        datahw.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datahw.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datahw.findElement(By.id("login-submit")).click();

        //Create Button
        datahw.findElement(By.className("btn")).click();
        Thread.sleep(1000);

        //Type - Yokogawa HW/SW
        datahw.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]")).click();
    }

    static void Title(String title, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("title")).sendKeys(title);
        Thread.sleep(1000);
    }

    static void ShipToYokogawa(WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.className("type_checkbox")).click();
        Thread.sleep(1000);
    }

    static void Project(String Project, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("select2-projectId-container")).click();
        Thread.sleep(1000);
        datahw.findElement(By.className("select2-search__field")).sendKeys(Project);
        Thread.sleep(1000);
        datahw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void WBS(String wbs, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("select2-wbsId-container")).click();
        Thread.sleep(1000);
        datahw.findElement(By.className("select2-search__field")).sendKeys(wbs);
        Thread.sleep(1000);
        datahw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void Checker(String checkerid, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("select2-checkerId-container")).click();
        Thread.sleep(1000);
        datahw.findElement(By.className("select2-search__field")).sendKeys(checkerid);
        Thread.sleep(1000);
        datahw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) datahw;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }

    static void ShippingAddress(WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("select2-shippingaddressId-container")).click();
        Thread.sleep(1000);
        datahw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void ExpectedPOIssue(WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[2]")).click();
        Thread.sleep(1000);
        Select months = new Select(datahw.findElement(By.className("flatpickr-monthDropdown-months")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = datahw.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[26]"));
        day.click();
    }

    static void ExpectedDelivery(WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.xpath("//*[@id=\"dates\"]/div[2]/input[2]")).click();
        Thread.sleep(1000);
        Select months = new Select(datahw.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = datahw.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[32]"));
        day.click();
    }

    static void TCAS(WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("tcasApplicable")).click();
        datahw.findElement(By.id("q1")).click();
        datahw.findElement(By.id("q2")).click();
        datahw.findElement(By.id("q3")).click();
        datahw.findElement(By.id("q4")).click();
        datahw.findElement(By.id("q5")).click();
        datahw.findElement(By.id("q6")).click();
        datahw.findElement(By.id("q7")).click();
        datahw.findElement(By.id("q8")).click();
        datahw.findElement(By.id("tcasSubmit")).click();
        Thread.sleep(1000);
    }

    static void TCASNumber(int number, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("tcasNumber")).sendKeys(String.valueOf(number));
        Thread.sleep(1000);
    }

    static void TCASFile(WebDriver datahw) throws InterruptedException, IOException {
        WebElement file = datahw.findElement(By.id("btnFileUpload"));
        Thread.sleep(5000);
        file.click();

        Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
    }

    static void HWFile(String hwfile, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("hwItemsId")).click();
        JavascriptExecutor scroll3 = (JavascriptExecutor) datahw;
        scroll3.executeScript("window.scrollBy(0,400)", "");
        datahw.findElement(By.id("iHWItem")).click();
        Thread.sleep(1000);
        WebElement file = datahw.findElement(By.id("formFileHW"));
        Thread.sleep(2000);
        file.sendKeys(hwfile);
        datahw.findElement(By.id("formFileHW")).click();
        Thread.sleep(40000);
        JavascriptExecutor scroll4 = (JavascriptExecutor) datahw;
        scroll4.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }

    static void Notes(String notes, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("notes")).sendKeys(notes);
        Thread.sleep(1000);
    }

    static void Attachments(String file, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("attachDocs")).click();
        Thread.sleep(1000);
        WebElement file1 = datahw.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        datahw.findElement(By.id("saveAttachments")).click();
        Thread.sleep(1000);
        datahw.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        JavascriptExecutor scroll4 = (JavascriptExecutor) datahw;
        scroll4.executeScript("window.scrollBy(0,200)", "");

        //Create Draft Button
        datahw.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Send For Approval button
        datahw.findElement(By.id("btnSendApproval")).click();Thread.sleep(1000);
        datahw.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Login Avatar Button
        datahw.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        datahw.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void CheckerLogin(String mailId, String pass, WebDriver datahw) throws InterruptedException {
        //Login Page
        datahw.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datahw.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datahw.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);
    }

    static void CheckerApprove(WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.xpath("//*[@id=\"listContainer\"]/tr[1]/td[6]/a")).click();
        Thread.sleep(1000);
        JavascriptExecutor checkerscroll = (JavascriptExecutor) datahw;
        checkerscroll.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
        JavascriptExecutor checkerscroll1 = (JavascriptExecutor) datahw;
        checkerscroll1.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
        datahw.findElement(By.id("btnApprove")).click();Thread.sleep(1000);
        datahw.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/form/input")).sendKeys("Approved");Thread.sleep(1000);
        datahw.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click();Thread.sleep(1000);

        //Login Avatar Button
        datahw.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        datahw.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void RequesterLogin(String mailId, String pass, WebDriver datahw) throws InterruptedException {

        //Login Page
        datahw.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datahw.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datahw.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);
    }

    static void RequesterCreatePOR(WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();
        Thread.sleep(1000);
        datahw.findElement(By.id("btnCreatePOR")).click();
        Thread.sleep(1000);
        JavascriptExecutor Requesterscroll = (JavascriptExecutor) datahw;
        Requesterscroll.executeScript("window.scrollBy(0,800)", "");
    }

    static void Subtotal(int amount, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("subTotal")).sendKeys(Integer.toString(amount));
        Thread.sleep(1000);
    }

    static void StandardTF(int standardtf, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("standardTF")).sendKeys(Integer.toString(standardtf));
        Thread.sleep(1000);
    }

    static void SSTPDiscount(int sstpdiscount, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("sstpDiscount")).sendKeys(Integer.toString(sstpdiscount));
        Thread.sleep(1000);
        JavascriptExecutor Requesterscroll1 = (JavascriptExecutor) datahw;
        Requesterscroll1.executeScript("window.scrollBy(0,500)", "");
    }

    static void Instructions(String specialinstructions, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("specialInstructions")).sendKeys(specialinstructions);
        Thread.sleep(1000);
    }

    static void PORNotes(String notes, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("notes")).sendKeys(notes);
        Thread.sleep(1000);
    }

    static void PORAttachments(String file, WebDriver datahw) throws InterruptedException {
        datahw.findElement(By.id("attachDocs")).click();
        Thread.sleep(1000);
        WebElement file1 = datahw.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        datahw.findElement(By.id("savePrAttachments")).click();
        Thread.sleep(1000);
        datahw.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        //Create POR Button
        datahw.findElement(By.id("btnCreate")).click();
        Thread.sleep(1000);
        datahw.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
    }
}