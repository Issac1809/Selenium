import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

public class YokogawaSoftware {

    static void RequesterLoginPRCreate(String mailId, String pass, WebDriver datasw) throws InterruptedException {
        //Login Page
        datasw.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datasw.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datasw.findElement(By.id("login-submit")).click();

        //Create Button
        datasw.findElement(By.className("btn")).click();
        Thread.sleep(1000);

        //Type - Yokogawa HW/SW
        datasw.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]")).click();
    }

    static void Title(String title, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("title")).sendKeys(title);
        Thread.sleep(1000);
    }

    static void ShipToYokogawa(WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.className("type_checkbox")).click();
        Thread.sleep(1000);
    }

    static void Project(String Project, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("select2-projectId-container")).click();
        Thread.sleep(1000);
        datasw.findElement(By.className("select2-search__field")).sendKeys(Project);
        Thread.sleep(1000);
        datasw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void WBS(String wbs, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("select2-wbsId-container")).click();
        Thread.sleep(1000);
        datasw.findElement(By.className("select2-search__field")).sendKeys(wbs);
        Thread.sleep(1000);
        datasw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void Checker(String checkerid, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("select2-checkerId-container")).click();
        Thread.sleep(1000);
        datasw.findElement(By.className("select2-search__field")).sendKeys(checkerid);
        Thread.sleep(1000);
        datasw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
        //Scroll
        JavascriptExecutor scroll = (JavascriptExecutor) datasw;
        scroll.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);
    }

    static void ShippingAddress(WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("select2-shippingaddressId-container")).click();
        Thread.sleep(1000);
        datasw.findElement(By.className("select2-results__option")).click();
        Thread.sleep(1000);
    }

    static void ExpectedPOIssue(WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[2]")).click();
        Thread.sleep(1000);
        Select months = new Select(datasw.findElement(By.className("flatpickr-monthDropdown-months")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = datasw.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[26]"));
        day.click();
    }

    static void ExpectedDelivery(WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.xpath("//*[@id=\"dates\"]/div[2]/input[2]")).click();
        Thread.sleep(1000);
        Select months = new Select(datasw.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")));
        months.selectByVisibleText("December");
        Thread.sleep(1000);
        WebElement day = datasw.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[32]"));
        day.click();
    }

    static void TCAS(WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("tcasApplicable")).click();
        datasw.findElement(By.id("q1")).click();
        datasw.findElement(By.id("q2")).click();
        datasw.findElement(By.id("q3")).click();
        datasw.findElement(By.id("q4")).click();
        datasw.findElement(By.id("q5")).click();
        datasw.findElement(By.id("q6")).click();
        datasw.findElement(By.id("q7")).click();
        datasw.findElement(By.id("q8")).click();
        datasw.findElement(By.id("tcasSubmit")).click();
        Thread.sleep(1000);
    }

    static void TCASNumber(int number, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("tcasNumber")).sendKeys(String.valueOf(number));
        Thread.sleep(1000);
    }

    static void TCASFile(WebDriver datasw) throws InterruptedException, IOException {
        WebElement file = datasw.findElement(By.id("btnFileUpload"));
        Thread.sleep(5000);
        file.click();

        Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
    }

    static void SWFile(String swfile, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("swItemsId")).click();
        JavascriptExecutor scroll3 = (JavascriptExecutor) datasw;
        scroll3.executeScript("window.scrollBy(0,400)", "");
        datasw.findElement(By.id("iSWItem")).click();
        Thread.sleep(1000);
        WebElement file = datasw.findElement(By.xpath("//*[@id=\"formFileSW\"]"));
        Thread.sleep(2000);
        file.sendKeys(swfile);
        datasw.findElement(By.id("btnSWUpload")).click();
        Thread.sleep(40000);
        JavascriptExecutor scroll4 = (JavascriptExecutor) datasw;
        scroll4.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }

    static void Notes(String notes, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("notes")).sendKeys(notes);
        Thread.sleep(1000);
    }

    static void Attachments(String file, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("attachDocs")).click();
        Thread.sleep(1000);
        WebElement file1 = datasw.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        datasw.findElement(By.id("saveAttachments")).click();
        Thread.sleep(1000);
        datasw.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        JavascriptExecutor scroll4 = (JavascriptExecutor) datasw;
        scroll4.executeScript("window.scrollBy(0,200)", "");

        //Create Draft Button
        datasw.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
        datasw.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Send For Approval button
        datasw.findElement(By.id("btnSendApproval")).click();Thread.sleep(1000);
        datasw.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(2000);
        //Login Avatar Button
        datasw.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        datasw.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void CheckerLogin(String mailId, String pass, WebDriver datasw) throws InterruptedException {
        //Login Page
        datasw.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datasw.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datasw.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);
    }

    static void CheckerApprove(WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.xpath("//*[@id=\"listContainer\"]/tr[1]/td[6]/a")).click();
        Thread.sleep(1000);
        JavascriptExecutor checkerscroll = (JavascriptExecutor) datasw;
        checkerscroll.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
        JavascriptExecutor checkerscroll1 = (JavascriptExecutor) datasw;
        checkerscroll1.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(1000);
        datasw.findElement(By.id("btnApprove")).click();Thread.sleep(1000);
        datasw.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/form/input")).sendKeys("Approved");Thread.sleep(1000);
        datasw.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click();Thread.sleep(1000);

        //Login Avatar Button
        datasw.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
        datasw.findElement(By.xpath("//a[@onclick='user_logout()']")).click();Thread.sleep(1000);
    }

    static void RequesterLogin(String mailId, String pass, WebDriver datasw) throws InterruptedException {

        //Login Page
        datasw.findElement(By.id("Input_Email")).sendKeys(mailId);
        Thread.sleep(1000);
        datasw.findElement(By.id("Input_Password")).sendKeys(pass);
        Thread.sleep(1000);
        datasw.findElement(By.id("login-submit")).click();
        Thread.sleep(1000);
    }

    static void RequesterCreatePOR(WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();
        Thread.sleep(1000);
        datasw.findElement(By.id("btnCreatePOR")).click();
        Thread.sleep(1000);
        JavascriptExecutor Requesterscroll = (JavascriptExecutor) datasw;
        Requesterscroll.executeScript("window.scrollBy(0,800)", "");
    }

    static void Subtotal(int amount, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("subTotal")).sendKeys(Integer.toString(amount));
        Thread.sleep(1000);
    }

    static void StandardTF(int standardtf, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("standardTF")).sendKeys(Integer.toString(standardtf));
        Thread.sleep(1000);
    }

    static void SSTPDiscount(int sstpdiscount, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("sstpDiscount")).sendKeys(Integer.toString(sstpdiscount));
        Thread.sleep(1000);
        JavascriptExecutor Requesterscroll1 = (JavascriptExecutor) datasw;
        Requesterscroll1.executeScript("window.scrollBy(0,500)", "");
    }

    static void Instructions(String specialinstructions, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("specialInstructions")).sendKeys(specialinstructions);
        Thread.sleep(1000);
    }

    static void PORNotes(String notes, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("notes")).sendKeys(notes);
        Thread.sleep(1000);
    }

    static void PORAttachments(String file, WebDriver datasw) throws InterruptedException {
        datasw.findElement(By.id("attachDocs")).click();
        Thread.sleep(1000);
        WebElement file1 = datasw.findElement(By.id("formFilePreupload"));
        file1.sendKeys(file);
        Thread.sleep(5000);
        datasw.findElement(By.id("savePrAttachments")).click();
        Thread.sleep(1000);
        datasw.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        //Create POR Button
        datasw.findElement(By.id("btnCreate")).click();
        Thread.sleep(1000);
        datasw.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        datasw.close();
    }
}

