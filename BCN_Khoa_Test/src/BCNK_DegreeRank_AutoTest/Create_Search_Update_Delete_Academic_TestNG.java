package BCNK_DegreeRank_AutoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesChung.Login;
import PagesChung.Setup;
import PagesChung.TearDown;
import PagesDegree.CreaTe_academicdegree;
import PagesDegree.Delete_academicdegree;
import PagesDegree.Search_academicdegree;
import PagesDegree.Update_academicdegree;

public class Create_Search_Update_Delete_Academic_TestNG {
	// Khai báo một biến driver kiểu WebDriver với mức độ truy cập là private
			private WebDriver driver;

			@BeforeTest
			public void Main() throws IOException, InterruptedException {
				// Nhận tham số đã được chuyền từ pages object modal
				// Nhận dữ liệu từ phương thức setup
				Setup setup = new Setup();
				driver = setup.setup();
			}

			// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 0
			@Test(priority = 0)
			public void Login() throws InterruptedException {
				// Nhận tham số đã được chuyền từ pages object modal
				Login login = new Login();
				login.login(driver);

			}
			// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 1
			@Test(priority = 1)
			public void Create() throws InterruptedException {
				// Nhận tham số đã được chuyền từ pages object modal
				CreaTe_academicdegree performActions = new CreaTe_academicdegree();
				performActions.performActions(driver);

			}
			// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 2
			@Test(priority = 2)
			public void Search() throws InterruptedException {
				// Nhận tham số đã được chuyền từ pages object modal
				Search_academicdegree performActions = new Search_academicdegree();
				performActions.performActions(driver);
			}
			// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 3
			@Test(priority = 3)
			public void Update() throws InterruptedException {
				// Nhận tham số đã được chuyền từ pages object modal
				Update_academicdegree performActions = new Update_academicdegree();
				performActions.performActions(driver);
			}
			// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 4
			@Test(priority = 4)
			public void Delete() throws InterruptedException {
				// Nhận tham số đã được chuyền từ pages object modal
				Delete_academicdegree performActions = new Delete_academicdegree();
				performActions.performActions(driver);
			}
			@AfterClass
			public void tearDown() throws InterruptedException {
				// Nhận tham số đã được chuyền từ pages object modal
				TearDown teardown = new TearDown();
				teardown.teardown(driver);
			}
}
