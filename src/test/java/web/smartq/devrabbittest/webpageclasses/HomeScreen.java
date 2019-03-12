package web.smartq.devrabbittest.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.144:8080/SmartQE/UploadReportFile\",\"project_name\":\"SmartQ\",\"project_description\":\"xd\",\"project_id\":238,\"module_name\":\"DevrabbitTest\",\"module_description\":\"aa\",\"sub_module_id\":0,\"module_id\":380,\"testcase_name\":\"TC_TEW\",\"testcase_id\":442,\"testset_id\":0,\"executed_timestamp\":1888174464,\"browser_type\":\"chrome\"}";

	public static String projectName = "smartq";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_301773A;
	public void clkAContact_301773() {
		waitForExpectedElement(driver, Contact_301773A);		
		String text = Contact_301773A.getText();
		Contact_301773A.click();
	}

}