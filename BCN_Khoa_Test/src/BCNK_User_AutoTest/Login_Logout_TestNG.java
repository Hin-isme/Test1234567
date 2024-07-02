package BCNK_User_AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Logout_TestNG {
	// Khai báo một biến driver kiểu WebDriver với mức độ truy cập là private
	private WebDriver driver;
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 0
	@Test(priority = 0)
	public void Login() throws InterruptedException {
		// Hiển thị thông báo Login
		System.out.println("Login");
		// Mở trang web https://cntttest.vanlanguni.edu.vn:18081/Phancong02/
		driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/");
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div/div[2]/button[3]")).click();
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/a")).click();
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
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
        // Dừng thực thi của chương trình trong 2 giây
        Thread.sleep(2000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[5]/div/div/div/div/input")).click();
        Thread.sleep(14000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[1]/div/label/input")).click();
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 1
	@Test(priority = 1)
	public void Logout() throws InterruptedException {
		// Hiển thị thông báo Logout
		System.out.println("Logout");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/ul/li[2]/a/span/img")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/ul/li[2]/div/a[2]")).click();
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
