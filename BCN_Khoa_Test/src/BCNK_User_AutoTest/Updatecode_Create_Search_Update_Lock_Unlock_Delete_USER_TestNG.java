package BCNK_User_AutoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PagesChung.Login;
import PagesChung.Setup;
import PagesChung.TearDown;
import PagesUser.CreaTe_user;
import PagesUser.DeLete_user;
import PagesUser.LoCK_user;
import PagesUser.SeaRch_user;
import PagesUser.UnLock_user;
import PagesUser.UpDate_user;
import PagesUser.UsEr;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;

public class Updatecode_Create_Search_Update_Lock_Unlock_Delete_USER_TestNG {
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
	public void User() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UsEr user = new UsEr();
		user.user(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 2
	@Test(priority = 2)
	public void Create() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CreaTe_user create = new CreaTe_user();
		create.create(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 3
	@Test(priority = 3)
	public void Search() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		SeaRch_user search = new SeaRch_user();
		search.search(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 4
	@Test(priority = 4)
	public void Update() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UpDate_user update = new UpDate_user();
		update.update(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 5
	@Test(priority = 5)
	// Hiển thị thông báo User1
	public void User1() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UsEr user = new UsEr();
		user.user(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 6
	@Test(priority = 6)
	public void Search1() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		SeaRch_user search = new SeaRch_user();
		search.search(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 7
	@Test(priority = 7)
	public void Lock() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		LoCK_user lock = new LoCK_user();
		lock.lock(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
	@Test(priority = 8)
	public void User2() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UsEr user = new UsEr();
		user.user(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 9
	@Test(priority = 9)
	public void Search2() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		SeaRch_user search = new SeaRch_user();
		search.search(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 10
	@Test(priority = 10)
	public void Unlock() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UnLock_user unlock = new UnLock_user();
		unlock.unlock(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 11
	@Test(priority = 11)
	public void User3() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UsEr user = new UsEr();
		user.user(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 12
	@Test(priority = 12)
	public void Search3() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		SeaRch_user search = new SeaRch_user();
		search.search(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 13
	@Test(priority = 13)
	public void Delete() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		DeLete_user delete = new DeLete_user();
		delete.delete(driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		TearDown teardown = new TearDown();
		teardown.teardown(driver);
	}

}
