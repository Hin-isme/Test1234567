package BCNK_User_AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Search_Update_Lock_Unlock_Delete_USER_TestNG {
	// Khai báo một biến driver kiểu WebDriver với mức độ truy cập là private
	private WebDriver driver;
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 0
	@Test(priority = 0)
	public void Login() throws InterruptedException {
		// Hiển thị thông báo Login
		System.out.println("Login");
		// Mở trang web https://cntttest.vanlanguni.edu.vn:18081/Phancong02/
		driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/");
		// Tìm và nhấp chuột vào phần tử được xác định bằng XPath để thực hiện hành động
		driver.findElement(By.xpath("/html/body/div/div[2]/button[3]")).click();
		// Tìm và nhấp chuột vào phần tử được xác định bằng XPath để thực hiện hành động
		driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/a")).click();
		// Tìm và nhấp chuột vào phần tử được xác định bằng XPath để thực hiện hành động
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/form/div/div/div/button")).click();
        // Dừng thực thi của chương trình trong 2 giây
        Thread.sleep(2000);
        // Tìm phần tử bằng id "i0116" và nhập chuỗi "hien.2174802010946@vanlanguni.vn" vào phần tử đó
        driver.findElement(By.id("i0116")).sendKeys("hien.2174802010946@vanlanguni.vn");
        // Dừng thực thi của chương trình trong 2 giây
        Thread.sleep(2000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[4]/div/div/div/div/input")).click();
        // Dừng thực thi của chương trình trong 2 giây
        Thread.sleep(2000);
        // Tìm phần tử bằng id "i0118" và nhập chuỗi "VLU01122003" vào phần tử đó
        driver.findElement(By.id("i0118")).sendKeys("VLU01122003");
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[5]/div/div/div/div/input")).click();
        // Dừng thực thi của chương trình trong 14 giây
        Thread.sleep(14000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[1]/div/label/input")).click();
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 1
	@Test(priority = 1)
	public void User() throws InterruptedException {
		// Hiển thị thông báo User
		System.out.println("User");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 2
	@Test(priority = 2)
	public void Create() throws InterruptedException {
		// Hiển thị thông báo Create User
		System.out.println("Create User");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/button")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "2174802010637" vào phần tử đó
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[1]/input")).sendKeys("2174802010637");
        // Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "Phạm Quốc Thái" vào phần tử đó
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[2]/input")).sendKeys("Phạm Quốc Thái");
        // Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "thai.2174802010637@vanlanguni.vn" vào phần tử đó
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/input")).sendKeys("thai.2174802010637@vanlanguni.vn");
        // Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span/span[1]/span/span[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[2]/span/span[2]/ul/li[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span/span[1]/span")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span[2]/span/span[2]/ul/li[3]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[7]/button[2]")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 3
	@Test(priority = 3)
	public void Search() throws InterruptedException {
		// Hiển thị thông báo Search
		System.out.println("Search");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "Phạm Quốc Thái" vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).sendKeys("Phạm Quốc Thái");
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 4
	@Test(priority = 4)
	public void Update() throws InterruptedException {
		// Hiển thị thông báo Update
		System.out.println("Update");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/table/tbody/tr/td[7]/a[1]/i")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span/span[1]/span/span[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[2]/span/span[2]/ul/li[2]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span/span[1]/span/span[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span[2]/span/span[2]/ul/li[2]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[7]/button[2]")).click();	
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 5
	@Test(priority = 5)
	// Hiển thị thông báo User1
	public void User1() throws InterruptedException {
		System.out.println("User1");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 6
	@Test(priority = 6)
	public void Search1() throws InterruptedException {
		// Hiển thị thông báo Search1
		System.out.println("Search1");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "Phạm Quốc Thái" vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).sendKeys("Phạm Quốc Thái");
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 7
	@Test(priority = 7)
	public void Lock() throws InterruptedException {
		// Hiển thị thông báo Lock
		System.out.println("Lock");
		
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/label/div/span[1]/span[1]/span/ul/li[6]/input")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/label/div/span[2]/span/span/ul/li[7]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/table/tbody/tr/td[7]/div/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
	@Test(priority = 8)
	public void User2() throws InterruptedException {
		// Hiển thị thông báo User2
		System.out.println("User2");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 9
	@Test(priority = 9)
	public void Search2() throws InterruptedException {
		// Hiển thị thông báo Search2
		System.out.println("Search2");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "Phạm Quốc Thái" vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).sendKeys("Phạm Quốc Thái");
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 10
	@Test(priority = 10)
	public void Unlock() throws InterruptedException {
		// Hiển thị thông báo Unlock
		System.out.println("Unlock");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/label/div/span[1]/span[1]/span/ul/li[6]/input")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/label/div/span[2]/span/span/ul/li[7]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/table/tbody/tr/td[7]/div/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 11
	@Test(priority = 11)
	public void User3() throws InterruptedException {
		// Hiển thị thông báo User3
		System.out.println("User3");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 12
	@Test(priority = 12)
	public void Search3() throws InterruptedException {
		// Hiển thị thông báo Search3
		System.out.println("Search3");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "Phạm Quốc Thái" vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).sendKeys("Phạm Quốc Thái");
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 13
	@Test(priority = 13)
	public void Delete() throws InterruptedException {
		// Hiển thị thông báo Delete
		System.out.println("Delete");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/table/tbody/tr/td[7]/a[2]/i")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
	}
	
  	@BeforeClass
  	public void setUp() {
  		// Cài đặt và cấu hình trình điều khiển Chrome tự động bằng WebDriverManager
  		WebDriverManager.chromedriver().setup();
  		// Khởi tạo một thể hiện của ChromeDriver
  		driver = new ChromeDriver();
  		// Phóng to cửa sổ trình duyệt lên kích thước tối đa
  		driver.manage().window().maximize();
  	}

  	@AfterClass
  	public void tearDown() throws InterruptedException {
  			// Dừng thực thi của chương trình trong 5 giây
  			Thread.sleep(5000);
  			// Đóng trình duyệt và kết thúc phiên làm việc
  			driver.quit();
  	}

}
