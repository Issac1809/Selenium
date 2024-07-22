import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderProcessing {

        public static void buyerPo(String Title, WebDriver OSDriver) throws InterruptedException{
            OSDriver.findElement(By.xpath("//span[contains(text(),'Purchase Orders')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//span[contains(text(),'"+ Title+"')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSendPO")).clear();Thread.sleep(1000);
            OSDriver.findElement(By.id("vendorSendMailBtnId")).click();
        }
        //PO Details - Log Out the Buyer ID
        static void buyerLogout1(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        //PO Vendor ID - Login
        static void vendorLogin1(String VendorEmail, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(VendorEmail);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        static void vendorPoDetails1(String Title, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Purchase Orders')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("/span[contains(text(),'"+ Title+"')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("btnCreateOR")).click();Thread.sleep(1000);
        }
        static void vendorCreateOSpage(String quantity1, String quantity2, String quantity3, WebDriver OSDriver) throws InterruptedException {
            //Create OS Lot 1
            OSDriver.findElement(By.id("btnToAddOS")).click();Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) OSDriver;
            js.executeScript("window.scroll(0, 350)", "");Thread.sleep(1000);

            //Date Field
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[2]")).click();Thread.sleep(1000);
            Select month = new Select(OSDriver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/select[1]")));Thread.sleep(1000);
            month.selectByVisibleText("November");
            WebElement day = OSDriver.findElement(By.xpath("//span[contains(text(),'27')]"));
            day.click();Thread.sleep(1000);

            //Quantity
            OSDriver.findElement(By.id("//input[contains(@name, 'quantity')]")).clear();Thread.sleep(1000);
            OSDriver.findElement(By.id("//input[contains(@name, 'quantity')]")).sendKeys(quantity1);Thread.sleep(1000);

            //Create OS Lot 2
            OSDriver.findElement(By.id("btnToAddOS")).click();Thread.sleep(1000);
            JavascriptExecutor js1 = (JavascriptExecutor) OSDriver;
            js1.executeScript("window.scroll(0, 350)", "");Thread.sleep(1000);

            //Date Field
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]")).click();Thread.sleep(1000);
            Select month1 = new Select(OSDriver.findElement(By.xpath("//body/div[9]/div[1]/div[1]/div[1]/select[1]")));
            month1.selectByVisibleText("November");
            WebElement day1 = OSDriver.findElement(By.xpath("//body/div[7]/div[2]/div[1]/div[2]/div[1]/span[29]"));
            day1.click();Thread.sleep(1000);

            //Quantity
            OSDriver.findElement(By.id("//input[contains(@name, 'quantity')]")).clear();
            OSDriver.findElement(By.id("//input[contains(@name, 'quantity')]")).sendKeys(quantity2);Thread.sleep(1000);

            //Create OS Lot 3
            OSDriver.findElement(By.id("btnToAddOS")).click();Thread.sleep(1000);
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 350)", "");Thread.sleep(1000);

            //Date Field
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/input[2]")).click();Thread.sleep(1000);
            Select month2 = new Select(OSDriver.findElement(By.xpath("//body/div[9]/div[1]/div[1]/div[1]/select[1]")));
            month2.selectByVisibleText("November");
            WebElement day2 = OSDriver.findElement(By.xpath("//body/div[10]/div[2]/div[1]/div[2]/div[1]/span[30]"));
            day2.click();Thread.sleep(1000);

            //Quantity
            OSDriver.findElement(By.id("//input[contains(@name, 'quantity')]")).clear();
            OSDriver.findElement(By.id("//input[contains(@name, 'quantity')]")).sendKeys(quantity3);Thread.sleep(1000);
        }
        //OS Notes
        static void vendorOsnotes(String notes, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("notes")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("notes")).sendKeys(notes);;Thread.sleep(1000);
        }
        //OS Submit button
        static void vendorSubmitButton(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        }
        //PO Details - Log Out the Vendor ID
        static void vendorLogout1(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        //PO Yokogawa buyer ID - Login
        static void buyerLogin1(String BuyerEmail, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(BuyerEmail);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        //PO details page - View order Schedule
        static void buyerPoDetails1(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Purchase Orders')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]")).click();Thread.sleep(1000);
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 750)", "");Thread.sleep(1000);
            OSDriver.findElement(By.id("BtnToApproveOS")).click();
        }
        //PO Details page - OS Approve
        static void buyerOsApprove(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("btnApprove")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();Thread.sleep(1000);
        }
        //PO Details - Log Out the Buyer ID
        static void buyerLogout2(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        //PO Details - Login the Vendor ID
        static void vendorLogin2(String VendorEmail, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(VendorEmail);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        //OS Details page - Vendor Send For Inspection
        static void vendorOsDetails1(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Order Schedules')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSendForInspection")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();Thread.sleep(1000);
        }
        //OS Vendor Logout
        static void vendorLogout2(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        // Requester ID - Login
        static void requesterLogin(String email, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(email);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        // OS details page
        static void requesterOsDetails(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Order Schedules')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]")).click();Thread.sleep(1000);
        }
        // Assign Inspection flow
        static void requesterAssignInspection(String assigner, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("btnAssignInspector")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("select2-InspectionId-container")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys(assigner);Thread.sleep(1000);
            OSDriver.findElement(By.id("saveInspector")).click();Thread.sleep(1000);
        }
        //Create Inspection page
        static void requesterCreateInspection(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("btnForCreateInspection")).click();
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 750)", "");Thread.sleep(1000);
        }
        static void requesterInspectionNotes(String notes, String filename, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("notes")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("notes")).sendKeys(notes);Thread.sleep(1000);
//Attachments
            OSDriver.findElement(By.id("attachDocs")).click();Thread.sleep(1000);
            WebElement file = (OSDriver.findElement(By.id("formFilePreupload")));
            file.sendKeys(filename);Thread.sleep(1000);
            OSDriver.findElement(By.id("saveAttachments")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("btn-primary")).click();Thread.sleep(1000);
//Create inspection button
            OSDriver.findElement(By.id("btnCreateInspection")).click();Thread.sleep(1000);
        }
        //Requester Logout
        static void requesterlogout(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        //PO Vendor ID - Login
        static void vendorLogin3(String VendorEmail, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(VendorEmail);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        //OS Details page Vendor ID
        static void vendorOsDetails2(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Order Schedules')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[5]/td[6]/a[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("btnCreateDispatchNote")).click();Thread.sleep(1000);
        }
        // DN page Create
        static void vendorCreateDnDate(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[2]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[2]")).click();Thread.sleep(1000);
            Select month = new Select(OSDriver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/select[1]")));
            month.selectByVisibleText("November");Thread.sleep(1000);
            WebElement day = OSDriver.findElement(By.xpath("//span[contains(text(),'27')]"));
            day.click();Thread.sleep(1000);
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 550)", "");Thread.sleep(1000);
        }
        //DN Packages
        static void vendorDnPackages(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("addDispatchNotePackages")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Package Type --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("select2-packagetypeId-result-yoif-Barrel")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("grossWeight")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("grossWeight")).sendKeys("43");Thread.sleep(1000);
            OSDriver.findElement(By.id("netWeight")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("netWeight")).sendKeys("4");Thread.sleep(1000);
            OSDriver.findElement(By.id("volume")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("volume")).sendKeys("4");Thread.sleep(1000);
            OSDriver.findElement(By.id("quantity")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("quantity")).sendKeys("4");Thread.sleep(1000);
            OSDriver.findElement(By.id("description")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("description")).sendKeys("Description");Thread.sleep(1000);
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 550)", "");Thread.sleep(1000);
        }
        //DN Create button in Vendor ID
        static void buyerDnCreate(WebDriver OSDriver) throws InterruptedException {
            WebElement file = (OSDriver.findElement(By.cssSelector("body.pace-done.has-navbar-vertical-aside.navbar-vertical-aside-show-xl.footer-offset:nth-child(3) main.main:nth-child(7) div.content.container-fluid div.card.mb-3.mt-1.mb-lg-5:nth-child(8) div.card-body div.row.mb-3 table.table.table-bordered tbody:nth-child(2) tr:nth-child(3) td:nth-child(4) > button.btn.btn-sm.btn-primary:nth-child(2)")));
            file.sendKeys("C:\\Users\\Vidya Abbigeri\\Downloads\\ImportRequisitionYokogawaPOCHWItems (3).xlsx");Thread.sleep(1000);
            WebElement file1 = (OSDriver.findElement(By.cssSelector("body.pace-done.has-navbar-vertical-aside.navbar-vertical-aside-show-xl.footer-offset:nth-child(3) main.main:nth-child(7) div.content.container-fluid div.card.mb-3.mt-1.mb-lg-5:nth-child(8) div.card-body div.row.mb-3 table.table.table-bordered tbody:nth-child(2) tr:nth-child(4) td:nth-child(4) > button.btn.btn-sm.btn-primary:nth-child(2)")));
            file1.sendKeys("C:\\Users\\Vidya Abbigeri\\Downloads\\ImportRequisitionYokogawaPOCHWItems (3).xlsx");Thread.sleep(1000);
            OSDriver.findElement(By.id("btnCreate")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();Thread.sleep(1000);
        }
        //DN Vendor Logout
        static void vendorLogout3(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        //DN Buyer ID - Login
        static void buyerLogin2(String BuyerEmail, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(BuyerEmail);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        //DN Details page Buyer ID - Assign Buyer
        static void buyerDnDetails(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Dispatch Notes')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("btnToAssign")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("select2-assignerId-container")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[6]/span[1]/span[1]/span[1]/input[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[6]/span[1]/span[1]/span[1]/input[1]")).sendKeys("genpactbuyer@cormsquare.com");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option--highlighted")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("saveAssine")).click();Thread.sleep(1000);
        }
        //WO Buyer ID - WO Create page
        static void woCreatePage(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("btnToCreateWorkOrder")).click();
            //Assigning Freight Forwarder
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Freight Forwarder --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).sendKeys("alpha limited");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option--highlighted")).click();Thread.sleep(1000);
            //Priority field
            OSDriver.findElement(By.xpath("//span[contains(text(),'Priority --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("select2-priority-result-bl68-High")).click();Thread.sleep(1000);
            //Delivery Date
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[1]/div[2]/div[4]/div[3]/input[2]")).click();
            Select month2 = new Select(OSDriver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/select[1]")));
            month2.selectByVisibleText("November");
            WebElement day2 = OSDriver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[2]/div[1]/span[28]"));
            day2.click();Thread.sleep(1000);
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 750)", "");Thread.sleep(1000);
            //Create WO Button
            OSDriver.findElement(By.id("btnToCreateWorkOrder")).click();
            OSDriver.findElement(By.className("bootbox-accept")).click();
        }
        //Buyer Logout
        static void buyerLogout3(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        //Vendor ID - Login
        static void vendorLogin4(String VendorEmail, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(VendorEmail);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        //WO Details page
        static void vendorWoDetails(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Work Orders')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();Thread.sleep(1000);
            //1st status
            //Selecting Present Date
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/input[2]")).click();  	    Thread.sleep(1000);
            WebElement presentDateElement = OSDriver.findElement(By.xpath("//span[@class='flatpickr-day today']"));Thread.sleep(1000);
            presentDateElement.click();Thread.sleep(1000);
            //Status Selection
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Status --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys("Material");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).sendKeys("No Remarks");Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSubmit")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("bootbox-accept")).click();Thread.sleep(1000);
            //2nd status
            //Selecting Present Date
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/input[2]")).click();  	    Thread.sleep(1000);
            WebElement presentDateElement1 = OSDriver.findElement(By.xpath("//span[@class='flatpickr-day today']"));Thread.sleep(1000);
            presentDateElement1.click();Thread.sleep(1000);
            //Status Selection
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Status --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys("ETD");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).sendKeys("No Remarks");Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSubmit")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("bootbox-accept")).click();Thread.sleep(1000);
            //3rd status
            //Selecting Present Date
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/input[2]")).click();  	    Thread.sleep(1000);
            WebElement presentDateElement2 = OSDriver.findElement(By.xpath("//span[@class='flatpickr-day today']"));Thread.sleep(1000);
            presentDateElement2.click();Thread.sleep(1000);
            //Status Selection
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Status --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys("Arrival");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).sendKeys("No Remarks");Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSubmit")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("bootbox-accept")).click();Thread.sleep(1000);
            //4th status
            //Selecting Present Date
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/input[2]")).click();  	    Thread.sleep(1000);
            WebElement presentDateElement3 = OSDriver.findElement(By.xpath("//span[@class='flatpickr-day today']"));Thread.sleep(1000);
            presentDateElement3.click();Thread.sleep(1000);
            //Status Selection
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Status --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys("Import");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).sendKeys("No Remarks");Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSubmit")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("bootbox-accept")).click();Thread.sleep(1000);
            //5th status
            //Selecting Present Date
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/input[2]")).click();  	    Thread.sleep(1000);
            WebElement presentDateElement4 = OSDriver.findElement(By.xpath("//span[@class='flatpickr-day today']"));Thread.sleep(1000);
            presentDateElement4.click();Thread.sleep(1000);
            //Status Selection
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Status --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys("Out");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).sendKeys("No Remarks");Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSubmit")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("bootbox-accept")).click();Thread.sleep(1000);
            //5th status
            //Selecting Present Date
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/input[2]")).click();  	    Thread.sleep(1000);
            WebElement presentDateElement5 = OSDriver.findElement(By.xpath("//span[@class='flatpickr-day today']"));Thread.sleep(1000);
            presentDateElement5.click();Thread.sleep(1000);
            //Status Selection
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Status --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys("completed");Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("remarks")).sendKeys("No Remarks");Thread.sleep(1000);
            OSDriver.findElement(By.id("btnSubmit")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("bootbox-accept")).click();Thread.sleep(1000);
        }
        //Vendor Invoice Page page
        static void vendorInvoicePage(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Invoices')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/div[1]/div[1]/div[2]/a[1]")).click();Thread.sleep(1000);
        }
        //Vendor Invoice Create Page page
        static void vendorInvoiceCreate(String type, String invNum, String notes, String poNum, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Select Invoice Type --')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).click();Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-search__field")).sendKeys(type);Thread.sleep(1000);
            OSDriver.findElement(By.className("select2-results__option")).click();Thread.sleep(1000);
            //Invoice Number Field
            OSDriver.findElement(By.id("invoiceNumber")).click();Thread.sleep(1000);
            OSDriver.findElement(By.id("invoiceNumber")).sendKeys(invNum);Thread.sleep(1000);
            //Invoice date Field
            OSDriver.findElement(By.xpath("//body/main[@id='content']/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[2]")).click();Thread.sleep(1000);
            Select month2 = new Select(OSDriver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/select[1]")));
            month2.selectByVisibleText("November");
            WebElement day2 = OSDriver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[1]/span[28]"));
            day2.click();Thread.sleep(1000);
            //Notes Field
            OSDriver.findElement(By.id("notes")).click();
            OSDriver.findElement(By.id("notes")).sendKeys(notes);
            //Purchase Order Number Field
            OSDriver.findElement(By.xpath("//span[contains(text(),'-- Search by Purchase Order Number --')]")).click();
            OSDriver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).click();
            OSDriver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]")).sendKeys(poNum);
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 750)", "");Thread.sleep(1000);
            //Attachments
            WebElement file = (OSDriver.findElement(By.xpath("//tbody/tr[1]/td[4]/button[1]")));
            file.sendKeys("C:\\Users\\Vidya Abbigeri\\Downloads\\ImportRequisitionYokogawaPOCHWItems (3).xlsx");Thread.sleep(1000);
            //Create Button
            OSDriver.findElement(By.id("btnCreate")).click();
            OSDriver.findElement(By.className("bootbox-accept")).click();
        }
        //Invoice Vendor Logout
        static void vendorLogout4(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//a[contains(text(),'out')]")).click();Thread.sleep(1000);
        }
        //Buyer ID - Login
        static void buyerLogin3(String BuyerEmail, String Password, WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.id("Input_Email")).sendKeys(BuyerEmail);Thread.sleep(1000);
            OSDriver.findElement(By.id("Input_Password")).sendKeys(Password);Thread.sleep(1000);
            OSDriver.findElement(By.id("login-submit")).click();Thread.sleep(1000);
        }
        //Invoice details page
        static void buyerInvoiceDetails(WebDriver OSDriver) throws InterruptedException {
            OSDriver.findElement(By.xpath("//span[contains(text(),'Invoices')]")).click();Thread.sleep(1000);
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]")).click();Thread.sleep(1000);
            JavascriptExecutor js2 = (JavascriptExecutor) OSDriver;
            js2.executeScript("window.scroll(0, 750)", "");Thread.sleep(1000);
            //Invoice 1st CheckList button & popup
            OSDriver.findElement(By.xpath("//tbody/tr[1]/td[6]/button[1]")).click();
            OSDriver.findElement(By.id("selctAllId")).click();
            OSDriver.findElement(By.id("acceptCheckListId")).click();
            JavascriptExecutor js3 = (JavascriptExecutor) OSDriver;
            js3.executeScript("window.scroll(0, 350)", "");Thread.sleep(1000);
            //Invoice 2nd checklist button & Popup
            OSDriver.findElement(By.xpath("//tbody/tr[2]/td[6]/button[1]")).click();
            OSDriver.findElement(By.id("acceptCheckListId")).click();
            JavascriptExecutor js4 = (JavascriptExecutor) OSDriver;
            js4.executeScript("window.scroll(0, 350)", "");Thread.sleep(1000);
            //Invoice Verify button
            OSDriver.findElement(By.id("btnAccept")).click();
            OSDriver.findElement(By.className("bootbox-input")).sendKeys("No Remarks");
            OSDriver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[3]/button[1]"));
        }
    }
