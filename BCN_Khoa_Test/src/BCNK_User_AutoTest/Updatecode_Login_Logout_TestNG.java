package BCNK_User_AutoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PagesChung.LogOut;
import PagesChung.Login;
import PagesChung.Setup;
import PagesChung.TearDown;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;

public class Updatecode_Login_Logout_TestNG {
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
	public void Logout() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		LogOut logout = new LogOut();
		logout.logout(driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		TearDown teardown = new TearDown();
		teardown.teardown(driver);
	}
}
