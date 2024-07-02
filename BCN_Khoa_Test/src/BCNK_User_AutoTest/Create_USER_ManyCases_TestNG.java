package BCNK_User_AutoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesChung.Login;
import PagesChung.Setup;
import PagesChung.TearDown;
import PagesUser.CheckCreate_user;
import PagesUser.ThucTe_user;
import PagesUser.UsEr;

public class Create_USER_ManyCases_TestNG {
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
	public void MGV_Điền_không_đủ_số() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (0 = dòng 1,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(0, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Mã số giảng viên phải từ 6 ký tự trở lên", driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 3
	@Test(priority = 3)
	public void MGV_Điền_Chữ_Không() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (1 = dòng 2,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(1, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Mã số giảng viên chỉ được 2 đến 3 ký tự chữ còn lại là số", driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 4
	@Test(priority = 4)
	public void MGV_Điền_ký_Hiệu() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (2 = dòng 3,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(2, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Chỉ được nhập số-chữ không dấu và không có khoảng trắng!", driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 5
	@Test(priority = 5)
	public void MGV_Điền_Khoảng_Trắng() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (3 = dòng 4,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(3, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Chỉ được nhập số-chữ không dấu và không có khoảng trắng!", driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 6
	@Test(priority = 6)
	public void TGV_Điền_Số() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (4 = dòng 5,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(4, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Chỉ được nhập tên giảng viên và không có khoảng trắng, ký tự, số!", driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 7
	@Test(priority = 7)
	public void TGV_Điền_từa_lưa_chữ() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (5 = dòng 6,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(5, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Tên giảng viên không đúng định dạng hoặc không tồn tại", driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
	@Test(priority = 8)
	public void TGV_Điền_Số_ký_tự() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (6 = dòng 7,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(6, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Chỉ được nhập tên giảng viên và không có khoảng trắng, ký tự, số!", driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 9
	@Test(priority = 9)
	public void TGV_Điền_Khoảng_Trắng() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_user checkcreate_user = new CheckCreate_user();
		// Gọi hàm đã được tạo (7 = dòng 8,0 = cột A,1 = cột B,2 = cột C "trong file excel")
		checkcreate_user.checkcreate_user(7, 0, 1, 2, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_user thongBao = new ThucTe_user();
		thongBao.thongBao("Chỉ được nhập tên giảng viên và không có khoảng trắng, ký tự, số!", driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		TearDown teardown = new TearDown();
		teardown.teardown(driver);
	}
}
